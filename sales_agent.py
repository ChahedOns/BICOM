import pandas as pd
import psycopg2


# Establish a connection to your PostgreSQL database


db_name='dwh',
db_user='postgres',
db_pwd='postgres',
db_host='127.0.0.1',
db_port='5432' 
try:
    conn = psycopg2.connect(f"host={db_host} port={db_port} dbname={db_name} user={db_user} password={db_pwd} ")
    cur = conn.cursor()
    print("Connected to the database!")
    # Perform database operations here
    query = '''SELECT 

    VILLE_CLIENT,
    PAYS_CLIENT,
    SUM(NB_VENTE) AS TotalSales
    FROM 
        DIM_CLIENT 
    JOIN 
        FAIT_VENTE ON DIM_CLIENT.ID_DIM_CLIENT = FAIT_VENTE.ID_DIM_CLIENT
    GROUP BY CUBE ( VILLE_CLIENT, PAYS_CLIENT)
    ORDER BY ( VILLE_CLIENT, PAYS_CLIENT);'''

    # cur.execute(query)

    sales_data = pd.read_sql(query,conn)



    # print(SALES_LOCATIONS_DIM)

    

    # Close the database connection
    conn.close()

    # Display the top 10 selling countries (pays)
    lowest_10_pays = sales_data[sales_data['Pays'] != 'Total'].groupby('Pays')['TotalSales'].sum().nsmallest(10)
    print("lowest 10 Selling Countries (Pays):")
    print(lowest_10_pays)
    print("add more ads")

    # Display the top 10 selling cities (villes)
    lowest_10_villes = sales_data[sales_data['City'] != 'Total'].groupby('City')['TotalSales'].sum().nsmallest(10)
    print("\n lowest 10 Selling Cities (Villes):")
    print(lowest_10_villes)
    print("create promotions")

    # Display the top 10 best-selling products
    top_10_products = sales_data[sales_data['ProductName'] != 'Total'].groupby('ProductName')['TotalSales'].sum().nlargest(10)
    print("\nTop 10 Best-Selling Products:")
    print(top_10_products)
    print("stock more") 

except Exception as e:
    print(f"Error: {e}")




