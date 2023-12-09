// ============================================================================
//
// Copyright (c) 2006-2015, Talend SA
//
// Ce code source a été automatiquement généré par_Talend Open Studio for Data Integration
// / Soumis à la Licence Apache, Version 2.0 (la "Licence") ;
// votre utilisation de ce fichier doit respecter les termes de la Licence.
// Vous pouvez obtenir une copie de la Licence sur
// http://www.apache.org/licenses/LICENSE-2.0
// 
// Sauf lorsqu'explicitement prévu par la loi en vigueur ou accepté par écrit, le logiciel
// distribué sous la Licence est distribué "TEL QUEL",
// SANS GARANTIE OU CONDITION D'AUCUNE SORTE, expresse ou implicite.
// Consultez la Licence pour connaître la terminologie spécifique régissant les autorisations et
// les limites prévues par la Licence.


package k_commerce_reporting.jodstypeclient_0_1;

import routines.Numeric;
import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.StringHandling;
import routines.Relational;
import routines.TalendDate;
import routines.Mathematical;
import routines.system.*;
import routines.system.api.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Comparator;
 




	//the import part of tJava_1
	//import java.util.List;

	//the import part of tJava_2
	//import java.util.List;


@SuppressWarnings("unused")

/**
 * Job: jODSTypeClient Purpose: jODSTypeClient<br>
 * Description: jODSTypeClient <br>
 * @author user@talend.com
 * @version 8.0.1.20211109_1610
 * @status 
 */
public class jODSTypeClient implements TalendJob {

protected static void logIgnoredError(String message, Throwable cause) {
       System.err.println(message);
       if (cause != null) {
               cause.printStackTrace();
       }

}


	public final Object obj = new Object();

	// for transmiting parameters purpose
	private Object valueObject = null;

	public Object getValueObject() {
		return this.valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}
	
	private final static String defaultCharset = java.nio.charset.Charset.defaultCharset().name();

	
	private final static String utf8Charset = "UTF-8";
	//contains type for every context property
	public class PropertiesWithType extends java.util.Properties {
		private static final long serialVersionUID = 1L;
		private java.util.Map<String,String> propertyTypes = new java.util.HashMap<>();
		
		public PropertiesWithType(java.util.Properties properties){
			super(properties);
		}
		public PropertiesWithType(){
			super();
		}
		
		public void setContextType(String key, String type) {
			propertyTypes.put(key,type);
		}
	
		public String getContextType(String key) {
			return propertyTypes.get(key);
		}
	}
	
	// create and load default properties
	private java.util.Properties defaultProps = new java.util.Properties();
	// create application properties with default
	public class ContextProperties extends PropertiesWithType {

		private static final long serialVersionUID = 1L;

		public ContextProperties(java.util.Properties properties){
			super(properties);
		}
		public ContextProperties(){
			super();
		}

		public void synchronizeContext(){
			
			if(database != null){
				
					this.setProperty("database", database.toString());
				
			}
			
			if(password != null){
				
					this.setProperty("password", password.toString());
				
			}
			
			if(port != null){
				
					this.setProperty("port", port.toString());
				
			}
			
			if(serverName != null){
				
					this.setProperty("serverName", serverName.toString());
				
			}
			
			if(additionalParam != null){
				
					this.setProperty("additionalParam", additionalParam.toString());
				
			}
			
			if(schema_PARAM != null){
				
					this.setProperty("schema_PARAM", schema_PARAM.toString());
				
			}
			
			if(user != null){
				
					this.setProperty("user", user.toString());
				
			}
			
			if(schema_ods != null){
				
					this.setProperty("schema_ods", schema_ods.toString());
				
			}
			
		}
		
		//if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if(NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

public String database;
public String getDatabase(){
	return this.database;
}
public java.lang.String password;
public java.lang.String getPassword(){
	return this.password;
}
public String port;
public String getPort(){
	return this.port;
}
public String serverName;
public String getServerName(){
	return this.serverName;
}
public String additionalParam;
public String getAdditionalParam(){
	return this.additionalParam;
}
public String schema_PARAM;
public String getSchema_PARAM(){
	return this.schema_PARAM;
}
public String user;
public String getUser(){
	return this.user;
}
public String schema_ods;
public String getSchema_ods(){
	return this.schema_ods;
}
	}
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "jODSTypeClient";
	private final String projectName = "K_COMMERCE_REPORTING";
	public Integer errorCode = null;
	private String currentComponent = "";
	
		private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
        private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();
	
		private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
		public  final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();
	

private RunStat runStat = new RunStat();

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";
	
	private final static String KEY_DB_DATASOURCES_RAW = "KEY_DB_DATASOURCES_RAW";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(), new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}
	
	public void setDataSourceReferences(List serviceReferences) throws Exception{
		
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		java.util.Map<String, javax.sql.DataSource> dataSources = new java.util.HashMap<String, javax.sql.DataSource>();
		
		for (java.util.Map.Entry<String, javax.sql.DataSource> entry : BundleUtils.getServices(serviceReferences,  javax.sql.DataSource.class).entrySet()) {
                    dataSources.put(entry.getKey(), entry.getValue());
                    talendDataSources.put(entry.getKey(), new routines.system.TalendDataSource(entry.getValue()));
		}

		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}


private final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
private final java.io.PrintStream errorMessagePS = new java.io.PrintStream(new java.io.BufferedOutputStream(baos));

public String getExceptionStackTrace() {
	if ("failure".equals(this.getStatus())) {
		errorMessagePS.flush();
		return baos.toString();
	}
	return null;
}

private Exception exception;

public Exception getException() {
	if ("failure".equals(this.getStatus())) {
		return this.exception;
	}
	return null;
}

private class TalendException extends Exception {

	private static final long serialVersionUID = 1L;

	private java.util.Map<String, Object> globalMap = null;
	private Exception e = null;
	private String currentComponent = null;
	private String virtualComponentName = null;
	
	public void setVirtualComponentName (String virtualComponentName){
		this.virtualComponentName = virtualComponentName;
	}

	private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
		this.currentComponent= errorComponent;
		this.globalMap = globalMap;
		this.e = e;
	}

	public Exception getException() {
		return this.e;
	}

	public String getCurrentComponent() {
		return this.currentComponent;
	}

	
    public String getExceptionCauseMessage(Exception e){
        Throwable cause = e;
        String message = null;
        int i = 10;
        while (null != cause && 0 < i--) {
            message = cause.getMessage();
            if (null == message) {
                cause = cause.getCause();
            } else {
                break;          
            }
        }
        if (null == message) {
            message = e.getClass().getName();
        }   
        return message;
    }

	@Override
	public void printStackTrace() {
		if (!(e instanceof TalendException || e instanceof TDieException)) {
			if(virtualComponentName!=null && currentComponent.indexOf(virtualComponentName+"_")==0){
				globalMap.put(virtualComponentName+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			}
			globalMap.put(currentComponent+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			System.err.println("Exception in component " + currentComponent + " (" + jobName + ")");
		}
		if (!(e instanceof TDieException)) {
			if(e instanceof TalendException){
				e.printStackTrace();
			} else {
				e.printStackTrace();
				e.printStackTrace(errorMessagePS);
				jODSTypeClient.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(jODSTypeClient.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
			}
		} catch (Exception e) {
			this.e.printStackTrace();
		}
		}
	}
}

			public void Implicit_Context_Database_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							Implicit_Context_Context_error(exception, errorComponent, globalMap);
						
						}
					
			public void Implicit_Context_Context_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					Implicit_Context_Database_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPrejob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tChronometerStart_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tChronometerStart_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSetGlobalVar_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSetGlobalVar_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPostjob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPostjob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBCommit_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBCommit_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tChronometerStop_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tChronometerStop_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileList_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
						try {
							
								if(this.execStat){
									runStat.updateStatOnConnection("OnComponentError1", 0, "error");
								}
							
							
								errorCode = null;
								tDie_1Process(globalMap);
								if (!"failure".equals(status)) {
									status = "end";
								}
								

						} catch (Exception e) {
							e.printStackTrace();
						}
						
					tFileList_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDie_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDie_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputDelimited_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFilterRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tUniqRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void Implicit_Context_Database_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPrejob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tChronometerStart_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSetGlobalVar_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJava_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPostjob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBCommit_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tChronometerStop_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJava_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileList_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputDelimited_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	






public static class row_Implicit_Context_DatabaseStruct implements routines.system.IPersistableRow<row_Implicit_Context_DatabaseStruct> {
    final static byte[] commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];
    static byte[] commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];

	
			    public String key;

				public String getKey () {
					return this.key;
				}
				
			    public String value;

				public String getValue () {
					return this.value;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.key = readString(dis);
					
					this.value = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.key = readString(dis);
					
					this.value = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.key,dos);
					
					// String
				
						writeString(this.value,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.key,dos);
					
					// String
				
						writeString(this.value,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("key="+key);
		sb.append(",value="+value);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row_Implicit_Context_DatabaseStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void Implicit_Context_DatabaseProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("Implicit_Context_Database_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
		String currentVirtualComponent = null;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row_Implicit_Context_DatabaseStruct row_Implicit_Context_Database = new row_Implicit_Context_DatabaseStruct();




	
	/**
	 * [Implicit_Context_Context begin ] start
	 */

	

	
		
		ok_Hash.put("Implicit_Context_Context", false);
		start_Hash.put("Implicit_Context_Context", System.currentTimeMillis());
		
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Main");
					}
				
		int tos_count_Implicit_Context_Context = 0;
		
	java.util.List<String> assignList_Implicit_Context_Context = new java.util.ArrayList<String>();
	java.util.List<String> newPropertyList_Implicit_Context_Context = new java.util.ArrayList<String>();
	java.util.List<String> noAssignList_Implicit_Context_Context = new java.util.ArrayList<String>();
	int nb_line_Implicit_Context_Context = 0;

 



/**
 * [Implicit_Context_Context begin ] stop
 */



	
	/**
	 * [Implicit_Context_Database begin ] start
	 */

	

	
		
		ok_Hash.put("Implicit_Context_Database", false);
		start_Hash.put("Implicit_Context_Database", System.currentTimeMillis());
		
	
		currentVirtualComponent = "Implicit_Context_Database";
	
	currentComponent="Implicit_Context_Database";

	
		int tos_count_Implicit_Context_Database = 0;
		
	
    
	
		    int nb_line_Implicit_Context_Database = 0;
		    java.sql.Connection conn_Implicit_Context_Database = null;
				String driverClass_Implicit_Context_Database = "org.postgresql.Driver";
			    java.lang.Class jdbcclazz_Implicit_Context_Database = java.lang.Class.forName(driverClass_Implicit_Context_Database);
				String dbUser_Implicit_Context_Database = context.user;
				
				
	final String decryptedPassword_Implicit_Context_Database = context.password; 
				
				String dbPwd_Implicit_Context_Database = decryptedPassword_Implicit_Context_Database;
				
				String url_Implicit_Context_Database = "jdbc:postgresql://" + context.serverName + ":" + context.port + "/" + context.database + "?" + context.additionalParam;
				
				conn_Implicit_Context_Database = java.sql.DriverManager.getConnection(url_Implicit_Context_Database,dbUser_Implicit_Context_Database,dbPwd_Implicit_Context_Database);
		        
				conn_Implicit_Context_Database.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_Implicit_Context_Database = conn_Implicit_Context_Database.createStatement();

		    String dbquery_Implicit_Context_Database = "SELECT \n  \""+context.schema_PARAM+"\".\"CONTEXTE\".\"key\", \n  \""+context.schema_PARAM+"\".\"CONTEXTE\".\"value\"\nFROM \""+context.schema_PARAM+"\".\"CONTEXTE\"";
		    

            	globalMap.put("Implicit_Context_Database_QUERY",dbquery_Implicit_Context_Database);
		    java.sql.ResultSet rs_Implicit_Context_Database = null;

		    try {
		    	rs_Implicit_Context_Database = stmt_Implicit_Context_Database.executeQuery(dbquery_Implicit_Context_Database);
		    	java.sql.ResultSetMetaData rsmd_Implicit_Context_Database = rs_Implicit_Context_Database.getMetaData();
		    	int colQtyInRs_Implicit_Context_Database = rsmd_Implicit_Context_Database.getColumnCount();

		    String tmpContent_Implicit_Context_Database = null;
		    
		    
		    while (rs_Implicit_Context_Database.next()) {
		        nb_line_Implicit_Context_Database++;
		        
							if(colQtyInRs_Implicit_Context_Database < 1) {
								row_Implicit_Context_Database.key = null;
							} else {
	                         		
        	row_Implicit_Context_Database.key = routines.system.JDBCUtil.getString(rs_Implicit_Context_Database, 1, false);
		                    }
							if(colQtyInRs_Implicit_Context_Database < 2) {
								row_Implicit_Context_Database.value = null;
							} else {
	                         		
        	row_Implicit_Context_Database.value = routines.system.JDBCUtil.getString(rs_Implicit_Context_Database, 2, false);
		                    }
					


 



/**
 * [Implicit_Context_Database begin ] stop
 */
	
	/**
	 * [Implicit_Context_Database main ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Database";
	
	currentComponent="Implicit_Context_Database";

	

 


	tos_count_Implicit_Context_Database++;

/**
 * [Implicit_Context_Database main ] stop
 */
	
	/**
	 * [Implicit_Context_Database process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Database";
	
	currentComponent="Implicit_Context_Database";

	

 



/**
 * [Implicit_Context_Database process_data_begin ] stop
 */

	
	/**
	 * [Implicit_Context_Context main ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Main"
						
						);
					}
					
        //////////////////////////
        String tmp_key_Implicit_Context_Context = null;
                    String key_Implicit_Context_Context = null;
                      if (row_Implicit_Context_Database.key != null){
                          tmp_key_Implicit_Context_Context = row_Implicit_Context_Database.key.trim();
                        if ((tmp_key_Implicit_Context_Context.startsWith("#") || tmp_key_Implicit_Context_Context.startsWith("!") )){
                          tmp_key_Implicit_Context_Context = null;
                        } else {
                          row_Implicit_Context_Database.key = tmp_key_Implicit_Context_Context;
                        }
                      }
                        if(row_Implicit_Context_Database.key != null) {
                    key_Implicit_Context_Context =
                        row_Implicit_Context_Database.key;
                        }
                    String value_Implicit_Context_Context = null;
                        if(row_Implicit_Context_Database.value != null) {
                    value_Implicit_Context_Context =
                        row_Implicit_Context_Database.value;
                        }
				
				String currentValue_Implicit_Context_Context = value_Implicit_Context_Context;
										
						if ((key_Implicit_Context_Context != null) && ("password".equals(key_Implicit_Context_Context)) ) currentValue_Implicit_Context_Context = currentValue_Implicit_Context_Context.replaceAll(".", "*");

  if (tmp_key_Implicit_Context_Context != null){
  try{
        if(key_Implicit_Context_Context!=null && "database".equals(key_Implicit_Context_Context))
        {
           context.database=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "password".equals(key_Implicit_Context_Context))
        {
           context.password=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "port".equals(key_Implicit_Context_Context))
        {
           context.port=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "serverName".equals(key_Implicit_Context_Context))
        {
           context.serverName=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "additionalParam".equals(key_Implicit_Context_Context))
        {
           context.additionalParam=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "schema_PARAM".equals(key_Implicit_Context_Context))
        {
           context.schema_PARAM=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "user".equals(key_Implicit_Context_Context))
        {
           context.user=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "schema_ods".equals(key_Implicit_Context_Context))
        {
           context.schema_ods=value_Implicit_Context_Context;
        }


        if (context.getProperty(key_Implicit_Context_Context)!=null)
        {
            assignList_Implicit_Context_Context.add(key_Implicit_Context_Context);
        }else  {
            newPropertyList_Implicit_Context_Context.add(key_Implicit_Context_Context);
        }
        if(value_Implicit_Context_Context == null){
            context.setProperty(key_Implicit_Context_Context, "");
        }else{
            context.setProperty(key_Implicit_Context_Context,value_Implicit_Context_Context);
        }
    }catch(java.lang.Exception e){
globalMap.put("Implicit_Context_Context_ERROR_MESSAGE",e.getMessage());
        System.err.println("Setting a value for the key \"" + key_Implicit_Context_Context + "\" has failed. Error message: " + e.getMessage());
    }
        nb_line_Implicit_Context_Context++;
    }
        //////////////////////////

 


	tos_count_Implicit_Context_Context++;

/**
 * [Implicit_Context_Context main ] stop
 */
	
	/**
	 * [Implicit_Context_Context process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";

	

 



/**
 * [Implicit_Context_Context process_data_begin ] stop
 */
	
	/**
	 * [Implicit_Context_Context process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";

	

 



/**
 * [Implicit_Context_Context process_data_end ] stop
 */



	
	/**
	 * [Implicit_Context_Database process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Database";
	
	currentComponent="Implicit_Context_Database";

	

 



/**
 * [Implicit_Context_Database process_data_end ] stop
 */
	
	/**
	 * [Implicit_Context_Database end ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Database";
	
	currentComponent="Implicit_Context_Database";

	

	}
}finally{
	if (rs_Implicit_Context_Database != null) {
		rs_Implicit_Context_Database.close();
	}
	if (stmt_Implicit_Context_Database != null) {
		stmt_Implicit_Context_Database.close();
	}
	if(conn_Implicit_Context_Database != null && !conn_Implicit_Context_Database.isClosed()) {
		
			conn_Implicit_Context_Database.commit();
			
		
			conn_Implicit_Context_Database.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	}
	
}
globalMap.put("Implicit_Context_Database_NB_LINE",nb_line_Implicit_Context_Database);
 

ok_Hash.put("Implicit_Context_Database", true);
end_Hash.put("Implicit_Context_Database", System.currentTimeMillis());




/**
 * [Implicit_Context_Database end ] stop
 */

	
	/**
	 * [Implicit_Context_Context end ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";

	
	
	java.util.Enumeration<?> enu_Implicit_Context_Context = context.propertyNames();
    while(enu_Implicit_Context_Context.hasMoreElements())
    {           
    	String key_Implicit_Context_Context = (String)enu_Implicit_Context_Context.nextElement();
        if(!assignList_Implicit_Context_Context.contains(key_Implicit_Context_Context) && !newPropertyList_Implicit_Context_Context.contains(key_Implicit_Context_Context))
        {
            noAssignList_Implicit_Context_Context.add(key_Implicit_Context_Context);
        }          
    }
	for(Object obj_Implicit_Context_Context :noAssignList_Implicit_Context_Context){
		
		System.out.println("Warning: Parameter \"" + obj_Implicit_Context_Context + "\" has not been set by Implicit_Context_Context");
		
	} 

    String newPropertyStr_Implicit_Context_Context = newPropertyList_Implicit_Context_Context.toString();
    String newProperty_Implicit_Context_Context = newPropertyStr_Implicit_Context_Context.substring(1, newPropertyStr_Implicit_Context_Context.length() - 1);
    
    String noAssignStr_Implicit_Context_Context = noAssignList_Implicit_Context_Context.toString();
    String noAssign_Implicit_Context_Context = noAssignStr_Implicit_Context_Context.substring(1, noAssignStr_Implicit_Context_Context.length() - 1);
    
    globalMap.put("Implicit_Context_Context_KEY_NOT_INCONTEXT", newProperty_Implicit_Context_Context);
    globalMap.put("Implicit_Context_Context_KEY_NOT_LOADED", noAssign_Implicit_Context_Context);

    globalMap.put("Implicit_Context_Context_NB_LINE",nb_line_Implicit_Context_Context);

	List<String> parametersToEncrypt_Implicit_Context_Context = new java.util.ArrayList<String>();
	
		parametersToEncrypt_Implicit_Context_Context.add("password");
		
	
	resumeUtil.addLog("NODE", "NODE:Implicit_Context_Context", "", Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt_Implicit_Context_Context));    
    
				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Main");
			  	}
			  	
 

ok_Hash.put("Implicit_Context_Context", true);
end_Hash.put("Implicit_Context_Context", System.currentTimeMillis());




/**
 * [Implicit_Context_Context end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
					te.setVirtualComponentName(currentVirtualComponent);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [Implicit_Context_Database finally ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Database";
	
	currentComponent="Implicit_Context_Database";

	

 



/**
 * [Implicit_Context_Database finally ] stop
 */

	
	/**
	 * [Implicit_Context_Context finally ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";

	

 



/**
 * [Implicit_Context_Context finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("Implicit_Context_Database_SUBPROCESS_STATE", 1);
	}
	

public void tPrejob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPrejob_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tPrejob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPrejob_1", false);
		start_Hash.put("tPrejob_1", System.currentTimeMillis());
		
	
	currentComponent="tPrejob_1";

	
		int tos_count_tPrejob_1 = 0;
		

 



/**
 * [tPrejob_1 begin ] stop
 */
	
	/**
	 * [tPrejob_1 main ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 


	tos_count_tPrejob_1++;

/**
 * [tPrejob_1 main ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 process_data_end ] stop
 */
	
	/**
	 * [tPrejob_1 end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 

ok_Hash.put("tPrejob_1", true);
end_Hash.put("tPrejob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk1", 0, "ok");
				}
				tChronometerStart_1Process(globalMap);



/**
 * [tPrejob_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tPrejob_1 finally ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPrejob_1_SUBPROCESS_STATE", 1);
	}
	

public void tChronometerStart_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tChronometerStart_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tChronometerStart_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tChronometerStart_1", false);
		start_Hash.put("tChronometerStart_1", System.currentTimeMillis());
		
	
	currentComponent="tChronometerStart_1";

	
		int tos_count_tChronometerStart_1 = 0;
		

	
	
	Long currentTimetChronometerStart_1 = System.currentTimeMillis();
	
	globalMap.put("tChronometerStart_1",currentTimetChronometerStart_1);
	globalMap.put("tChronometerStart_1_STARTTIME", currentTimetChronometerStart_1);
 



/**
 * [tChronometerStart_1 begin ] stop
 */
	
	/**
	 * [tChronometerStart_1 main ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 


	tos_count_tChronometerStart_1++;

/**
 * [tChronometerStart_1 main ] stop
 */
	
	/**
	 * [tChronometerStart_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 



/**
 * [tChronometerStart_1 process_data_begin ] stop
 */
	
	/**
	 * [tChronometerStart_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 



/**
 * [tChronometerStart_1 process_data_end ] stop
 */
	
	/**
	 * [tChronometerStart_1 end ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 

ok_Hash.put("tChronometerStart_1", true);
end_Hash.put("tChronometerStart_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
				}
				tDBConnection_1Process(globalMap);



/**
 * [tChronometerStart_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tChronometerStart_1 finally ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 



/**
 * [tChronometerStart_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tChronometerStart_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBConnection_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBConnection_1", false);
		start_Hash.put("tDBConnection_1", System.currentTimeMillis());
		
	
	currentComponent="tDBConnection_1";

	
		int tos_count_tDBConnection_1 = 0;
		


	
            String dbProperties_tDBConnection_1 = context.additionalParam;
            String url_tDBConnection_1 = "jdbc:postgresql://"+context.serverName+":"+context.port+"/"+context.database;
            
            if(dbProperties_tDBConnection_1 != null && !"".equals(dbProperties_tDBConnection_1.trim())) {
                url_tDBConnection_1 = url_tDBConnection_1 + "?" + dbProperties_tDBConnection_1;
            }
	String dbUser_tDBConnection_1 = context.user;
	
	
		
	final String decryptedPassword_tDBConnection_1 = context.password; 
		String dbPwd_tDBConnection_1 = decryptedPassword_tDBConnection_1;
	
	
	java.sql.Connection conn_tDBConnection_1 = null;
	
        java.util.Enumeration<java.sql.Driver> drivers_tDBConnection_1 =  java.sql.DriverManager.getDrivers();
        java.util.Set<String> redShiftDriverNames_tDBConnection_1 = new java.util.HashSet<String>(java.util.Arrays
                .asList("com.amazon.redshift.jdbc.Driver","com.amazon.redshift.jdbc41.Driver","com.amazon.redshift.jdbc42.Driver"));
    while (drivers_tDBConnection_1.hasMoreElements()) {
        java.sql.Driver d_tDBConnection_1 = drivers_tDBConnection_1.nextElement();
        if (redShiftDriverNames_tDBConnection_1.contains(d_tDBConnection_1.getClass().getName())) {
            try {
                java.sql.DriverManager.deregisterDriver(d_tDBConnection_1);
                java.sql.DriverManager.registerDriver(d_tDBConnection_1);
            } catch (java.lang.Exception e_tDBConnection_1) {
globalMap.put("tDBConnection_1_ERROR_MESSAGE",e_tDBConnection_1.getMessage());
                    //do nothing
            }
        }
    }
	
			String sharedConnectionName_tDBConnection_1 = "VENTE_ODS";
			conn_tDBConnection_1 = SharedDBConnection.getDBConnection("org.postgresql.Driver",url_tDBConnection_1,dbUser_tDBConnection_1 , dbPwd_tDBConnection_1 , sharedConnectionName_tDBConnection_1);
			globalMap.put("conn_tDBConnection_1", conn_tDBConnection_1);
	if (null != conn_tDBConnection_1) {
		
			conn_tDBConnection_1.setAutoCommit(false);
	}

	globalMap.put("schema_" + "tDBConnection_1",context.schema_ods);

 



/**
 * [tDBConnection_1 begin ] stop
 */
	
	/**
	 * [tDBConnection_1 main ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 


	tos_count_tDBConnection_1++;

/**
 * [tDBConnection_1 main ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 



/**
 * [tDBConnection_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 



/**
 * [tDBConnection_1 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_1 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 

ok_Hash.put("tDBConnection_1", true);
end_Hash.put("tDBConnection_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
				}
				tSetGlobalVar_1Process(globalMap);



/**
 * [tDBConnection_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBConnection_1 finally ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 



/**
 * [tDBConnection_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 1);
	}
	

public void tSetGlobalVar_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tSetGlobalVar_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tSetGlobalVar_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tSetGlobalVar_1", false);
		start_Hash.put("tSetGlobalVar_1", System.currentTimeMillis());
		
	
	currentComponent="tSetGlobalVar_1";

	
		int tos_count_tSetGlobalVar_1 = 0;
		

 



/**
 * [tSetGlobalVar_1 begin ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 main ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";

	

globalMap.put("masque_fichier", "ICOM_*_TYPE_CLIENT.csv");
globalMap.put("nom_flux", "TYPE_CLIENT");

 


	tos_count_tSetGlobalVar_1++;

/**
 * [tSetGlobalVar_1 main ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";

	

 



/**
 * [tSetGlobalVar_1 process_data_begin ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";

	

 



/**
 * [tSetGlobalVar_1 process_data_end ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 end ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";

	

 

ok_Hash.put("tSetGlobalVar_1", true);
end_Hash.put("tSetGlobalVar_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
				}
				tJava_1Process(globalMap);



/**
 * [tSetGlobalVar_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tSetGlobalVar_1 finally ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";

	

 



/**
 * [tSetGlobalVar_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tSetGlobalVar_1_SUBPROCESS_STATE", 1);
	}
	

public void tJava_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJava_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tJava_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tJava_1", false);
		start_Hash.put("tJava_1", System.currentTimeMillis());
		
	
	currentComponent="tJava_1";

	
		int tos_count_tJava_1 = 0;
		


System.out.println("----------------------------------------");
System.out.println("Début d'exécution du Job"+jobName+"   : "+TalendDate.formatDate("yyyy-MM-dd HH:mm:ss", new java.util.Date(((long)globalMap.get("tChronometerStart_1_STARTTIME")))));
System.out.println("----------------------------------------");
 



/**
 * [tJava_1 begin ] stop
 */
	
	/**
	 * [tJava_1 main ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 


	tos_count_tJava_1++;

/**
 * [tJava_1 main ] stop
 */
	
	/**
	 * [tJava_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 process_data_begin ] stop
 */
	
	/**
	 * [tJava_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 process_data_end ] stop
 */
	
	/**
	 * [tJava_1 end ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 

ok_Hash.put("tJava_1", true);
end_Hash.put("tJava_1", System.currentTimeMillis());




/**
 * [tJava_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tJava_1 finally ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJava_1_SUBPROCESS_STATE", 1);
	}
	

public void tPostjob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPostjob_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tPostjob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPostjob_1", false);
		start_Hash.put("tPostjob_1", System.currentTimeMillis());
		
	
	currentComponent="tPostjob_1";

	
		int tos_count_tPostjob_1 = 0;
		

 



/**
 * [tPostjob_1 begin ] stop
 */
	
	/**
	 * [tPostjob_1 main ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 


	tos_count_tPostjob_1++;

/**
 * [tPostjob_1 main ] stop
 */
	
	/**
	 * [tPostjob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPostjob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 process_data_end ] stop
 */
	
	/**
	 * [tPostjob_1 end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 

ok_Hash.put("tPostjob_1", true);
end_Hash.put("tPostjob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk5", 0, "ok");
				}
				tDBCommit_1Process(globalMap);



/**
 * [tPostjob_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tPostjob_1 finally ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPostjob_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBCommit_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBCommit_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBCommit_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBCommit_1", false);
		start_Hash.put("tDBCommit_1", System.currentTimeMillis());
		
	
	currentComponent="tDBCommit_1";

	
		int tos_count_tDBCommit_1 = 0;
		

 



/**
 * [tDBCommit_1 begin ] stop
 */
	
	/**
	 * [tDBCommit_1 main ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

	java.sql.Connection conn_tDBCommit_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	if(conn_tDBCommit_1 != null && !conn_tDBCommit_1.isClosed())
	{
	
			
			conn_tDBCommit_1.commit();
			
	
	}

 


	tos_count_tDBCommit_1++;

/**
 * [tDBCommit_1 main ] stop
 */
	
	/**
	 * [tDBCommit_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

 



/**
 * [tDBCommit_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBCommit_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

 



/**
 * [tDBCommit_1 process_data_end ] stop
 */
	
	/**
	 * [tDBCommit_1 end ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

 

ok_Hash.put("tDBCommit_1", true);
end_Hash.put("tDBCommit_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk6", 0, "ok");
				}
				tChronometerStop_1Process(globalMap);



/**
 * [tDBCommit_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBCommit_1 finally ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

 



/**
 * [tDBCommit_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBCommit_1_SUBPROCESS_STATE", 1);
	}
	

public void tChronometerStop_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tChronometerStop_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tChronometerStop_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tChronometerStop_1", false);
		start_Hash.put("tChronometerStop_1", System.currentTimeMillis());
		
	
	currentComponent="tChronometerStop_1";

	
		int tos_count_tChronometerStop_1 = 0;
		
	
	long timetChronometerStop_1;
	
		timetChronometerStop_1 = System.currentTimeMillis() - startTime;
		
	   		System.out.print("[ tChronometerStop_1 ]  ");
		
	  	System.out.println("" + "  " + timetChronometerStop_1 + " milliseconds");
	  	 
	
	Long currentTimetChronometerStop_1 = System.currentTimeMillis();
	globalMap.put("tChronometerStop_1", currentTimetChronometerStop_1);
	
	globalMap.put("tChronometerStop_1_STOPTIME", currentTimetChronometerStop_1);
	globalMap.put("tChronometerStop_1_DURATION", timetChronometerStop_1);
 



/**
 * [tChronometerStop_1 begin ] stop
 */
	
	/**
	 * [tChronometerStop_1 main ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 


	tos_count_tChronometerStop_1++;

/**
 * [tChronometerStop_1 main ] stop
 */
	
	/**
	 * [tChronometerStop_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 



/**
 * [tChronometerStop_1 process_data_begin ] stop
 */
	
	/**
	 * [tChronometerStop_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 



/**
 * [tChronometerStop_1 process_data_end ] stop
 */
	
	/**
	 * [tChronometerStop_1 end ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 

ok_Hash.put("tChronometerStop_1", true);
end_Hash.put("tChronometerStop_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk7", 0, "ok");
				}
				tJava_2Process(globalMap);



/**
 * [tChronometerStop_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tChronometerStop_1 finally ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 



/**
 * [tChronometerStop_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tChronometerStop_1_SUBPROCESS_STATE", 1);
	}
	

public void tJava_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJava_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tJava_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tJava_2", false);
		start_Hash.put("tJava_2", System.currentTimeMillis());
		
	
	currentComponent="tJava_2";

	
		int tos_count_tJava_2 = 0;
		



System.out.println("-------------------Fin du JOB !--------------------------------");
 



/**
 * [tJava_2 begin ] stop
 */
	
	/**
	 * [tJava_2 main ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 


	tos_count_tJava_2++;

/**
 * [tJava_2 main ] stop
 */
	
	/**
	 * [tJava_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 



/**
 * [tJava_2 process_data_begin ] stop
 */
	
	/**
	 * [tJava_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 



/**
 * [tJava_2 process_data_end ] stop
 */
	
	/**
	 * [tJava_2 end ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 

ok_Hash.put("tJava_2", true);
end_Hash.put("tJava_2", System.currentTimeMillis());




/**
 * [tJava_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tJava_2 finally ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 



/**
 * [tJava_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJava_2_SUBPROCESS_STATE", 1);
	}
	

public void tFileList_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileList_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tFileList_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileList_1", false);
		start_Hash.put("tFileList_1", System.currentTimeMillis());
		
	
	currentComponent="tFileList_1";

	
		int tos_count_tFileList_1 = 0;
		
	
 
     
    
  String directory_tFileList_1 = "D:/workspace/BI_PROJECT";
  final java.util.List<String> maskList_tFileList_1 = new java.util.ArrayList<String>();
  final java.util.List<java.util.regex.Pattern> patternList_tFileList_1 = new java.util.ArrayList<java.util.regex.Pattern>(); 
    maskList_tFileList_1.add(((String)globalMap.get("masque_fichier")));  
  for (final String filemask_tFileList_1 : maskList_tFileList_1) {
	String filemask_compile_tFileList_1 = filemask_tFileList_1;
	
		filemask_compile_tFileList_1 = org.apache.oro.text.GlobCompiler.globToPerl5(filemask_tFileList_1.toCharArray(), org.apache.oro.text.GlobCompiler.DEFAULT_MASK);
	
		java.util.regex.Pattern fileNamePattern_tFileList_1 = java.util.regex.Pattern.compile(filemask_compile_tFileList_1);
	patternList_tFileList_1.add(fileNamePattern_tFileList_1);
  }
  int NB_FILEtFileList_1 = 0;

  final boolean case_sensitive_tFileList_1 = true;
	
	
	
    final java.util.List<java.io.File> list_tFileList_1 = new java.util.ArrayList<java.io.File>();
    final java.util.Set<String> filePath_tFileList_1 = new java.util.HashSet<String>();
	java.io.File file_tFileList_1 = new java.io.File(directory_tFileList_1);
     
		file_tFileList_1.listFiles(new java.io.FilenameFilter() {
			public boolean accept(java.io.File dir, String name) {
				java.io.File file = new java.io.File(dir, name);
                if (!file.isDirectory()) {
                	
    	String fileName_tFileList_1 = file.getName();
		for (final java.util.regex.Pattern fileNamePattern_tFileList_1 : patternList_tFileList_1) {
          	if (fileNamePattern_tFileList_1.matcher(fileName_tFileList_1).matches()){
					if(!filePath_tFileList_1.contains(file.getAbsolutePath())) {
			          list_tFileList_1.add(file);
			          filePath_tFileList_1.add(file.getAbsolutePath());
			        }
			}
		}
                }
              return true;
            }
          }
      ); 
      java.util.Collections.sort(list_tFileList_1);
    
    for (int i_tFileList_1 = 0; i_tFileList_1 < list_tFileList_1.size(); i_tFileList_1++){
      java.io.File files_tFileList_1 = list_tFileList_1.get(i_tFileList_1);
      String fileName_tFileList_1 = files_tFileList_1.getName();
      
      String currentFileName_tFileList_1 = files_tFileList_1.getName(); 
      String currentFilePath_tFileList_1 = files_tFileList_1.getAbsolutePath();
      String currentFileDirectory_tFileList_1 = files_tFileList_1.getParent();
      String currentFileExtension_tFileList_1 = null;
      
      if (files_tFileList_1.getName().contains(".") && files_tFileList_1.isFile()){
        currentFileExtension_tFileList_1 = files_tFileList_1.getName().substring(files_tFileList_1.getName().lastIndexOf(".") + 1);
      } else{
        currentFileExtension_tFileList_1 = "";
      }
      
      NB_FILEtFileList_1 ++;
      globalMap.put("tFileList_1_CURRENT_FILE", currentFileName_tFileList_1);
      globalMap.put("tFileList_1_CURRENT_FILEPATH", currentFilePath_tFileList_1);
      globalMap.put("tFileList_1_CURRENT_FILEDIRECTORY", currentFileDirectory_tFileList_1);
      globalMap.put("tFileList_1_CURRENT_FILEEXTENSION", currentFileExtension_tFileList_1);
      globalMap.put("tFileList_1_NB_FILE", NB_FILEtFileList_1);
      
 



/**
 * [tFileList_1 begin ] stop
 */
	
	/**
	 * [tFileList_1 main ] start
	 */

	

	
	
	currentComponent="tFileList_1";

	

 


	tos_count_tFileList_1++;

/**
 * [tFileList_1 main ] stop
 */
	
	/**
	 * [tFileList_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileList_1";

	

 



/**
 * [tFileList_1 process_data_begin ] stop
 */
	
	/**
	 * [tFileList_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileList_1";

	

 



/**
 * [tFileList_1 process_data_end ] stop
 */
	
	/**
	 * [tFileList_1 end ] start
	 */

	

	
	
	currentComponent="tFileList_1";

	

  
    }
  globalMap.put("tFileList_1_NB_FILE", NB_FILEtFileList_1);
  

    if (NB_FILEtFileList_1 == 0) throw new RuntimeException("No file found in directory " + directory_tFileList_1);
  
 

 

ok_Hash.put("tFileList_1", true);
end_Hash.put("tFileList_1", System.currentTimeMillis());

   			if (((Integer)globalMap.get("tFileList_1_NB_FILE"))==  1) {
   				
					if(execStat){
   	 					runStat.updateStatOnConnection("If1", 0, "true");
					}
				tFileInputDelimited_1Process(globalMap);
			}

			   
   				else{
					if(execStat){   
   	 					runStat.updateStatOnConnection("If1", 0, "false");
					}   	 
   				}



/**
 * [tFileList_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFileList_1 finally ] start
	 */

	

	
	
	currentComponent="tFileList_1";

	

 



/**
 * [tFileList_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileList_1_SUBPROCESS_STATE", 1);
	}
	

public void tDie_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDie_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDie_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDie_1", false);
		start_Hash.put("tDie_1", System.currentTimeMillis());
		
	
	currentComponent="tDie_1";

	
		int tos_count_tDie_1 = 0;
		

 



/**
 * [tDie_1 begin ] stop
 */
	
	/**
	 * [tDie_1 main ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

	try {
	globalMap.put("tDie_1_DIE_PRIORITY", 5);
	System.err.println("Le répértoire ne contient pas de fichier catégorie");
	
	globalMap.put("tDie_1_DIE_MESSAGE", "Le répértoire ne contient pas de fichier catégorie");
	globalMap.put("tDie_1_DIE_MESSAGES", "Le répértoire ne contient pas de fichier catégorie");
	
	} catch (Exception | Error e_tDie_1) {
	    globalMap.put("tDie_1_ERROR_MESSAGE",e_tDie_1.getMessage());
		logIgnoredError(String.format("tDie_1 - tDie failed to log message due to internal error: %s", e_tDie_1), e_tDie_1);
	}
	
	currentComponent = "tDie_1";
	status = "failure";
        errorCode = new Integer(4);
        globalMap.put("tDie_1_DIE_CODE", errorCode);        
    
	if(true){	
	    throw new TDieException();
	}

 


	tos_count_tDie_1++;

/**
 * [tDie_1 main ] stop
 */
	
	/**
	 * [tDie_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 



/**
 * [tDie_1 process_data_begin ] stop
 */
	
	/**
	 * [tDie_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 



/**
 * [tDie_1 process_data_end ] stop
 */
	
	/**
	 * [tDie_1 end ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 

ok_Hash.put("tDie_1", true);
end_Hash.put("tDie_1", System.currentTimeMillis());




/**
 * [tDie_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDie_1 finally ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 



/**
 * [tDie_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDie_1_SUBPROCESS_STATE", 1);
	}
	


public static class insertRejectStruct implements routines.system.IPersistableRow<insertRejectStruct> {
    final static byte[] commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];
    static byte[] commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String LB_CHEMIN_FICHIER;

				public String getLB_CHEMIN_FICHIER () {
					return this.LB_CHEMIN_FICHIER;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public int NUM_LIGNE_REJET;

				public int getNUM_LIGNE_REJET () {
					return this.NUM_LIGNE_REJET;
				}
				
			    public String LB_LIGNE_REJET;

				public String getLB_LIGNE_REJET () {
					return this.LB_LIGNE_REJET;
				}
				
			    public String LB_MESSAGE_REJET;

				public String getLB_MESSAGE_REJET () {
					return this.LB_MESSAGE_REJET;
				}
				
			    public String LB_NOM_FLUX;

				public String getLB_NOM_FLUX () {
					return this.LB_NOM_FLUX;
				}
				
			    public java.util.Date DT_REJET;

				public java.util.Date getDT_REJET () {
					return this.DT_REJET;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.LB_CHEMIN_FICHIER == null) ? 0 : this.LB_CHEMIN_FICHIER.hashCode());
					
						result = prime * result + ((this.LB_NOM_FICHIER == null) ? 0 : this.LB_NOM_FICHIER.hashCode());
					
							result = prime * result + (int) this.NUM_LIGNE_REJET;
						
						result = prime * result + ((this.LB_LIGNE_REJET == null) ? 0 : this.LB_LIGNE_REJET.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final insertRejectStruct other = (insertRejectStruct) obj;
		
						if (this.LB_CHEMIN_FICHIER == null) {
							if (other.LB_CHEMIN_FICHIER != null)
								return false;
						
						} else if (!this.LB_CHEMIN_FICHIER.equals(other.LB_CHEMIN_FICHIER))
						
							return false;
					
						if (this.LB_NOM_FICHIER == null) {
							if (other.LB_NOM_FICHIER != null)
								return false;
						
						} else if (!this.LB_NOM_FICHIER.equals(other.LB_NOM_FICHIER))
						
							return false;
					
						if (this.NUM_LIGNE_REJET != other.NUM_LIGNE_REJET)
							return false;
					
						if (this.LB_LIGNE_REJET == null) {
							if (other.LB_LIGNE_REJET != null)
								return false;
						
						} else if (!this.LB_LIGNE_REJET.equals(other.LB_LIGNE_REJET))
						
							return false;
					

		return true;
    }

	public void copyDataTo(insertRejectStruct other) {

		other.LB_CHEMIN_FICHIER = this.LB_CHEMIN_FICHIER;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.NUM_LIGNE_REJET = this.NUM_LIGNE_REJET;
	            other.LB_LIGNE_REJET = this.LB_LIGNE_REJET;
	            other.LB_MESSAGE_REJET = this.LB_MESSAGE_REJET;
	            other.LB_NOM_FLUX = this.LB_NOM_FLUX;
	            other.DT_REJET = this.DT_REJET;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(insertRejectStruct other) {

		other.LB_CHEMIN_FICHIER = this.LB_CHEMIN_FICHIER;
	            	other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            	other.NUM_LIGNE_REJET = this.NUM_LIGNE_REJET;
	            	other.LB_LIGNE_REJET = this.LB_LIGNE_REJET;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("LB_CHEMIN_FICHIER="+LB_CHEMIN_FICHIER);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",NUM_LIGNE_REJET="+String.valueOf(NUM_LIGNE_REJET));
		sb.append(",LB_LIGNE_REJET="+LB_LIGNE_REJET);
		sb.append(",LB_MESSAGE_REJET="+LB_MESSAGE_REJET);
		sb.append(",LB_NOM_FLUX="+LB_NOM_FLUX);
		sb.append(",DT_REJET="+String.valueOf(DT_REJET));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(insertRejectStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.LB_CHEMIN_FICHIER, other.LB_CHEMIN_FICHIER);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.LB_NOM_FICHIER, other.LB_NOM_FICHIER);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.NUM_LIGNE_REJET, other.NUM_LIGNE_REJET);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.LB_LIGNE_REJET, other.LB_LIGNE_REJET);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class insertDuplicateStruct implements routines.system.IPersistableRow<insertDuplicateStruct> {
    final static byte[] commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];
    static byte[] commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String LB_CHEMIN_FICHIER;

				public String getLB_CHEMIN_FICHIER () {
					return this.LB_CHEMIN_FICHIER;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public int NUM_LIGNE_REJET;

				public int getNUM_LIGNE_REJET () {
					return this.NUM_LIGNE_REJET;
				}
				
			    public String LB_LIGNE_REJET;

				public String getLB_LIGNE_REJET () {
					return this.LB_LIGNE_REJET;
				}
				
			    public String LB_MESSAGE_REJET;

				public String getLB_MESSAGE_REJET () {
					return this.LB_MESSAGE_REJET;
				}
				
			    public String LB_NOM_FLUX;

				public String getLB_NOM_FLUX () {
					return this.LB_NOM_FLUX;
				}
				
			    public java.util.Date DT_REJET;

				public java.util.Date getDT_REJET () {
					return this.DT_REJET;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.LB_CHEMIN_FICHIER == null) ? 0 : this.LB_CHEMIN_FICHIER.hashCode());
					
						result = prime * result + ((this.LB_NOM_FICHIER == null) ? 0 : this.LB_NOM_FICHIER.hashCode());
					
							result = prime * result + (int) this.NUM_LIGNE_REJET;
						
						result = prime * result + ((this.LB_LIGNE_REJET == null) ? 0 : this.LB_LIGNE_REJET.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final insertDuplicateStruct other = (insertDuplicateStruct) obj;
		
						if (this.LB_CHEMIN_FICHIER == null) {
							if (other.LB_CHEMIN_FICHIER != null)
								return false;
						
						} else if (!this.LB_CHEMIN_FICHIER.equals(other.LB_CHEMIN_FICHIER))
						
							return false;
					
						if (this.LB_NOM_FICHIER == null) {
							if (other.LB_NOM_FICHIER != null)
								return false;
						
						} else if (!this.LB_NOM_FICHIER.equals(other.LB_NOM_FICHIER))
						
							return false;
					
						if (this.NUM_LIGNE_REJET != other.NUM_LIGNE_REJET)
							return false;
					
						if (this.LB_LIGNE_REJET == null) {
							if (other.LB_LIGNE_REJET != null)
								return false;
						
						} else if (!this.LB_LIGNE_REJET.equals(other.LB_LIGNE_REJET))
						
							return false;
					

		return true;
    }

	public void copyDataTo(insertDuplicateStruct other) {

		other.LB_CHEMIN_FICHIER = this.LB_CHEMIN_FICHIER;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.NUM_LIGNE_REJET = this.NUM_LIGNE_REJET;
	            other.LB_LIGNE_REJET = this.LB_LIGNE_REJET;
	            other.LB_MESSAGE_REJET = this.LB_MESSAGE_REJET;
	            other.LB_NOM_FLUX = this.LB_NOM_FLUX;
	            other.DT_REJET = this.DT_REJET;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(insertDuplicateStruct other) {

		other.LB_CHEMIN_FICHIER = this.LB_CHEMIN_FICHIER;
	            	other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            	other.NUM_LIGNE_REJET = this.NUM_LIGNE_REJET;
	            	other.LB_LIGNE_REJET = this.LB_LIGNE_REJET;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("LB_CHEMIN_FICHIER="+LB_CHEMIN_FICHIER);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",NUM_LIGNE_REJET="+String.valueOf(NUM_LIGNE_REJET));
		sb.append(",LB_LIGNE_REJET="+LB_LIGNE_REJET);
		sb.append(",LB_MESSAGE_REJET="+LB_MESSAGE_REJET);
		sb.append(",LB_NOM_FLUX="+LB_NOM_FLUX);
		sb.append(",DT_REJET="+String.valueOf(DT_REJET));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(insertDuplicateStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.LB_CHEMIN_FICHIER, other.LB_CHEMIN_FICHIER);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.LB_NOM_FICHIER, other.LB_NOM_FICHIER);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.NUM_LIGNE_REJET, other.NUM_LIGNE_REJET);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.LB_LIGNE_REJET, other.LB_LIGNE_REJET);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class InsertTypeStruct implements routines.system.IPersistableRow<InsertTypeStruct> {
    final static byte[] commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];
    static byte[] commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];

	
			    public String CD_TYPE_CLIENT;

				public String getCD_TYPE_CLIENT () {
					return this.CD_TYPE_CLIENT;
				}
				
			    public String LB_TYPE_CLIENT;

				public String getLB_TYPE_CLIENT () {
					return this.LB_TYPE_CLIENT;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public int BL_LIGNE_ACTIVE;

				public int getBL_LIGNE_ACTIVE () {
					return this.BL_LIGNE_ACTIVE;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.CD_TYPE_CLIENT = readString(dis);
					
					this.LB_TYPE_CLIENT = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
			        this.BL_LIGNE_ACTIVE = dis.readInt();
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.CD_TYPE_CLIENT = readString(dis);
					
					this.LB_TYPE_CLIENT = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
			        this.BL_LIGNE_ACTIVE = dis.readInt();
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CD_TYPE_CLIENT,dos);
					
					// String
				
						writeString(this.LB_TYPE_CLIENT,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// int
				
		            	dos.writeInt(this.BL_LIGNE_ACTIVE);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CD_TYPE_CLIENT,dos);
					
					// String
				
						writeString(this.LB_TYPE_CLIENT,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// int
				
		            	dos.writeInt(this.BL_LIGNE_ACTIVE);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CD_TYPE_CLIENT="+CD_TYPE_CLIENT);
		sb.append(",LB_TYPE_CLIENT="+LB_TYPE_CLIENT);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",BL_LIGNE_ACTIVE="+String.valueOf(BL_LIGNE_ACTIVE));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(InsertTypeStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class insertTypeClientStruct implements routines.system.IPersistableRow<insertTypeClientStruct> {
    final static byte[] commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];
    static byte[] commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];

	
			    public String CD_TYPE_CLIENT;

				public String getCD_TYPE_CLIENT () {
					return this.CD_TYPE_CLIENT;
				}
				
			    public String LB_TYPE_CLIENT;

				public String getLB_TYPE_CLIENT () {
					return this.LB_TYPE_CLIENT;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public int BL_LIGNE_ACTIVE;

				public int getBL_LIGNE_ACTIVE () {
					return this.BL_LIGNE_ACTIVE;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.CD_TYPE_CLIENT = readString(dis);
					
					this.LB_TYPE_CLIENT = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
			        this.BL_LIGNE_ACTIVE = dis.readInt();
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.CD_TYPE_CLIENT = readString(dis);
					
					this.LB_TYPE_CLIENT = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
			        this.BL_LIGNE_ACTIVE = dis.readInt();
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CD_TYPE_CLIENT,dos);
					
					// String
				
						writeString(this.LB_TYPE_CLIENT,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// int
				
		            	dos.writeInt(this.BL_LIGNE_ACTIVE);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CD_TYPE_CLIENT,dos);
					
					// String
				
						writeString(this.LB_TYPE_CLIENT,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// int
				
		            	dos.writeInt(this.BL_LIGNE_ACTIVE);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CD_TYPE_CLIENT="+CD_TYPE_CLIENT);
		sb.append(",LB_TYPE_CLIENT="+LB_TYPE_CLIENT);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",BL_LIGNE_ACTIVE="+String.valueOf(BL_LIGNE_ACTIVE));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(insertTypeClientStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row3Struct implements routines.system.IPersistableRow<row3Struct> {
    final static byte[] commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];
    static byte[] commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];

	
			    public String CD_TYPE_CLIENT;

				public String getCD_TYPE_CLIENT () {
					return this.CD_TYPE_CLIENT;
				}
				
			    public String LB_TYPE_CLIENT;

				public String getLB_TYPE_CLIENT () {
					return this.LB_TYPE_CLIENT;
				}
				
			    public Integer NUM_LIGNE;

				public Integer getNUM_LIGNE () {
					return this.NUM_LIGNE;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.CD_TYPE_CLIENT = readString(dis);
					
					this.LB_TYPE_CLIENT = readString(dis);
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.CD_TYPE_CLIENT = readString(dis);
					
					this.LB_TYPE_CLIENT = readString(dis);
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CD_TYPE_CLIENT,dos);
					
					// String
				
						writeString(this.LB_TYPE_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CD_TYPE_CLIENT,dos);
					
					// String
				
						writeString(this.LB_TYPE_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CD_TYPE_CLIENT="+CD_TYPE_CLIENT);
		sb.append(",LB_TYPE_CLIENT="+LB_TYPE_CLIENT);
		sb.append(",NUM_LIGNE="+String.valueOf(NUM_LIGNE));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row3Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row6Struct implements routines.system.IPersistableRow<row6Struct> {
    final static byte[] commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];
    static byte[] commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];

	
			    public String CD_TYPE_CLIENT;

				public String getCD_TYPE_CLIENT () {
					return this.CD_TYPE_CLIENT;
				}
				
			    public String LB_TYPE_CLIENT;

				public String getLB_TYPE_CLIENT () {
					return this.LB_TYPE_CLIENT;
				}
				
			    public Integer NUM_LIGNE;

				public Integer getNUM_LIGNE () {
					return this.NUM_LIGNE;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.CD_TYPE_CLIENT = readString(dis);
					
					this.LB_TYPE_CLIENT = readString(dis);
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.CD_TYPE_CLIENT = readString(dis);
					
					this.LB_TYPE_CLIENT = readString(dis);
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CD_TYPE_CLIENT,dos);
					
					// String
				
						writeString(this.LB_TYPE_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CD_TYPE_CLIENT,dos);
					
					// String
				
						writeString(this.LB_TYPE_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CD_TYPE_CLIENT="+CD_TYPE_CLIENT);
		sb.append(",LB_TYPE_CLIENT="+LB_TYPE_CLIENT);
		sb.append(",NUM_LIGNE="+String.valueOf(NUM_LIGNE));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row6Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row2Struct implements routines.system.IPersistableRow<row2Struct> {
    final static byte[] commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];
    static byte[] commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];

	
			    public String CD_TYPE_CLIENT;

				public String getCD_TYPE_CLIENT () {
					return this.CD_TYPE_CLIENT;
				}
				
			    public String LB_TYPE_CLIENT;

				public String getLB_TYPE_CLIENT () {
					return this.LB_TYPE_CLIENT;
				}
				
			    public Integer NUM_LIGNE;

				public Integer getNUM_LIGNE () {
					return this.NUM_LIGNE;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.CD_TYPE_CLIENT = readString(dis);
					
					this.LB_TYPE_CLIENT = readString(dis);
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.CD_TYPE_CLIENT = readString(dis);
					
					this.LB_TYPE_CLIENT = readString(dis);
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CD_TYPE_CLIENT,dos);
					
					// String
				
						writeString(this.LB_TYPE_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CD_TYPE_CLIENT,dos);
					
					// String
				
						writeString(this.LB_TYPE_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CD_TYPE_CLIENT="+CD_TYPE_CLIENT);
		sb.append(",LB_TYPE_CLIENT="+LB_TYPE_CLIENT);
		sb.append(",NUM_LIGNE="+String.valueOf(NUM_LIGNE));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row2Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row5Struct implements routines.system.IPersistableRow<row5Struct> {
    final static byte[] commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];
    static byte[] commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];

	
			    public String CD_TYPE_CLIENT;

				public String getCD_TYPE_CLIENT () {
					return this.CD_TYPE_CLIENT;
				}
				
			    public String LB_TYPE_CLIENT;

				public String getLB_TYPE_CLIENT () {
					return this.LB_TYPE_CLIENT;
				}
				
			    public Integer NUM_LIGNE;

				public Integer getNUM_LIGNE () {
					return this.NUM_LIGNE;
				}
				
			    public String errorMessage;

				public String getErrorMessage () {
					return this.errorMessage;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.CD_TYPE_CLIENT = readString(dis);
					
					this.LB_TYPE_CLIENT = readString(dis);
					
						this.NUM_LIGNE = readInteger(dis);
					
					this.errorMessage = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.CD_TYPE_CLIENT = readString(dis);
					
					this.LB_TYPE_CLIENT = readString(dis);
					
						this.NUM_LIGNE = readInteger(dis);
					
					this.errorMessage = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CD_TYPE_CLIENT,dos);
					
					// String
				
						writeString(this.LB_TYPE_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
					// String
				
						writeString(this.errorMessage,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CD_TYPE_CLIENT,dos);
					
					// String
				
						writeString(this.LB_TYPE_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
					// String
				
						writeString(this.errorMessage,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CD_TYPE_CLIENT="+CD_TYPE_CLIENT);
		sb.append(",LB_TYPE_CLIENT="+LB_TYPE_CLIENT);
		sb.append(",NUM_LIGNE="+String.valueOf(NUM_LIGNE));
		sb.append(",errorMessage="+errorMessage);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row5Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class typeClientStruct implements routines.system.IPersistableRow<typeClientStruct> {
    final static byte[] commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];
    static byte[] commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];

	
			    public String CD_TYPE_CLIENT;

				public String getCD_TYPE_CLIENT () {
					return this.CD_TYPE_CLIENT;
				}
				
			    public String LB_TYPE_CLIENT;

				public String getLB_TYPE_CLIENT () {
					return this.LB_TYPE_CLIENT;
				}
				
			    public Integer NUM_LIGNE;

				public Integer getNUM_LIGNE () {
					return this.NUM_LIGNE;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.CD_TYPE_CLIENT = readString(dis);
					
					this.LB_TYPE_CLIENT = readString(dis);
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.CD_TYPE_CLIENT = readString(dis);
					
					this.LB_TYPE_CLIENT = readString(dis);
					
						this.NUM_LIGNE = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CD_TYPE_CLIENT,dos);
					
					// String
				
						writeString(this.LB_TYPE_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CD_TYPE_CLIENT,dos);
					
					// String
				
						writeString(this.LB_TYPE_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.NUM_LIGNE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CD_TYPE_CLIENT="+CD_TYPE_CLIENT);
		sb.append(",LB_TYPE_CLIENT="+LB_TYPE_CLIENT);
		sb.append(",NUM_LIGNE="+String.valueOf(NUM_LIGNE));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(typeClientStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row1Struct implements routines.system.IPersistableRow<row1Struct> {
    final static byte[] commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];
    static byte[] commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];

	
			    public String CD_TYPE_CLIENT;

				public String getCD_TYPE_CLIENT () {
					return this.CD_TYPE_CLIENT;
				}
				
			    public String LB_TYPE_CLIENT;

				public String getLB_TYPE_CLIENT () {
					return this.LB_TYPE_CLIENT;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.CD_TYPE_CLIENT = readString(dis);
					
					this.LB_TYPE_CLIENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.CD_TYPE_CLIENT = readString(dis);
					
					this.LB_TYPE_CLIENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CD_TYPE_CLIENT,dos);
					
					// String
				
						writeString(this.LB_TYPE_CLIENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CD_TYPE_CLIENT,dos);
					
					// String
				
						writeString(this.LB_TYPE_CLIENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CD_TYPE_CLIENT="+CD_TYPE_CLIENT);
		sb.append(",LB_TYPE_CLIENT="+LB_TYPE_CLIENT);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row1Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class after_tFileInputDelimited_1Struct implements routines.system.IPersistableRow<after_tFileInputDelimited_1Struct> {
    final static byte[] commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];
    static byte[] commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];

	
			    public String CD_TYPE_CLIENT;

				public String getCD_TYPE_CLIENT () {
					return this.CD_TYPE_CLIENT;
				}
				
			    public String LB_TYPE_CLIENT;

				public String getLB_TYPE_CLIENT () {
					return this.LB_TYPE_CLIENT;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.CD_TYPE_CLIENT = readString(dis);
					
					this.LB_TYPE_CLIENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.CD_TYPE_CLIENT = readString(dis);
					
					this.LB_TYPE_CLIENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CD_TYPE_CLIENT,dos);
					
					// String
				
						writeString(this.LB_TYPE_CLIENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CD_TYPE_CLIENT,dos);
					
					// String
				
						writeString(this.LB_TYPE_CLIENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CD_TYPE_CLIENT="+CD_TYPE_CLIENT);
		sb.append(",LB_TYPE_CLIENT="+LB_TYPE_CLIENT);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(after_tFileInputDelimited_1Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tFileInputDelimited_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputDelimited_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;


		tDBInput_1Process(globalMap);

		row1Struct row1 = new row1Struct();
typeClientStruct typeClient = new typeClientStruct();
row2Struct row2 = new row2Struct();
row3Struct row3 = new row3Struct();
InsertTypeStruct InsertType = new InsertTypeStruct();
insertTypeClientStruct insertTypeClient = new insertTypeClientStruct();
row6Struct row6 = new row6Struct();
insertDuplicateStruct insertDuplicate = new insertDuplicateStruct();
row5Struct row5 = new row5Struct();
insertRejectStruct insertReject = new insertRejectStruct();








	
	/**
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"InsertType");
					}
				
		int tos_count_tDBOutput_1 = 0;
		





String dbschema_tDBOutput_1 = null;
	dbschema_tDBOutput_1 = context.schema_ods;
	

String tableName_tDBOutput_1 = null;
if(dbschema_tDBOutput_1 == null || dbschema_tDBOutput_1.trim().length() == 0) {
	tableName_tDBOutput_1 = ("ODS_TYPE_CLIENT");
} else {
	tableName_tDBOutput_1 = dbschema_tDBOutput_1 + "\".\"" + ("ODS_TYPE_CLIENT");
}


int nb_line_tDBOutput_1 = 0;
int nb_line_update_tDBOutput_1 = 0;
int nb_line_inserted_tDBOutput_1 = 0;
int nb_line_deleted_tDBOutput_1 = 0;
int nb_line_rejected_tDBOutput_1 = 0;

int deletedCount_tDBOutput_1=0;
int updatedCount_tDBOutput_1=0;
int insertedCount_tDBOutput_1=0;
int rowsToCommitCount_tDBOutput_1=0;
int rejectedCount_tDBOutput_1=0;

boolean whetherReject_tDBOutput_1 = false;

java.sql.Connection conn_tDBOutput_1 = null;
String dbUser_tDBOutput_1 = null;

	
    java.lang.Class.forName("org.postgresql.Driver");
    
        String url_tDBOutput_1 = "jdbc:postgresql://"+context.serverName+":"+context.port+"/"+context.database + "?" + context.additionalParam;
    dbUser_tDBOutput_1 = context.user;

	final String decryptedPassword_tDBOutput_1 = context.password; 

    String dbPwd_tDBOutput_1 = decryptedPassword_tDBOutput_1;

    conn_tDBOutput_1 = java.sql.DriverManager.getConnection(url_tDBOutput_1,dbUser_tDBOutput_1,dbPwd_tDBOutput_1);
	
	resourceMap.put("conn_tDBOutput_1", conn_tDBOutput_1);
        conn_tDBOutput_1.setAutoCommit(false);
        int commitEvery_tDBOutput_1 = 10000;
        int commitCounter_tDBOutput_1 = 0;


   int batchSize_tDBOutput_1 = 10000;
   int batchSizeCounter_tDBOutput_1=0;

int count_tDBOutput_1=0;
	    String insert_tDBOutput_1 = "INSERT INTO \"" + tableName_tDBOutput_1 + "\" (\"CD_TYPE_CLIENT\",\"LB_TYPE_CLIENT\",\"LB_NOM_FICHIER\",\"DT_INSERTION\",\"BL_LIGNE_ACTIVE\",\"LB_JOB_NAME\") VALUES (?,?,?,?,?,?)";
	    
	    java.sql.PreparedStatement pstmt_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(insert_tDBOutput_1);
	    resourceMap.put("pstmt_tDBOutput_1", pstmt_tDBOutput_1);
	    

 



/**
 * [tDBOutput_1 begin ] stop
 */




	
	/**
	 * [tDBOutput_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_5", false);
		start_Hash.put("tDBOutput_5", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_5";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"insertTypeClient");
					}
				
		int tos_count_tDBOutput_5 = 0;
		





String dbschema_tDBOutput_5 = null;
	dbschema_tDBOutput_5 = context.schema_ods;
	

String tableName_tDBOutput_5 = null;
if(dbschema_tDBOutput_5 == null || dbschema_tDBOutput_5.trim().length() == 0) {
	tableName_tDBOutput_5 = ("ODS_TYPE_CLIENT");
} else {
	tableName_tDBOutput_5 = dbschema_tDBOutput_5 + "\".\"" + ("ODS_TYPE_CLIENT");
}


int nb_line_tDBOutput_5 = 0;
int nb_line_update_tDBOutput_5 = 0;
int nb_line_inserted_tDBOutput_5 = 0;
int nb_line_deleted_tDBOutput_5 = 0;
int nb_line_rejected_tDBOutput_5 = 0;

int deletedCount_tDBOutput_5=0;
int updatedCount_tDBOutput_5=0;
int insertedCount_tDBOutput_5=0;
int rowsToCommitCount_tDBOutput_5=0;
int rejectedCount_tDBOutput_5=0;

boolean whetherReject_tDBOutput_5 = false;

java.sql.Connection conn_tDBOutput_5 = null;
String dbUser_tDBOutput_5 = null;

	
    java.lang.Class.forName("org.postgresql.Driver");
    
        String url_tDBOutput_5 = "jdbc:postgresql://"+context.serverName+":"+context.port+"/"+context.database + "?" + context.additionalParam;
    dbUser_tDBOutput_5 = context.user;

	final String decryptedPassword_tDBOutput_5 = context.password; 

    String dbPwd_tDBOutput_5 = decryptedPassword_tDBOutput_5;

    conn_tDBOutput_5 = java.sql.DriverManager.getConnection(url_tDBOutput_5,dbUser_tDBOutput_5,dbPwd_tDBOutput_5);
	
	resourceMap.put("conn_tDBOutput_5", conn_tDBOutput_5);
        conn_tDBOutput_5.setAutoCommit(false);
        int commitEvery_tDBOutput_5 = 10000;
        int commitCounter_tDBOutput_5 = 0;


   int batchSize_tDBOutput_5 = 10000;
   int batchSizeCounter_tDBOutput_5=0;

int count_tDBOutput_5=0;
	    String insert_tDBOutput_5 = "INSERT INTO \"" + tableName_tDBOutput_5 + "\" (\"CD_TYPE_CLIENT\",\"LB_TYPE_CLIENT\",\"LB_NOM_FICHIER\",\"DT_INSERTION\",\"BL_LIGNE_ACTIVE\",\"LB_JOB_NAME\") VALUES (?,?,?,?,?,?)";
	    
	    java.sql.PreparedStatement pstmt_tDBOutput_5 = conn_tDBOutput_5.prepareStatement(insert_tDBOutput_5);
	    resourceMap.put("pstmt_tDBOutput_5", pstmt_tDBOutput_5);
	    

 



/**
 * [tDBOutput_5 begin ] stop
 */



	
	/**
	 * [tMap_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_4", false);
		start_Hash.put("tMap_4", System.currentTimeMillis());
		
	
	currentComponent="tMap_4";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row3");
					}
				
		int tos_count_tMap_4 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct> tHash_Lookup_row4 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct>) 
					globalMap.get( "tHash_Lookup_row4" ))
					;					
					
	

row4Struct row4HashKey = new row4Struct();
row4Struct row4Default = new row4Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_4__Struct  {
}
Var__tMap_4__Struct Var__tMap_4 = new Var__tMap_4__Struct();
// ###############################

// ###############################
// # Outputs initialization
InsertTypeStruct InsertType_tmp = new InsertTypeStruct();
insertTypeClientStruct insertTypeClient_tmp = new insertTypeClientStruct();
// ###############################

        
        



        









 



/**
 * [tMap_4 begin ] stop
 */





	
	/**
	 * [tDBOutput_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_4", false);
		start_Hash.put("tDBOutput_4", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_4";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"insertDuplicate");
					}
				
		int tos_count_tDBOutput_4 = 0;
		





String dbschema_tDBOutput_4 = null;
	dbschema_tDBOutput_4 = (String)globalMap.get("schema_" + "tDBConnection_1");
	

String tableName_tDBOutput_4 = null;
if(dbschema_tDBOutput_4 == null || dbschema_tDBOutput_4.trim().length() == 0) {
	tableName_tDBOutput_4 = ("ODS_REJET");
} else {
	tableName_tDBOutput_4 = dbschema_tDBOutput_4 + "\".\"" + ("ODS_REJET");
}

        int updateKeyCount_tDBOutput_4 = 4;
        if(updateKeyCount_tDBOutput_4 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_4 == 8 && true) {
                    System.err.println("For update, every Schema column can not be a key");
        }

int nb_line_tDBOutput_4 = 0;
int nb_line_update_tDBOutput_4 = 0;
int nb_line_inserted_tDBOutput_4 = 0;
int nb_line_deleted_tDBOutput_4 = 0;
int nb_line_rejected_tDBOutput_4 = 0;

int deletedCount_tDBOutput_4=0;
int updatedCount_tDBOutput_4=0;
int insertedCount_tDBOutput_4=0;
int rowsToCommitCount_tDBOutput_4=0;
int rejectedCount_tDBOutput_4=0;

boolean whetherReject_tDBOutput_4 = false;

java.sql.Connection conn_tDBOutput_4 = null;
String dbUser_tDBOutput_4 = null;

	conn_tDBOutput_4 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	
	



int count_tDBOutput_4=0;
	    java.sql.PreparedStatement pstmt_tDBOutput_4 = conn_tDBOutput_4.prepareStatement("SELECT COUNT(1) FROM \"" + tableName_tDBOutput_4 + "\" WHERE \"LB_CHEMIN_FICHIER\" = ? AND \"LB_NOM_FICHIER\" = ? AND \"NUM_LIGNE_REJET\" = ? AND \"LB_LIGNE_REJET\" = ?");
	    resourceMap.put("pstmt_tDBOutput_4", pstmt_tDBOutput_4);
	    String insert_tDBOutput_4 = "INSERT INTO \"" + tableName_tDBOutput_4 + "\" (\"LB_CHEMIN_FICHIER\",\"LB_NOM_FICHIER\",\"NUM_LIGNE_REJET\",\"LB_LIGNE_REJET\",\"LB_MESSAGE_REJET\",\"LB_NOM_FLUX\",\"DT_REJET\",\"LB_JOB_NAME\") VALUES (?,?,?,?,?,?,?,?)";
	    java.sql.PreparedStatement pstmtInsert_tDBOutput_4 = conn_tDBOutput_4.prepareStatement(insert_tDBOutput_4);
	    resourceMap.put("pstmtInsert_tDBOutput_4", pstmtInsert_tDBOutput_4);
	    String update_tDBOutput_4 = "UPDATE \"" + tableName_tDBOutput_4 + "\" SET \"LB_MESSAGE_REJET\" = ?,\"LB_NOM_FLUX\" = ?,\"DT_REJET\" = ?,\"LB_JOB_NAME\" = ? WHERE \"LB_CHEMIN_FICHIER\" = ? AND \"LB_NOM_FICHIER\" = ? AND \"NUM_LIGNE_REJET\" = ? AND \"LB_LIGNE_REJET\" = ?";
	    java.sql.PreparedStatement pstmtUpdate_tDBOutput_4 = conn_tDBOutput_4.prepareStatement(update_tDBOutput_4);
	    resourceMap.put("pstmtUpdate_tDBOutput_4", pstmtUpdate_tDBOutput_4);
	    

 



/**
 * [tDBOutput_4 begin ] stop
 */



	
	/**
	 * [tMap_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_3", false);
		start_Hash.put("tMap_3", System.currentTimeMillis());
		
	
	currentComponent="tMap_3";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row6");
					}
				
		int tos_count_tMap_3 = 0;
		




// ###############################
// # Lookup's keys initialization
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_3__Struct  {
}
Var__tMap_3__Struct Var__tMap_3 = new Var__tMap_3__Struct();
// ###############################

// ###############################
// # Outputs initialization
insertDuplicateStruct insertDuplicate_tmp = new insertDuplicateStruct();
// ###############################

        
        



        









 



/**
 * [tMap_3 begin ] stop
 */



	
	/**
	 * [tUniqRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tUniqRow_1", false);
		start_Hash.put("tUniqRow_1", System.currentTimeMillis());
		
	
	currentComponent="tUniqRow_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row2");
					}
				
		int tos_count_tUniqRow_1 = 0;
		

	
		class KeyStruct_tUniqRow_1 {
	
			private static final int DEFAULT_HASHCODE = 1;
		    private static final int PRIME = 31;
		    private int hashCode = DEFAULT_HASHCODE;
		    public boolean hashCodeDirty = true;
	
	        
					String CD_TYPE_CLIENT;        
	        
		    @Override
			public int hashCode() {
				if (this.hashCodeDirty) {
					final int prime = PRIME;
					int result = DEFAULT_HASHCODE;
			
								result = prime * result + ((this.CD_TYPE_CLIENT == null) ? 0 : this.CD_TYPE_CLIENT.hashCode());
								
		    		this.hashCode = result;
		    		this.hashCodeDirty = false;		
				}
				return this.hashCode;
			}
			
			@Override
			public boolean equals(Object obj) {
				if (this == obj) return true;
				if (obj == null) return false;
				if (getClass() != obj.getClass()) return false;
				final KeyStruct_tUniqRow_1 other = (KeyStruct_tUniqRow_1) obj;
				
									if (this.CD_TYPE_CLIENT == null) {
										if (other.CD_TYPE_CLIENT != null) 
											return false;
								
									} else if (!this.CD_TYPE_CLIENT.equals(other.CD_TYPE_CLIENT))
								 
										return false;
								
				
				return true;
			}
	  
	        
		}

	
int nb_uniques_tUniqRow_1 = 0;
int nb_duplicates_tUniqRow_1 = 0;
KeyStruct_tUniqRow_1 finder_tUniqRow_1 = new KeyStruct_tUniqRow_1();
java.util.Set<KeyStruct_tUniqRow_1> keystUniqRow_1 = new java.util.HashSet<KeyStruct_tUniqRow_1>(); 

 



/**
 * [tUniqRow_1 begin ] stop
 */





	
	/**
	 * [tDBOutput_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_3", false);
		start_Hash.put("tDBOutput_3", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_3";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"insertReject");
					}
				
		int tos_count_tDBOutput_3 = 0;
		





String dbschema_tDBOutput_3 = null;
	dbschema_tDBOutput_3 = (String)globalMap.get("schema_" + "tDBConnection_1");
	

String tableName_tDBOutput_3 = null;
if(dbschema_tDBOutput_3 == null || dbschema_tDBOutput_3.trim().length() == 0) {
	tableName_tDBOutput_3 = ("ODS_REJET");
} else {
	tableName_tDBOutput_3 = dbschema_tDBOutput_3 + "\".\"" + ("ODS_REJET");
}

        int updateKeyCount_tDBOutput_3 = 4;
        if(updateKeyCount_tDBOutput_3 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_3 == 8 && true) {
                    System.err.println("For update, every Schema column can not be a key");
        }

int nb_line_tDBOutput_3 = 0;
int nb_line_update_tDBOutput_3 = 0;
int nb_line_inserted_tDBOutput_3 = 0;
int nb_line_deleted_tDBOutput_3 = 0;
int nb_line_rejected_tDBOutput_3 = 0;

int deletedCount_tDBOutput_3=0;
int updatedCount_tDBOutput_3=0;
int insertedCount_tDBOutput_3=0;
int rowsToCommitCount_tDBOutput_3=0;
int rejectedCount_tDBOutput_3=0;

boolean whetherReject_tDBOutput_3 = false;

java.sql.Connection conn_tDBOutput_3 = null;
String dbUser_tDBOutput_3 = null;

	conn_tDBOutput_3 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	
	



int count_tDBOutput_3=0;
	    java.sql.PreparedStatement pstmt_tDBOutput_3 = conn_tDBOutput_3.prepareStatement("SELECT COUNT(1) FROM \"" + tableName_tDBOutput_3 + "\" WHERE \"LB_CHEMIN_FICHIER\" = ? AND \"LB_NOM_FICHIER\" = ? AND \"NUM_LIGNE_REJET\" = ? AND \"LB_LIGNE_REJET\" = ?");
	    resourceMap.put("pstmt_tDBOutput_3", pstmt_tDBOutput_3);
	    String insert_tDBOutput_3 = "INSERT INTO \"" + tableName_tDBOutput_3 + "\" (\"LB_CHEMIN_FICHIER\",\"LB_NOM_FICHIER\",\"NUM_LIGNE_REJET\",\"LB_LIGNE_REJET\",\"LB_MESSAGE_REJET\",\"LB_NOM_FLUX\",\"DT_REJET\",\"LB_JOB_NAME\") VALUES (?,?,?,?,?,?,?,?)";
	    java.sql.PreparedStatement pstmtInsert_tDBOutput_3 = conn_tDBOutput_3.prepareStatement(insert_tDBOutput_3);
	    resourceMap.put("pstmtInsert_tDBOutput_3", pstmtInsert_tDBOutput_3);
	    String update_tDBOutput_3 = "UPDATE \"" + tableName_tDBOutput_3 + "\" SET \"LB_MESSAGE_REJET\" = ?,\"LB_NOM_FLUX\" = ?,\"DT_REJET\" = ?,\"LB_JOB_NAME\" = ? WHERE \"LB_CHEMIN_FICHIER\" = ? AND \"LB_NOM_FICHIER\" = ? AND \"NUM_LIGNE_REJET\" = ? AND \"LB_LIGNE_REJET\" = ?";
	    java.sql.PreparedStatement pstmtUpdate_tDBOutput_3 = conn_tDBOutput_3.prepareStatement(update_tDBOutput_3);
	    resourceMap.put("pstmtUpdate_tDBOutput_3", pstmtUpdate_tDBOutput_3);
	    

 



/**
 * [tDBOutput_3 begin ] stop
 */



	
	/**
	 * [tMap_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_1", false);
		start_Hash.put("tMap_1", System.currentTimeMillis());
		
	
	currentComponent="tMap_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row5");
					}
				
		int tos_count_tMap_1 = 0;
		




// ###############################
// # Lookup's keys initialization
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_1__Struct  {
}
Var__tMap_1__Struct Var__tMap_1 = new Var__tMap_1__Struct();
// ###############################

// ###############################
// # Outputs initialization
insertRejectStruct insertReject_tmp = new insertRejectStruct();
// ###############################

        
        



        









 



/**
 * [tMap_1 begin ] stop
 */



	
	/**
	 * [tFilterRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFilterRow_1", false);
		start_Hash.put("tFilterRow_1", System.currentTimeMillis());
		
	
	currentComponent="tFilterRow_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"typeClient");
					}
				
		int tos_count_tFilterRow_1 = 0;
		
    int nb_line_tFilterRow_1 = 0;
    int nb_line_ok_tFilterRow_1 = 0;
    int nb_line_reject_tFilterRow_1 = 0;

    class Operator_tFilterRow_1 {
      private String sErrorMsg = "";
      private boolean bMatchFlag = true;
      private String sUnionFlag = "&&";

      public Operator_tFilterRow_1(String unionFlag){
        sUnionFlag = unionFlag;
        bMatchFlag =  "||".equals(unionFlag) ? false : true;
      }

      public String getErrorMsg() {
        if (sErrorMsg != null && sErrorMsg.length() > 1)
          return sErrorMsg.substring(1);
        else 
          return null;
      }

      public boolean getMatchFlag() {
        return bMatchFlag;
      }

      public void matches(boolean partMatched, String reason) {
        // no need to care about the next judgement
        if ("||".equals(sUnionFlag) && bMatchFlag){
          return;
        }

        if (!partMatched) {
          sErrorMsg += "|" + reason;
        }

        if ("||".equals(sUnionFlag))
          bMatchFlag = bMatchFlag || partMatched;
        else
          bMatchFlag = bMatchFlag && partMatched;
      }
    }

 



/**
 * [tFilterRow_1 begin ] stop
 */



	
	/**
	 * [tMap_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_2", false);
		start_Hash.put("tMap_2", System.currentTimeMillis());
		
	
	currentComponent="tMap_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row1");
					}
				
		int tos_count_tMap_2 = 0;
		




// ###############################
// # Lookup's keys initialization
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_2__Struct  {
}
Var__tMap_2__Struct Var__tMap_2 = new Var__tMap_2__Struct();
// ###############################

// ###############################
// # Outputs initialization
typeClientStruct typeClient_tmp = new typeClientStruct();
// ###############################

        
        



        









 



/**
 * [tMap_2 begin ] stop
 */



	
	/**
	 * [tFileInputDelimited_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputDelimited_1", false);
		start_Hash.put("tFileInputDelimited_1", System.currentTimeMillis());
		
	
	currentComponent="tFileInputDelimited_1";

	
		int tos_count_tFileInputDelimited_1 = 0;
		
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_1 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_1 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_1 = null;
				int limit_tFileInputDelimited_1 = -1;
				try{
					
						Object filename_tFileInputDelimited_1 = ((String)globalMap.get("tFileList_1_CURRENT_FILEPATH"));
						if(filename_tFileInputDelimited_1 instanceof java.io.InputStream){
							
			int footer_value_tFileInputDelimited_1 = 0, random_value_tFileInputDelimited_1 = -1;
			if(footer_value_tFileInputDelimited_1 >0 || random_value_tFileInputDelimited_1 > 0){
				throw new java.lang.Exception("When the input source is a stream,footer and random shouldn't be bigger than 0.");				
			}
		
						}
						try {
							fid_tFileInputDelimited_1 = new org.talend.fileprocess.FileInputDelimited(((String)globalMap.get("tFileList_1_CURRENT_FILEPATH")), "UTF-8","|","\n",true,1,0,
									limit_tFileInputDelimited_1
								,-1, false);
						} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",e.getMessage());
							
								
								System.err.println(e.getMessage());
							
						}
					
				    
					while (fid_tFileInputDelimited_1!=null && fid_tFileInputDelimited_1.nextRecord()) {
						rowstate_tFileInputDelimited_1.reset();
						
			    						row1 = null;			
												
									boolean whetherReject_tFileInputDelimited_1 = false;
									row1 = new row1Struct();
									try {
										
				int columnIndexWithD_tFileInputDelimited_1 = 0;
				
					columnIndexWithD_tFileInputDelimited_1 = 0;
					
							row1.CD_TYPE_CLIENT = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 1;
					
							row1.LB_TYPE_CLIENT = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
				
										
										if(rowstate_tFileInputDelimited_1.getException()!=null) {
											throw rowstate_tFileInputDelimited_1.getException();
										}
										
										
							
			    					} catch (java.lang.Exception e) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",e.getMessage());
			        					whetherReject_tFileInputDelimited_1 = true;
			        					
			                					System.err.println(e.getMessage());
			                					row1 = null;
			                				
										
			    					}
								

 



/**
 * [tFileInputDelimited_1 begin ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 main ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 


	tos_count_tFileInputDelimited_1++;

/**
 * [tFileInputDelimited_1 main ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 



/**
 * [tFileInputDelimited_1 process_data_begin ] stop
 */
// Start of branch "row1"
if(row1 != null) { 
			row5 = null;



	
	/**
	 * [tMap_2 main ] start
	 */

	

	
	
	currentComponent="tMap_2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row1"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_2 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_2 = false;
		  boolean mainRowRejected_tMap_2 = false;
            				    								  
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_2__Struct Var = Var__tMap_2;// ###############################
        // ###############################
        // # Output tables

typeClient = null;


// # Output table : 'typeClient'
typeClient_tmp.CD_TYPE_CLIENT = row1.CD_TYPE_CLIENT ;
typeClient_tmp.LB_TYPE_CLIENT = row1.LB_TYPE_CLIENT ;
typeClient_tmp.NUM_LIGNE = Numeric.sequence("s1",1,1) ;
typeClient = typeClient_tmp;
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_2 = false;










 


	tos_count_tMap_2++;

/**
 * [tMap_2 main ] stop
 */
	
	/**
	 * [tMap_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 process_data_begin ] stop
 */
// Start of branch "typeClient"
if(typeClient != null) { 
			row5 = null;



	
	/**
	 * [tFilterRow_1 main ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"typeClient"
						
						);
					}
					

          row5 = null;
          row2 = null;
    Operator_tFilterRow_1 ope_tFilterRow_1 = new Operator_tFilterRow_1("&&");
      ope_tFilterRow_1.matches((// code sample : use typeClient to define the condition.
// typeClient.columnName1.equals("foo") ||!(typeClient.columnName2.equals("bar"))
// replace the following expression by your own filter condition 
!typeClient.CD_TYPE_CLIENT.isEmpty()&& !typeClient.LB_TYPE_CLIENT.isEmpty()
			), "advanced condition failed");
    
    if (ope_tFilterRow_1.getMatchFlag()) {
              if(row2 == null){ 
                row2 = new row2Struct();
              }
               row2.CD_TYPE_CLIENT = typeClient.CD_TYPE_CLIENT;
               row2.LB_TYPE_CLIENT = typeClient.LB_TYPE_CLIENT;
               row2.NUM_LIGNE = typeClient.NUM_LIGNE;    
      nb_line_ok_tFilterRow_1++;
    } else {
            if (row5 == null){
              row5 = new row5Struct();
            }
                row5.CD_TYPE_CLIENT = typeClient.CD_TYPE_CLIENT;
                row5.LB_TYPE_CLIENT = typeClient.LB_TYPE_CLIENT;
                row5.NUM_LIGNE = typeClient.NUM_LIGNE;
	            row5.errorMessage = ope_tFilterRow_1.getErrorMsg();
      nb_line_reject_tFilterRow_1++;
    }

nb_line_tFilterRow_1++;

 


	tos_count_tFilterRow_1++;

/**
 * [tFilterRow_1 main ] stop
 */
	
	/**
	 * [tFilterRow_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	

 



/**
 * [tFilterRow_1 process_data_begin ] stop
 */
// Start of branch "row2"
if(row2 != null) { 



	
	/**
	 * [tUniqRow_1 main ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row2"
						
						);
					}
					
row6 = null;			row3 = null;			
if(row2.CD_TYPE_CLIENT == null){
	finder_tUniqRow_1.CD_TYPE_CLIENT = null;
}else{
	finder_tUniqRow_1.CD_TYPE_CLIENT = row2.CD_TYPE_CLIENT.toLowerCase();
}	
finder_tUniqRow_1.hashCodeDirty = true;
if (!keystUniqRow_1.contains(finder_tUniqRow_1)) {
		KeyStruct_tUniqRow_1 new_tUniqRow_1 = new KeyStruct_tUniqRow_1();

		
if(row2.CD_TYPE_CLIENT == null){
	new_tUniqRow_1.CD_TYPE_CLIENT = null;
}else{
	new_tUniqRow_1.CD_TYPE_CLIENT = row2.CD_TYPE_CLIENT.toLowerCase();
}
		
		keystUniqRow_1.add(new_tUniqRow_1);if(row3 == null){ 
	
	row3 = new row3Struct();
}row3.CD_TYPE_CLIENT = row2.CD_TYPE_CLIENT;			row3.LB_TYPE_CLIENT = row2.LB_TYPE_CLIENT;			row3.NUM_LIGNE = row2.NUM_LIGNE;					
		nb_uniques_tUniqRow_1++;
	} else {
if(row6 == null){ 
	
	row6 = new row6Struct();
}				row6.CD_TYPE_CLIENT = row2.CD_TYPE_CLIENT;			row6.LB_TYPE_CLIENT = row2.LB_TYPE_CLIENT;			row6.NUM_LIGNE = row2.NUM_LIGNE;			
	  nb_duplicates_tUniqRow_1++;
	}

 


	tos_count_tUniqRow_1++;

/**
 * [tUniqRow_1 main ] stop
 */
	
	/**
	 * [tUniqRow_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";

	

 



/**
 * [tUniqRow_1 process_data_begin ] stop
 */
// Start of branch "row3"
if(row3 != null) { 



	
	/**
	 * [tMap_4 main ] start
	 */

	

	
	
	currentComponent="tMap_4";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row3"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_4 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_4 = false;
		  boolean mainRowRejected_tMap_4 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row4" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow4 = false;
       		  	    	
       		  	    	
 							row4Struct row4ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_4) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_4 = false;
								
                        		    		    row4HashKey.CD_TYPE_CLIENT = row3.CD_TYPE_CLIENT ;
                        		    		

								
		                        	row4HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row4.lookup( row4HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row4.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_4 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row4 != null && tHash_Lookup_row4.getCount(row4HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row4' and it contains more one result from keys :  row4.CD_TYPE_CLIENT = '" + row4HashKey.CD_TYPE_CLIENT + "'");
								} // G 071
							

							row4Struct row4 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row4Struct fromLookup_row4 = null;
							row4 = row4Default;
										 
							
								 
							
							
								if (tHash_Lookup_row4 !=null && tHash_Lookup_row4.hasNext()) { // G 099
								
							
								
								fromLookup_row4 = tHash_Lookup_row4.next();

							
							
								} // G 099
							
							

							if(fromLookup_row4 != null) {
								row4 = fromLookup_row4;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_4__Struct Var = Var__tMap_4;// ###############################
        // ###############################
        // # Output tables

insertTypeClient = null;
InsertType = null;

if(!rejectedInnerJoin_tMap_4 ) {

// # Output table : 'insertTypeClient'
// # Filter conditions 
if( 

!  row4.LB_TYPE_CLIENT .equals(  row3.LB_TYPE_CLIENT) 

 ) {
insertTypeClient_tmp.CD_TYPE_CLIENT = row3.CD_TYPE_CLIENT ;
insertTypeClient_tmp.LB_TYPE_CLIENT = row3.LB_TYPE_CLIENT ;
insertTypeClient_tmp.LB_NOM_FICHIER = ((String)globalMap.get("tFileList_1_CURRENT_FILE"));
insertTypeClient_tmp.DT_INSERTION = TalendDate.getCurrentDate();
insertTypeClient_tmp.BL_LIGNE_ACTIVE = 1;
insertTypeClient_tmp.LB_JOB_NAME = jobName;
insertTypeClient = insertTypeClient_tmp;
} // closing filter/reject
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'InsertType'
// # Filter conditions 
if( rejectedInnerJoin_tMap_4 ) {
InsertType_tmp.CD_TYPE_CLIENT = row3.CD_TYPE_CLIENT ;
InsertType_tmp.LB_TYPE_CLIENT = row3.LB_TYPE_CLIENT ;
InsertType_tmp.LB_NOM_FICHIER = ((String)globalMap.get("tFileList_1_CURRENT_FILE"));
InsertType_tmp.DT_INSERTION = TalendDate.getCurrentDate();
InsertType_tmp.BL_LIGNE_ACTIVE = 1;
InsertType_tmp.LB_JOB_NAME = jobName;
InsertType = InsertType_tmp;
} // closing filter/reject
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_4 = false;










 


	tos_count_tMap_4++;

/**
 * [tMap_4 main ] stop
 */
	
	/**
	 * [tMap_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 process_data_begin ] stop
 */
// Start of branch "InsertType"
if(InsertType != null) { 



	
	/**
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"InsertType"
						
						);
					}
					



        whetherReject_tDBOutput_1 = false;
                    if(InsertType.CD_TYPE_CLIENT == null) {
pstmt_tDBOutput_1.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(1, InsertType.CD_TYPE_CLIENT);
}

                    if(InsertType.LB_TYPE_CLIENT == null) {
pstmt_tDBOutput_1.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(2, InsertType.LB_TYPE_CLIENT);
}

                    if(InsertType.LB_NOM_FICHIER == null) {
pstmt_tDBOutput_1.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(3, InsertType.LB_NOM_FICHIER);
}

                    if(InsertType.DT_INSERTION != null) {
pstmt_tDBOutput_1.setTimestamp(4, new java.sql.Timestamp(InsertType.DT_INSERTION.getTime()));
} else {
pstmt_tDBOutput_1.setNull(4, java.sql.Types.TIMESTAMP);
}

                    pstmt_tDBOutput_1.setInt(5, InsertType.BL_LIGNE_ACTIVE);

                    if(InsertType.LB_JOB_NAME == null) {
pstmt_tDBOutput_1.setNull(6, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(6, InsertType.LB_JOB_NAME);
}

			
    		pstmt_tDBOutput_1.addBatch();
    		nb_line_tDBOutput_1++;
    		  
    		  
    		  batchSizeCounter_tDBOutput_1++;
    		  
    			if ((batchSize_tDBOutput_1 > 0) && (batchSize_tDBOutput_1 <= batchSizeCounter_tDBOutput_1)) {
                try {
						int countSum_tDBOutput_1 = 0;
						    
						for(int countEach_tDBOutput_1: pstmt_tDBOutput_1.executeBatch()) {
							countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
						}
				    	rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
				    	
				    		insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
				    	
            	    	batchSizeCounter_tDBOutput_1 = 0;
                }catch (java.sql.BatchUpdateException e_tDBOutput_1){
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e_tDBOutput_1.getMessage());
				    	java.sql.SQLException ne_tDBOutput_1 = e_tDBOutput_1.getNextException(),sqle_tDBOutput_1=null;
				    	String errormessage_tDBOutput_1;
						if (ne_tDBOutput_1 != null) {
							// build new exception to provide the original cause
							sqle_tDBOutput_1 = new java.sql.SQLException(e_tDBOutput_1.getMessage() + "\ncaused by: " + ne_tDBOutput_1.getMessage(), ne_tDBOutput_1.getSQLState(), ne_tDBOutput_1.getErrorCode(), ne_tDBOutput_1);
							errormessage_tDBOutput_1 = sqle_tDBOutput_1.getMessage();
						}else{
							errormessage_tDBOutput_1 = e_tDBOutput_1.getMessage();
						}
				    	
				    	int countSum_tDBOutput_1 = 0;
						for(int countEach_tDBOutput_1: e_tDBOutput_1.getUpdateCounts()) {
							countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
						}
						rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
						
				    		insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
				    	
				    	System.err.println(errormessage_tDBOutput_1);
				    	
					}
    			}
    		
    		    commitCounter_tDBOutput_1++;
                if(commitEvery_tDBOutput_1 <= commitCounter_tDBOutput_1) {
                if ((batchSize_tDBOutput_1 > 0) && (batchSizeCounter_tDBOutput_1 > 0)) {
                try {
                		int countSum_tDBOutput_1 = 0;
                		    
						for(int countEach_tDBOutput_1: pstmt_tDBOutput_1.executeBatch()) {
							countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
						}
            	    	rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
            	    	
            	    		insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
            	    	
                batchSizeCounter_tDBOutput_1 = 0;
               }catch (java.sql.BatchUpdateException e_tDBOutput_1){
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e_tDBOutput_1.getMessage());
			    	java.sql.SQLException ne_tDBOutput_1 = e_tDBOutput_1.getNextException(),sqle_tDBOutput_1=null;
			    	String errormessage_tDBOutput_1;
					if (ne_tDBOutput_1 != null) {
						// build new exception to provide the original cause
						sqle_tDBOutput_1 = new java.sql.SQLException(e_tDBOutput_1.getMessage() + "\ncaused by: " + ne_tDBOutput_1.getMessage(), ne_tDBOutput_1.getSQLState(), ne_tDBOutput_1.getErrorCode(), ne_tDBOutput_1);
						errormessage_tDBOutput_1 = sqle_tDBOutput_1.getMessage();
					}else{
						errormessage_tDBOutput_1 = e_tDBOutput_1.getMessage();
					}
			    	
			    	int countSum_tDBOutput_1 = 0;
					for(int countEach_tDBOutput_1: e_tDBOutput_1.getUpdateCounts()) {
						countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
					}
					rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
					
			    		insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
			    	
			    	System.err.println(errormessage_tDBOutput_1);
			    	
				}
            }
                    if(rowsToCommitCount_tDBOutput_1 != 0){
                    	
                    }
                    conn_tDBOutput_1.commit();
                    if(rowsToCommitCount_tDBOutput_1 != 0){
                    	
                    	rowsToCommitCount_tDBOutput_1 = 0;
                    }
                    commitCounter_tDBOutput_1=0;
                }

 


	tos_count_tDBOutput_1++;

/**
 * [tDBOutput_1 main ] stop
 */
	
	/**
	 * [tDBOutput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	

 



/**
 * [tDBOutput_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	

 



/**
 * [tDBOutput_1 process_data_end ] stop
 */

} // End of branch "InsertType"




// Start of branch "insertTypeClient"
if(insertTypeClient != null) { 



	
	/**
	 * [tDBOutput_5 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"insertTypeClient"
						
						);
					}
					



        whetherReject_tDBOutput_5 = false;
                    if(insertTypeClient.CD_TYPE_CLIENT == null) {
pstmt_tDBOutput_5.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_5.setString(1, insertTypeClient.CD_TYPE_CLIENT);
}

                    if(insertTypeClient.LB_TYPE_CLIENT == null) {
pstmt_tDBOutput_5.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_5.setString(2, insertTypeClient.LB_TYPE_CLIENT);
}

                    if(insertTypeClient.LB_NOM_FICHIER == null) {
pstmt_tDBOutput_5.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_5.setString(3, insertTypeClient.LB_NOM_FICHIER);
}

                    if(insertTypeClient.DT_INSERTION != null) {
pstmt_tDBOutput_5.setTimestamp(4, new java.sql.Timestamp(insertTypeClient.DT_INSERTION.getTime()));
} else {
pstmt_tDBOutput_5.setNull(4, java.sql.Types.TIMESTAMP);
}

                    pstmt_tDBOutput_5.setInt(5, insertTypeClient.BL_LIGNE_ACTIVE);

                    if(insertTypeClient.LB_JOB_NAME == null) {
pstmt_tDBOutput_5.setNull(6, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_5.setString(6, insertTypeClient.LB_JOB_NAME);
}

			
    		pstmt_tDBOutput_5.addBatch();
    		nb_line_tDBOutput_5++;
    		  
    		  
    		  batchSizeCounter_tDBOutput_5++;
    		  
    			if ((batchSize_tDBOutput_5 > 0) && (batchSize_tDBOutput_5 <= batchSizeCounter_tDBOutput_5)) {
                try {
						int countSum_tDBOutput_5 = 0;
						    
						for(int countEach_tDBOutput_5: pstmt_tDBOutput_5.executeBatch()) {
							countSum_tDBOutput_5 += (countEach_tDBOutput_5 < 0 ? 0 : countEach_tDBOutput_5);
						}
				    	rowsToCommitCount_tDBOutput_5 += countSum_tDBOutput_5;
				    	
				    		insertedCount_tDBOutput_5 += countSum_tDBOutput_5;
				    	
            	    	batchSizeCounter_tDBOutput_5 = 0;
                }catch (java.sql.BatchUpdateException e_tDBOutput_5){
globalMap.put("tDBOutput_5_ERROR_MESSAGE",e_tDBOutput_5.getMessage());
				    	java.sql.SQLException ne_tDBOutput_5 = e_tDBOutput_5.getNextException(),sqle_tDBOutput_5=null;
				    	String errormessage_tDBOutput_5;
						if (ne_tDBOutput_5 != null) {
							// build new exception to provide the original cause
							sqle_tDBOutput_5 = new java.sql.SQLException(e_tDBOutput_5.getMessage() + "\ncaused by: " + ne_tDBOutput_5.getMessage(), ne_tDBOutput_5.getSQLState(), ne_tDBOutput_5.getErrorCode(), ne_tDBOutput_5);
							errormessage_tDBOutput_5 = sqle_tDBOutput_5.getMessage();
						}else{
							errormessage_tDBOutput_5 = e_tDBOutput_5.getMessage();
						}
				    	
				    	int countSum_tDBOutput_5 = 0;
						for(int countEach_tDBOutput_5: e_tDBOutput_5.getUpdateCounts()) {
							countSum_tDBOutput_5 += (countEach_tDBOutput_5 < 0 ? 0 : countEach_tDBOutput_5);
						}
						rowsToCommitCount_tDBOutput_5 += countSum_tDBOutput_5;
						
				    		insertedCount_tDBOutput_5 += countSum_tDBOutput_5;
				    	
				    	System.err.println(errormessage_tDBOutput_5);
				    	
					}
    			}
    		
    		    commitCounter_tDBOutput_5++;
                if(commitEvery_tDBOutput_5 <= commitCounter_tDBOutput_5) {
                if ((batchSize_tDBOutput_5 > 0) && (batchSizeCounter_tDBOutput_5 > 0)) {
                try {
                		int countSum_tDBOutput_5 = 0;
                		    
						for(int countEach_tDBOutput_5: pstmt_tDBOutput_5.executeBatch()) {
							countSum_tDBOutput_5 += (countEach_tDBOutput_5 < 0 ? 0 : countEach_tDBOutput_5);
						}
            	    	rowsToCommitCount_tDBOutput_5 += countSum_tDBOutput_5;
            	    	
            	    		insertedCount_tDBOutput_5 += countSum_tDBOutput_5;
            	    	
                batchSizeCounter_tDBOutput_5 = 0;
               }catch (java.sql.BatchUpdateException e_tDBOutput_5){
globalMap.put("tDBOutput_5_ERROR_MESSAGE",e_tDBOutput_5.getMessage());
			    	java.sql.SQLException ne_tDBOutput_5 = e_tDBOutput_5.getNextException(),sqle_tDBOutput_5=null;
			    	String errormessage_tDBOutput_5;
					if (ne_tDBOutput_5 != null) {
						// build new exception to provide the original cause
						sqle_tDBOutput_5 = new java.sql.SQLException(e_tDBOutput_5.getMessage() + "\ncaused by: " + ne_tDBOutput_5.getMessage(), ne_tDBOutput_5.getSQLState(), ne_tDBOutput_5.getErrorCode(), ne_tDBOutput_5);
						errormessage_tDBOutput_5 = sqle_tDBOutput_5.getMessage();
					}else{
						errormessage_tDBOutput_5 = e_tDBOutput_5.getMessage();
					}
			    	
			    	int countSum_tDBOutput_5 = 0;
					for(int countEach_tDBOutput_5: e_tDBOutput_5.getUpdateCounts()) {
						countSum_tDBOutput_5 += (countEach_tDBOutput_5 < 0 ? 0 : countEach_tDBOutput_5);
					}
					rowsToCommitCount_tDBOutput_5 += countSum_tDBOutput_5;
					
			    		insertedCount_tDBOutput_5 += countSum_tDBOutput_5;
			    	
			    	System.err.println(errormessage_tDBOutput_5);
			    	
				}
            }
                    if(rowsToCommitCount_tDBOutput_5 != 0){
                    	
                    }
                    conn_tDBOutput_5.commit();
                    if(rowsToCommitCount_tDBOutput_5 != 0){
                    	
                    	rowsToCommitCount_tDBOutput_5 = 0;
                    }
                    commitCounter_tDBOutput_5=0;
                }

 


	tos_count_tDBOutput_5++;

/**
 * [tDBOutput_5 main ] stop
 */
	
	/**
	 * [tDBOutput_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";

	

 



/**
 * [tDBOutput_5 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";

	

 



/**
 * [tDBOutput_5 process_data_end ] stop
 */

} // End of branch "insertTypeClient"




	
	/**
	 * [tMap_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 process_data_end ] stop
 */

} // End of branch "row3"




// Start of branch "row6"
if(row6 != null) { 



	
	/**
	 * [tMap_3 main ] start
	 */

	

	
	
	currentComponent="tMap_3";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row6"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_3 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_3 = false;
		  boolean mainRowRejected_tMap_3 = false;
            				    								  
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_3__Struct Var = Var__tMap_3;// ###############################
        // ###############################
        // # Output tables

insertDuplicate = null;


// # Output table : 'insertDuplicate'
insertDuplicate_tmp.LB_CHEMIN_FICHIER = ((String)globalMap.get("tFileList_1_CURRENT_FILEPATH"));
insertDuplicate_tmp.LB_NOM_FICHIER = ((String)globalMap.get("tFileList_1_CURRENT_FILE"));
insertDuplicate_tmp.NUM_LIGNE_REJET = row6.NUM_LIGNE ;
insertDuplicate_tmp.LB_LIGNE_REJET = row6.CD_TYPE_CLIENT+"|"+row6.LB_TYPE_CLIENT ;
insertDuplicate_tmp.LB_MESSAGE_REJET = "Données en doubles";
insertDuplicate_tmp.LB_NOM_FLUX = ((String)globalMap.get("nom_flux"));
insertDuplicate_tmp.DT_REJET = TalendDate.getCurrentDate() ;
insertDuplicate_tmp.LB_JOB_NAME = jobName;
insertDuplicate = insertDuplicate_tmp;
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_3 = false;










 


	tos_count_tMap_3++;

/**
 * [tMap_3 main ] stop
 */
	
	/**
	 * [tMap_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 process_data_begin ] stop
 */
// Start of branch "insertDuplicate"
if(insertDuplicate != null) { 



	
	/**
	 * [tDBOutput_4 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"insertDuplicate"
						
						);
					}
					



        whetherReject_tDBOutput_4 = false;
                    if(insertDuplicate.LB_CHEMIN_FICHIER == null) {
pstmt_tDBOutput_4.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_4.setString(1, insertDuplicate.LB_CHEMIN_FICHIER);
}

                    if(insertDuplicate.LB_NOM_FICHIER == null) {
pstmt_tDBOutput_4.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_4.setString(2, insertDuplicate.LB_NOM_FICHIER);
}

                    pstmt_tDBOutput_4.setInt(3, insertDuplicate.NUM_LIGNE_REJET);

                    if(insertDuplicate.LB_LIGNE_REJET == null) {
pstmt_tDBOutput_4.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_4.setString(4, insertDuplicate.LB_LIGNE_REJET);
}

            int checkCount_tDBOutput_4 = -1;
            try (java.sql.ResultSet rs_tDBOutput_4 = pstmt_tDBOutput_4.executeQuery()) {
                while(rs_tDBOutput_4.next()) {
                    checkCount_tDBOutput_4 = rs_tDBOutput_4.getInt(1);
                }
            }
            if(checkCount_tDBOutput_4 > 0) {
                        if(insertDuplicate.LB_MESSAGE_REJET == null) {
pstmtUpdate_tDBOutput_4.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_4.setString(1, insertDuplicate.LB_MESSAGE_REJET);
}

                        if(insertDuplicate.LB_NOM_FLUX == null) {
pstmtUpdate_tDBOutput_4.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_4.setString(2, insertDuplicate.LB_NOM_FLUX);
}

                        if(insertDuplicate.DT_REJET != null) {
pstmtUpdate_tDBOutput_4.setTimestamp(3, new java.sql.Timestamp(insertDuplicate.DT_REJET.getTime()));
} else {
pstmtUpdate_tDBOutput_4.setNull(3, java.sql.Types.TIMESTAMP);
}

                        if(insertDuplicate.LB_JOB_NAME == null) {
pstmtUpdate_tDBOutput_4.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_4.setString(4, insertDuplicate.LB_JOB_NAME);
}

                        if(insertDuplicate.LB_CHEMIN_FICHIER == null) {
pstmtUpdate_tDBOutput_4.setNull(5 + count_tDBOutput_4, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_4.setString(5 + count_tDBOutput_4, insertDuplicate.LB_CHEMIN_FICHIER);
}

                        if(insertDuplicate.LB_NOM_FICHIER == null) {
pstmtUpdate_tDBOutput_4.setNull(6 + count_tDBOutput_4, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_4.setString(6 + count_tDBOutput_4, insertDuplicate.LB_NOM_FICHIER);
}

                        pstmtUpdate_tDBOutput_4.setInt(7 + count_tDBOutput_4, insertDuplicate.NUM_LIGNE_REJET);

                        if(insertDuplicate.LB_LIGNE_REJET == null) {
pstmtUpdate_tDBOutput_4.setNull(8 + count_tDBOutput_4, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_4.setString(8 + count_tDBOutput_4, insertDuplicate.LB_LIGNE_REJET);
}

                try {
					
                    int processedCount_tDBOutput_4 = pstmtUpdate_tDBOutput_4.executeUpdate();
                    updatedCount_tDBOutput_4 += processedCount_tDBOutput_4;
                    rowsToCommitCount_tDBOutput_4 += processedCount_tDBOutput_4;
                    nb_line_tDBOutput_4++;
					
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_4_ERROR_MESSAGE",e.getMessage());
					
                    whetherReject_tDBOutput_4 = true;
                        nb_line_tDBOutput_4++;
                            System.err.print(e.getMessage());
                }
            } else {
                        if(insertDuplicate.LB_CHEMIN_FICHIER == null) {
pstmtInsert_tDBOutput_4.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_4.setString(1, insertDuplicate.LB_CHEMIN_FICHIER);
}

                        if(insertDuplicate.LB_NOM_FICHIER == null) {
pstmtInsert_tDBOutput_4.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_4.setString(2, insertDuplicate.LB_NOM_FICHIER);
}

                        pstmtInsert_tDBOutput_4.setInt(3, insertDuplicate.NUM_LIGNE_REJET);

                        if(insertDuplicate.LB_LIGNE_REJET == null) {
pstmtInsert_tDBOutput_4.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_4.setString(4, insertDuplicate.LB_LIGNE_REJET);
}

                        if(insertDuplicate.LB_MESSAGE_REJET == null) {
pstmtInsert_tDBOutput_4.setNull(5, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_4.setString(5, insertDuplicate.LB_MESSAGE_REJET);
}

                        if(insertDuplicate.LB_NOM_FLUX == null) {
pstmtInsert_tDBOutput_4.setNull(6, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_4.setString(6, insertDuplicate.LB_NOM_FLUX);
}

                        if(insertDuplicate.DT_REJET != null) {
pstmtInsert_tDBOutput_4.setTimestamp(7, new java.sql.Timestamp(insertDuplicate.DT_REJET.getTime()));
} else {
pstmtInsert_tDBOutput_4.setNull(7, java.sql.Types.TIMESTAMP);
}

                        if(insertDuplicate.LB_JOB_NAME == null) {
pstmtInsert_tDBOutput_4.setNull(8, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_4.setString(8, insertDuplicate.LB_JOB_NAME);
}

                try {
					
                    int processedCount_tDBOutput_4 = pstmtInsert_tDBOutput_4.executeUpdate();
                    insertedCount_tDBOutput_4 += processedCount_tDBOutput_4;
                    rowsToCommitCount_tDBOutput_4 += processedCount_tDBOutput_4;
                    nb_line_tDBOutput_4++;
					
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_4_ERROR_MESSAGE",e.getMessage());
					
                    whetherReject_tDBOutput_4 = true;
                        nb_line_tDBOutput_4++;
                            System.err.print(e.getMessage());
                }
            }

 


	tos_count_tDBOutput_4++;

/**
 * [tDBOutput_4 main ] stop
 */
	
	/**
	 * [tDBOutput_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";

	

 



/**
 * [tDBOutput_4 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";

	

 



/**
 * [tDBOutput_4 process_data_end ] stop
 */

} // End of branch "insertDuplicate"




	
	/**
	 * [tMap_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 process_data_end ] stop
 */

} // End of branch "row6"




	
	/**
	 * [tUniqRow_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";

	

 



/**
 * [tUniqRow_1 process_data_end ] stop
 */

} // End of branch "row2"




// Start of branch "row5"
if(row5 != null) { 



	
	/**
	 * [tMap_1 main ] start
	 */

	

	
	
	currentComponent="tMap_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row5"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_1 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_1 = false;
		  boolean mainRowRejected_tMap_1 = false;
            				    								  
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_1__Struct Var = Var__tMap_1;// ###############################
        // ###############################
        // # Output tables

insertReject = null;


// # Output table : 'insertReject'
insertReject_tmp.LB_CHEMIN_FICHIER = ((String)globalMap.get("tFileList_1_CURRENT_FILEPATH"));
insertReject_tmp.LB_NOM_FICHIER = ((String)globalMap.get("tFileList_1_CURRENT_FILE"));
insertReject_tmp.NUM_LIGNE_REJET = row5.NUM_LIGNE ;
insertReject_tmp.LB_LIGNE_REJET = row5.CD_TYPE_CLIENT+"|"+  row5.LB_TYPE_CLIENT ;
insertReject_tmp.LB_MESSAGE_REJET = "Valeurs nulles pour certaines colonnes";
insertReject_tmp.LB_NOM_FLUX = ((String)globalMap.get("nom_flux"));
insertReject_tmp.DT_REJET = TalendDate.getCurrentDate() ;
insertReject_tmp.LB_JOB_NAME = jobName;
insertReject = insertReject_tmp;
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_1 = false;










 


	tos_count_tMap_1++;

/**
 * [tMap_1 main ] stop
 */
	
	/**
	 * [tMap_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 process_data_begin ] stop
 */
// Start of branch "insertReject"
if(insertReject != null) { 



	
	/**
	 * [tDBOutput_3 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"insertReject"
						
						);
					}
					



        whetherReject_tDBOutput_3 = false;
                    if(insertReject.LB_CHEMIN_FICHIER == null) {
pstmt_tDBOutput_3.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_3.setString(1, insertReject.LB_CHEMIN_FICHIER);
}

                    if(insertReject.LB_NOM_FICHIER == null) {
pstmt_tDBOutput_3.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_3.setString(2, insertReject.LB_NOM_FICHIER);
}

                    pstmt_tDBOutput_3.setInt(3, insertReject.NUM_LIGNE_REJET);

                    if(insertReject.LB_LIGNE_REJET == null) {
pstmt_tDBOutput_3.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_3.setString(4, insertReject.LB_LIGNE_REJET);
}

            int checkCount_tDBOutput_3 = -1;
            try (java.sql.ResultSet rs_tDBOutput_3 = pstmt_tDBOutput_3.executeQuery()) {
                while(rs_tDBOutput_3.next()) {
                    checkCount_tDBOutput_3 = rs_tDBOutput_3.getInt(1);
                }
            }
            if(checkCount_tDBOutput_3 > 0) {
                        if(insertReject.LB_MESSAGE_REJET == null) {
pstmtUpdate_tDBOutput_3.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_3.setString(1, insertReject.LB_MESSAGE_REJET);
}

                        if(insertReject.LB_NOM_FLUX == null) {
pstmtUpdate_tDBOutput_3.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_3.setString(2, insertReject.LB_NOM_FLUX);
}

                        if(insertReject.DT_REJET != null) {
pstmtUpdate_tDBOutput_3.setTimestamp(3, new java.sql.Timestamp(insertReject.DT_REJET.getTime()));
} else {
pstmtUpdate_tDBOutput_3.setNull(3, java.sql.Types.TIMESTAMP);
}

                        if(insertReject.LB_JOB_NAME == null) {
pstmtUpdate_tDBOutput_3.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_3.setString(4, insertReject.LB_JOB_NAME);
}

                        if(insertReject.LB_CHEMIN_FICHIER == null) {
pstmtUpdate_tDBOutput_3.setNull(5 + count_tDBOutput_3, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_3.setString(5 + count_tDBOutput_3, insertReject.LB_CHEMIN_FICHIER);
}

                        if(insertReject.LB_NOM_FICHIER == null) {
pstmtUpdate_tDBOutput_3.setNull(6 + count_tDBOutput_3, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_3.setString(6 + count_tDBOutput_3, insertReject.LB_NOM_FICHIER);
}

                        pstmtUpdate_tDBOutput_3.setInt(7 + count_tDBOutput_3, insertReject.NUM_LIGNE_REJET);

                        if(insertReject.LB_LIGNE_REJET == null) {
pstmtUpdate_tDBOutput_3.setNull(8 + count_tDBOutput_3, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_3.setString(8 + count_tDBOutput_3, insertReject.LB_LIGNE_REJET);
}

                try {
					
                    int processedCount_tDBOutput_3 = pstmtUpdate_tDBOutput_3.executeUpdate();
                    updatedCount_tDBOutput_3 += processedCount_tDBOutput_3;
                    rowsToCommitCount_tDBOutput_3 += processedCount_tDBOutput_3;
                    nb_line_tDBOutput_3++;
					
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_3_ERROR_MESSAGE",e.getMessage());
					
                    whetherReject_tDBOutput_3 = true;
                        nb_line_tDBOutput_3++;
                            System.err.print(e.getMessage());
                }
            } else {
                        if(insertReject.LB_CHEMIN_FICHIER == null) {
pstmtInsert_tDBOutput_3.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_3.setString(1, insertReject.LB_CHEMIN_FICHIER);
}

                        if(insertReject.LB_NOM_FICHIER == null) {
pstmtInsert_tDBOutput_3.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_3.setString(2, insertReject.LB_NOM_FICHIER);
}

                        pstmtInsert_tDBOutput_3.setInt(3, insertReject.NUM_LIGNE_REJET);

                        if(insertReject.LB_LIGNE_REJET == null) {
pstmtInsert_tDBOutput_3.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_3.setString(4, insertReject.LB_LIGNE_REJET);
}

                        if(insertReject.LB_MESSAGE_REJET == null) {
pstmtInsert_tDBOutput_3.setNull(5, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_3.setString(5, insertReject.LB_MESSAGE_REJET);
}

                        if(insertReject.LB_NOM_FLUX == null) {
pstmtInsert_tDBOutput_3.setNull(6, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_3.setString(6, insertReject.LB_NOM_FLUX);
}

                        if(insertReject.DT_REJET != null) {
pstmtInsert_tDBOutput_3.setTimestamp(7, new java.sql.Timestamp(insertReject.DT_REJET.getTime()));
} else {
pstmtInsert_tDBOutput_3.setNull(7, java.sql.Types.TIMESTAMP);
}

                        if(insertReject.LB_JOB_NAME == null) {
pstmtInsert_tDBOutput_3.setNull(8, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_3.setString(8, insertReject.LB_JOB_NAME);
}

                try {
					
                    int processedCount_tDBOutput_3 = pstmtInsert_tDBOutput_3.executeUpdate();
                    insertedCount_tDBOutput_3 += processedCount_tDBOutput_3;
                    rowsToCommitCount_tDBOutput_3 += processedCount_tDBOutput_3;
                    nb_line_tDBOutput_3++;
					
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_3_ERROR_MESSAGE",e.getMessage());
					
                    whetherReject_tDBOutput_3 = true;
                        nb_line_tDBOutput_3++;
                            System.err.print(e.getMessage());
                }
            }

 


	tos_count_tDBOutput_3++;

/**
 * [tDBOutput_3 main ] stop
 */
	
	/**
	 * [tDBOutput_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";

	

 



/**
 * [tDBOutput_3 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";

	

 



/**
 * [tDBOutput_3 process_data_end ] stop
 */

} // End of branch "insertReject"




	
	/**
	 * [tMap_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 process_data_end ] stop
 */

} // End of branch "row5"




	
	/**
	 * [tFilterRow_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	

 



/**
 * [tFilterRow_1 process_data_end ] stop
 */

} // End of branch "typeClient"




	
	/**
	 * [tMap_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 process_data_end ] stop
 */

} // End of branch "row1"




	
	/**
	 * [tFileInputDelimited_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 



/**
 * [tFileInputDelimited_1 process_data_end ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	



            }
            }finally{
                if(!((Object)(((String)globalMap.get("tFileList_1_CURRENT_FILEPATH"))) instanceof java.io.InputStream)){
                	if(fid_tFileInputDelimited_1!=null){
                		fid_tFileInputDelimited_1.close();
                	}
                }
                if(fid_tFileInputDelimited_1!=null){
                	globalMap.put("tFileInputDelimited_1_NB_LINE", fid_tFileInputDelimited_1.getRowNumber());
					
                }
			}
			  

 

ok_Hash.put("tFileInputDelimited_1", true);
end_Hash.put("tFileInputDelimited_1", System.currentTimeMillis());




/**
 * [tFileInputDelimited_1 end ] stop
 */

	
	/**
	 * [tMap_2 end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	


// ###############################
// # Lookup hashes releasing
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row1");
			  	}
			  	
 

ok_Hash.put("tMap_2", true);
end_Hash.put("tMap_2", System.currentTimeMillis());




/**
 * [tMap_2 end ] stop
 */

	
	/**
	 * [tFilterRow_1 end ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	
    globalMap.put("tFilterRow_1_NB_LINE", nb_line_tFilterRow_1);
    globalMap.put("tFilterRow_1_NB_LINE_OK", nb_line_ok_tFilterRow_1);
    globalMap.put("tFilterRow_1_NB_LINE_REJECT", nb_line_reject_tFilterRow_1);
    

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"typeClient");
			  	}
			  	
 

ok_Hash.put("tFilterRow_1", true);
end_Hash.put("tFilterRow_1", System.currentTimeMillis());




/**
 * [tFilterRow_1 end ] stop
 */

	
	/**
	 * [tUniqRow_1 end ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";

	

globalMap.put("tUniqRow_1_NB_UNIQUES",nb_uniques_tUniqRow_1);
globalMap.put("tUniqRow_1_NB_DUPLICATES",nb_duplicates_tUniqRow_1);

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row2");
			  	}
			  	
 

ok_Hash.put("tUniqRow_1", true);
end_Hash.put("tUniqRow_1", System.currentTimeMillis());




/**
 * [tUniqRow_1 end ] stop
 */

	
	/**
	 * [tMap_4 end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row4 != null) {
						tHash_Lookup_row4.endGet();
					}
					globalMap.remove( "tHash_Lookup_row4" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row3");
			  	}
			  	
 

ok_Hash.put("tMap_4", true);
end_Hash.put("tMap_4", System.currentTimeMillis());




/**
 * [tMap_4 end ] stop
 */

	
	/**
	 * [tDBOutput_1 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	



	    try {
				int countSum_tDBOutput_1 = 0;
				if (pstmt_tDBOutput_1 != null && batchSizeCounter_tDBOutput_1 > 0) {
						
					for(int countEach_tDBOutput_1: pstmt_tDBOutput_1.executeBatch()) {
						countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
					}
					rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
						
				}
		    	
		    		insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
		    	
	    }catch (java.sql.BatchUpdateException e_tDBOutput_1){
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e_tDBOutput_1.getMessage());
	    	java.sql.SQLException ne_tDBOutput_1 = e_tDBOutput_1.getNextException(),sqle_tDBOutput_1=null;
	    	String errormessage_tDBOutput_1;
			if (ne_tDBOutput_1 != null) {
				// build new exception to provide the original cause
				sqle_tDBOutput_1 = new java.sql.SQLException(e_tDBOutput_1.getMessage() + "\ncaused by: " + ne_tDBOutput_1.getMessage(), ne_tDBOutput_1.getSQLState(), ne_tDBOutput_1.getErrorCode(), ne_tDBOutput_1);
				errormessage_tDBOutput_1 = sqle_tDBOutput_1.getMessage();
			}else{
				errormessage_tDBOutput_1 = e_tDBOutput_1.getMessage();
			}
	    	
	    	int countSum_tDBOutput_1 = 0;
			for(int countEach_tDBOutput_1: e_tDBOutput_1.getUpdateCounts()) {
				countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
			}
			rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
			
	    		insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
	    	
	    	System.err.println(errormessage_tDBOutput_1);
	    	
		}
	    
        if(pstmt_tDBOutput_1 != null) {
        		
            pstmt_tDBOutput_1.close();
            resourceMap.remove("pstmt_tDBOutput_1");
        }
    resourceMap.put("statementClosed_tDBOutput_1", true);
			if(rowsToCommitCount_tDBOutput_1 != 0){
				
			}
			conn_tDBOutput_1.commit();
			if(rowsToCommitCount_tDBOutput_1 != 0){
				
				rowsToCommitCount_tDBOutput_1 = 0;
			}
			commitCounter_tDBOutput_1 = 0;
		
    	conn_tDBOutput_1 .close();
    	
    	resourceMap.put("finish_tDBOutput_1", true);
    	

	nb_line_deleted_tDBOutput_1=nb_line_deleted_tDBOutput_1+ deletedCount_tDBOutput_1;
	nb_line_update_tDBOutput_1=nb_line_update_tDBOutput_1 + updatedCount_tDBOutput_1;
	nb_line_inserted_tDBOutput_1=nb_line_inserted_tDBOutput_1 + insertedCount_tDBOutput_1;
	nb_line_rejected_tDBOutput_1=nb_line_rejected_tDBOutput_1 + rejectedCount_tDBOutput_1;
	
        globalMap.put("tDBOutput_1_NB_LINE",nb_line_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_UPDATED",nb_line_update_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_DELETED",nb_line_deleted_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_1);
    

	


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"InsertType");
			  	}
			  	
 

ok_Hash.put("tDBOutput_1", true);
end_Hash.put("tDBOutput_1", System.currentTimeMillis());




/**
 * [tDBOutput_1 end ] stop
 */




	
	/**
	 * [tDBOutput_5 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";

	



	    try {
				int countSum_tDBOutput_5 = 0;
				if (pstmt_tDBOutput_5 != null && batchSizeCounter_tDBOutput_5 > 0) {
						
					for(int countEach_tDBOutput_5: pstmt_tDBOutput_5.executeBatch()) {
						countSum_tDBOutput_5 += (countEach_tDBOutput_5 < 0 ? 0 : countEach_tDBOutput_5);
					}
					rowsToCommitCount_tDBOutput_5 += countSum_tDBOutput_5;
						
				}
		    	
		    		insertedCount_tDBOutput_5 += countSum_tDBOutput_5;
		    	
	    }catch (java.sql.BatchUpdateException e_tDBOutput_5){
globalMap.put("tDBOutput_5_ERROR_MESSAGE",e_tDBOutput_5.getMessage());
	    	java.sql.SQLException ne_tDBOutput_5 = e_tDBOutput_5.getNextException(),sqle_tDBOutput_5=null;
	    	String errormessage_tDBOutput_5;
			if (ne_tDBOutput_5 != null) {
				// build new exception to provide the original cause
				sqle_tDBOutput_5 = new java.sql.SQLException(e_tDBOutput_5.getMessage() + "\ncaused by: " + ne_tDBOutput_5.getMessage(), ne_tDBOutput_5.getSQLState(), ne_tDBOutput_5.getErrorCode(), ne_tDBOutput_5);
				errormessage_tDBOutput_5 = sqle_tDBOutput_5.getMessage();
			}else{
				errormessage_tDBOutput_5 = e_tDBOutput_5.getMessage();
			}
	    	
	    	int countSum_tDBOutput_5 = 0;
			for(int countEach_tDBOutput_5: e_tDBOutput_5.getUpdateCounts()) {
				countSum_tDBOutput_5 += (countEach_tDBOutput_5 < 0 ? 0 : countEach_tDBOutput_5);
			}
			rowsToCommitCount_tDBOutput_5 += countSum_tDBOutput_5;
			
	    		insertedCount_tDBOutput_5 += countSum_tDBOutput_5;
	    	
	    	System.err.println(errormessage_tDBOutput_5);
	    	
		}
	    
        if(pstmt_tDBOutput_5 != null) {
        		
            pstmt_tDBOutput_5.close();
            resourceMap.remove("pstmt_tDBOutput_5");
        }
    resourceMap.put("statementClosed_tDBOutput_5", true);
			if(rowsToCommitCount_tDBOutput_5 != 0){
				
			}
			conn_tDBOutput_5.commit();
			if(rowsToCommitCount_tDBOutput_5 != 0){
				
				rowsToCommitCount_tDBOutput_5 = 0;
			}
			commitCounter_tDBOutput_5 = 0;
		
    	conn_tDBOutput_5 .close();
    	
    	resourceMap.put("finish_tDBOutput_5", true);
    	

	nb_line_deleted_tDBOutput_5=nb_line_deleted_tDBOutput_5+ deletedCount_tDBOutput_5;
	nb_line_update_tDBOutput_5=nb_line_update_tDBOutput_5 + updatedCount_tDBOutput_5;
	nb_line_inserted_tDBOutput_5=nb_line_inserted_tDBOutput_5 + insertedCount_tDBOutput_5;
	nb_line_rejected_tDBOutput_5=nb_line_rejected_tDBOutput_5 + rejectedCount_tDBOutput_5;
	
        globalMap.put("tDBOutput_5_NB_LINE",nb_line_tDBOutput_5);
        globalMap.put("tDBOutput_5_NB_LINE_UPDATED",nb_line_update_tDBOutput_5);
        globalMap.put("tDBOutput_5_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_5);
        globalMap.put("tDBOutput_5_NB_LINE_DELETED",nb_line_deleted_tDBOutput_5);
        globalMap.put("tDBOutput_5_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_5);
    

	


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"insertTypeClient");
			  	}
			  	
 

ok_Hash.put("tDBOutput_5", true);
end_Hash.put("tDBOutput_5", System.currentTimeMillis());




/**
 * [tDBOutput_5 end ] stop
 */







	
	/**
	 * [tMap_3 end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	


// ###############################
// # Lookup hashes releasing
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row6");
			  	}
			  	
 

ok_Hash.put("tMap_3", true);
end_Hash.put("tMap_3", System.currentTimeMillis());




/**
 * [tMap_3 end ] stop
 */

	
	/**
	 * [tDBOutput_4 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";

	



        if(pstmtUpdate_tDBOutput_4 != null){
            pstmtUpdate_tDBOutput_4.close();
            resourceMap.remove("pstmtUpdate_tDBOutput_4");
        }
        if(pstmtInsert_tDBOutput_4 != null){
            pstmtInsert_tDBOutput_4.close();
            resourceMap.remove("pstmtInsert_tDBOutput_4");
        }
        if(pstmt_tDBOutput_4 != null) {
            pstmt_tDBOutput_4.close();
            resourceMap.remove("pstmt_tDBOutput_4");
        }
    resourceMap.put("statementClosed_tDBOutput_4", true);

	nb_line_deleted_tDBOutput_4=nb_line_deleted_tDBOutput_4+ deletedCount_tDBOutput_4;
	nb_line_update_tDBOutput_4=nb_line_update_tDBOutput_4 + updatedCount_tDBOutput_4;
	nb_line_inserted_tDBOutput_4=nb_line_inserted_tDBOutput_4 + insertedCount_tDBOutput_4;
	nb_line_rejected_tDBOutput_4=nb_line_rejected_tDBOutput_4 + rejectedCount_tDBOutput_4;
	
        globalMap.put("tDBOutput_4_NB_LINE",nb_line_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_UPDATED",nb_line_update_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_DELETED",nb_line_deleted_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_4);
    

	


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"insertDuplicate");
			  	}
			  	
 

ok_Hash.put("tDBOutput_4", true);
end_Hash.put("tDBOutput_4", System.currentTimeMillis());




/**
 * [tDBOutput_4 end ] stop
 */










	
	/**
	 * [tMap_1 end ] start
	 */

	

	
	
	currentComponent="tMap_1";

	


// ###############################
// # Lookup hashes releasing
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row5");
			  	}
			  	
 

ok_Hash.put("tMap_1", true);
end_Hash.put("tMap_1", System.currentTimeMillis());




/**
 * [tMap_1 end ] stop
 */

	
	/**
	 * [tDBOutput_3 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";

	



        if(pstmtUpdate_tDBOutput_3 != null){
            pstmtUpdate_tDBOutput_3.close();
            resourceMap.remove("pstmtUpdate_tDBOutput_3");
        }
        if(pstmtInsert_tDBOutput_3 != null){
            pstmtInsert_tDBOutput_3.close();
            resourceMap.remove("pstmtInsert_tDBOutput_3");
        }
        if(pstmt_tDBOutput_3 != null) {
            pstmt_tDBOutput_3.close();
            resourceMap.remove("pstmt_tDBOutput_3");
        }
    resourceMap.put("statementClosed_tDBOutput_3", true);

	nb_line_deleted_tDBOutput_3=nb_line_deleted_tDBOutput_3+ deletedCount_tDBOutput_3;
	nb_line_update_tDBOutput_3=nb_line_update_tDBOutput_3 + updatedCount_tDBOutput_3;
	nb_line_inserted_tDBOutput_3=nb_line_inserted_tDBOutput_3 + insertedCount_tDBOutput_3;
	nb_line_rejected_tDBOutput_3=nb_line_rejected_tDBOutput_3 + rejectedCount_tDBOutput_3;
	
        globalMap.put("tDBOutput_3_NB_LINE",nb_line_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_UPDATED",nb_line_update_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_DELETED",nb_line_deleted_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_3);
    

	


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"insertReject");
			  	}
			  	
 

ok_Hash.put("tDBOutput_3", true);
end_Hash.put("tDBOutput_3", System.currentTimeMillis());




/**
 * [tDBOutput_3 end ] stop
 */












				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
					     			//free memory for "tMap_4"
					     			globalMap.remove("tHash_Lookup_row4"); 
				     			
				try{
					
	
	/**
	 * [tFileInputDelimited_1 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 



/**
 * [tFileInputDelimited_1 finally ] stop
 */

	
	/**
	 * [tMap_2 finally ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 finally ] stop
 */

	
	/**
	 * [tFilterRow_1 finally ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	

 



/**
 * [tFilterRow_1 finally ] stop
 */

	
	/**
	 * [tUniqRow_1 finally ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";

	

 



/**
 * [tUniqRow_1 finally ] stop
 */

	
	/**
	 * [tMap_4 finally ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 finally ] stop
 */

	
	/**
	 * [tDBOutput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	



    try {
    if (resourceMap.get("statementClosed_tDBOutput_1") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_1 = null;
                if ((pstmtToClose_tDBOutput_1 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_1")) != null) {
                    pstmtToClose_tDBOutput_1.close();
                }
    }
    } finally {
        if(resourceMap.get("finish_tDBOutput_1") == null){
            java.sql.Connection ctn_tDBOutput_1 = null;
            if((ctn_tDBOutput_1 = (java.sql.Connection)resourceMap.get("conn_tDBOutput_1")) != null){
                try {
                    ctn_tDBOutput_1.close();
                } catch (java.sql.SQLException sqlEx_tDBOutput_1) {
                    String errorMessage_tDBOutput_1 = "failed to close the connection in tDBOutput_1 :" + sqlEx_tDBOutput_1.getMessage();
                    System.err.println(errorMessage_tDBOutput_1);
                }
            }
        }
    }
 



/**
 * [tDBOutput_1 finally ] stop
 */




	
	/**
	 * [tDBOutput_5 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";

	



    try {
    if (resourceMap.get("statementClosed_tDBOutput_5") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_5 = null;
                if ((pstmtToClose_tDBOutput_5 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_5")) != null) {
                    pstmtToClose_tDBOutput_5.close();
                }
    }
    } finally {
        if(resourceMap.get("finish_tDBOutput_5") == null){
            java.sql.Connection ctn_tDBOutput_5 = null;
            if((ctn_tDBOutput_5 = (java.sql.Connection)resourceMap.get("conn_tDBOutput_5")) != null){
                try {
                    ctn_tDBOutput_5.close();
                } catch (java.sql.SQLException sqlEx_tDBOutput_5) {
                    String errorMessage_tDBOutput_5 = "failed to close the connection in tDBOutput_5 :" + sqlEx_tDBOutput_5.getMessage();
                    System.err.println(errorMessage_tDBOutput_5);
                }
            }
        }
    }
 



/**
 * [tDBOutput_5 finally ] stop
 */







	
	/**
	 * [tMap_3 finally ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 finally ] stop
 */

	
	/**
	 * [tDBOutput_4 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";

	



    if (resourceMap.get("statementClosed_tDBOutput_4") == null) {
                java.sql.PreparedStatement pstmtUpdateToClose_tDBOutput_4 = null;
                if ((pstmtUpdateToClose_tDBOutput_4 = (java.sql.PreparedStatement) resourceMap.remove("pstmtUpdate_tDBOutput_4")) != null) {
                    pstmtUpdateToClose_tDBOutput_4.close();
                }
                java.sql.PreparedStatement pstmtInsertToClose_tDBOutput_4 = null;
                if ((pstmtInsertToClose_tDBOutput_4 = (java.sql.PreparedStatement) resourceMap.remove("pstmtInsert_tDBOutput_4")) != null) {
                    pstmtInsertToClose_tDBOutput_4.close();
                }
                java.sql.PreparedStatement pstmtToClose_tDBOutput_4 = null;
                if ((pstmtToClose_tDBOutput_4 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_4")) != null) {
                    pstmtToClose_tDBOutput_4.close();
                }
    }
 



/**
 * [tDBOutput_4 finally ] stop
 */










	
	/**
	 * [tMap_1 finally ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 finally ] stop
 */

	
	/**
	 * [tDBOutput_3 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";

	



    if (resourceMap.get("statementClosed_tDBOutput_3") == null) {
                java.sql.PreparedStatement pstmtUpdateToClose_tDBOutput_3 = null;
                if ((pstmtUpdateToClose_tDBOutput_3 = (java.sql.PreparedStatement) resourceMap.remove("pstmtUpdate_tDBOutput_3")) != null) {
                    pstmtUpdateToClose_tDBOutput_3.close();
                }
                java.sql.PreparedStatement pstmtInsertToClose_tDBOutput_3 = null;
                if ((pstmtInsertToClose_tDBOutput_3 = (java.sql.PreparedStatement) resourceMap.remove("pstmtInsert_tDBOutput_3")) != null) {
                    pstmtInsertToClose_tDBOutput_3.close();
                }
                java.sql.PreparedStatement pstmtToClose_tDBOutput_3 = null;
                if ((pstmtToClose_tDBOutput_3 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_3")) != null) {
                    pstmtToClose_tDBOutput_3.close();
                }
    }
 



/**
 * [tDBOutput_3 finally ] stop
 */












				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputDelimited_1_SUBPROCESS_STATE", 1);
	}
	


public static class row4Struct implements routines.system.IPersistableComparableLookupRow<row4Struct> {
    final static byte[] commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];
    static byte[] commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String CD_TYPE_CLIENT;

				public String getCD_TYPE_CLIENT () {
					return this.CD_TYPE_CLIENT;
				}
				
			    public String LB_TYPE_CLIENT;

				public String getLB_TYPE_CLIENT () {
					return this.LB_TYPE_CLIENT;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public int BL_LIGNE_ACTIVE;

				public int getBL_LIGNE_ACTIVE () {
					return this.BL_LIGNE_ACTIVE;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.CD_TYPE_CLIENT == null) ? 0 : this.CD_TYPE_CLIENT.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final row4Struct other = (row4Struct) obj;
		
						if (this.CD_TYPE_CLIENT == null) {
							if (other.CD_TYPE_CLIENT != null)
								return false;
						
						} else if (!this.CD_TYPE_CLIENT.equals(other.CD_TYPE_CLIENT))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row4Struct other) {

		other.CD_TYPE_CLIENT = this.CD_TYPE_CLIENT;
	            other.LB_TYPE_CLIENT = this.LB_TYPE_CLIENT;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.DT_INSERTION = this.DT_INSERTION;
	            other.BL_LIGNE_ACTIVE = this.BL_LIGNE_ACTIVE;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(row4Struct other) {

		other.CD_TYPE_CLIENT = this.CD_TYPE_CLIENT;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length) {
				if(length < 1024 && commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient.length == 0) {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[1024];
				} else {
   					commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length);
			strReturn = new String(commonByteArray_K_COMMERCE_REPORTING_jODSTypeClient, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			dis.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			unmarshaller.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}

	private java.util.Date readDate(DataInputStream dis, ObjectInputStream ois) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller ) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

	private void writeDate(java.util.Date date1, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
	}
	
	private void writeDate(java.util.Date date1, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.CD_TYPE_CLIENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_K_COMMERCE_REPORTING_jODSTypeClient) {

        	try {

        		int length = 0;
		
					this.CD_TYPE_CLIENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CD_TYPE_CLIENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CD_TYPE_CLIENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		
						this.LB_TYPE_CLIENT = readString(dis,ois);
					
						this.LB_NOM_FICHIER = readString(dis,ois);
					
						this.DT_INSERTION = readDate(dis,ois);
					
			            this.BL_LIGNE_ACTIVE = dis.readInt();
					
						this.LB_JOB_NAME = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.LB_TYPE_CLIENT = readString(dis,objectIn);
					
						this.LB_NOM_FICHIER = readString(dis,objectIn);
					
						this.DT_INSERTION = readDate(dis,objectIn);
					
			            this.BL_LIGNE_ACTIVE = objectIn.readInt();
					
						this.LB_JOB_NAME = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.LB_TYPE_CLIENT, dos, oos);
					
						writeString(this.LB_NOM_FICHIER, dos, oos);
					
						writeDate(this.DT_INSERTION, dos, oos);
					
		            	dos.writeInt(this.BL_LIGNE_ACTIVE);
					
						writeString(this.LB_JOB_NAME, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.LB_TYPE_CLIENT, dos, objectOut);
					
						writeString(this.LB_NOM_FICHIER, dos, objectOut);
					
						writeDate(this.DT_INSERTION, dos, objectOut);
					
					objectOut.writeInt(this.BL_LIGNE_ACTIVE);
					
						writeString(this.LB_JOB_NAME, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CD_TYPE_CLIENT="+CD_TYPE_CLIENT);
		sb.append(",LB_TYPE_CLIENT="+LB_TYPE_CLIENT);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",BL_LIGNE_ACTIVE="+String.valueOf(BL_LIGNE_ACTIVE));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row4Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.CD_TYPE_CLIENT, other.CD_TYPE_CLIENT);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tDBInput_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row4Struct row4 = new row4Struct();




	
	/**
	 * [tAdvancedHash_row4 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row4", false);
		start_Hash.put("tAdvancedHash_row4", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row4";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row4");
					}
				
		int tos_count_tAdvancedHash_row4 = 0;
		

			   		// connection name:row4
			   		// source node:tDBInput_1 - inputs:(after_tFileInputDelimited_1) outputs:(row4,row4) | target node:tAdvancedHash_row4 - inputs:(row4) outputs:()
			   		// linked node: tMap_4 - inputs:(row3,row4) outputs:(InsertType,insertTypeClient)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row4 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct> tHash_Lookup_row4 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row4Struct>getLookup(matchingModeEnum_row4);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row4", tHash_Lookup_row4);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row4 begin ] stop
 */



	
	/**
	 * [tDBInput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_1", false);
		start_Hash.put("tDBInput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_1";

	
		int tos_count_tDBInput_1 = 0;
		
	
    
	
		    int nb_line_tDBInput_1 = 0;
		    java.sql.Connection conn_tDBInput_1 = null;
				String driverClass_tDBInput_1 = "org.postgresql.Driver";
			    java.lang.Class jdbcclazz_tDBInput_1 = java.lang.Class.forName(driverClass_tDBInput_1);
				String dbUser_tDBInput_1 = context.user;
				
				
	final String decryptedPassword_tDBInput_1 = context.password; 
				
				String dbPwd_tDBInput_1 = decryptedPassword_tDBInput_1;
				
				String url_tDBInput_1 = "jdbc:postgresql://" + context.serverName + ":" + context.port + "/" + context.database + "?" + context.additionalParam;
				
				conn_tDBInput_1 = java.sql.DriverManager.getConnection(url_tDBInput_1,dbUser_tDBInput_1,dbPwd_tDBInput_1);
		        
				conn_tDBInput_1.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

		    String dbquery_tDBInput_1 = "SELECT \n  \""+context.schema_ods+"\".\"ODS_TYPE_CLIENT\".\"CD_TYPE_CLIENT\", \n  \""+context.schema_ods+"\".\"ODS_TYPE_CLIENT\".\"LB_TYPE_CLIENT\", \n  \""+context.schema_ods+"\".\"ODS_TYPE_CLIENT\".\"LB_NOM_FICHIER\", \n  \""+context.schema_ods+"\".\"ODS_TYPE_CLIENT\".\"DT_INSERTION\", \n  \""+context.schema_ods+"\".\"ODS_TYPE_CLIENT\".\"BL_LIGNE_ACTIVE\", \n  \""+context.schema_ods+"\".\"ODS_TYPE_CLIENT\".\"LB_JOB_NAME\"\nFROM \""+context.schema_ods+"\".\"ODS_TYPE_CLIENT\"\nWHERE \"BL_LIGNE_ACTIVE\"= 1;\n";
		    

            	globalMap.put("tDBInput_1_QUERY",dbquery_tDBInput_1);
		    java.sql.ResultSet rs_tDBInput_1 = null;

		    try {
		    	rs_tDBInput_1 = stmt_tDBInput_1.executeQuery(dbquery_tDBInput_1);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_1 = rs_tDBInput_1.getMetaData();
		    	int colQtyInRs_tDBInput_1 = rsmd_tDBInput_1.getColumnCount();

		    String tmpContent_tDBInput_1 = null;
		    
		    
		    while (rs_tDBInput_1.next()) {
		        nb_line_tDBInput_1++;
		        
							if(colQtyInRs_tDBInput_1 < 1) {
								row4.CD_TYPE_CLIENT = null;
							} else {
	                         		
        	row4.CD_TYPE_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 1, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 2) {
								row4.LB_TYPE_CLIENT = null;
							} else {
	                         		
        	row4.LB_TYPE_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 2, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								row4.LB_NOM_FICHIER = null;
							} else {
	                         		
        	row4.LB_NOM_FICHIER = routines.system.JDBCUtil.getString(rs_tDBInput_1, 3, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 4) {
								row4.DT_INSERTION = null;
							} else {
										
			row4.DT_INSERTION = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 4);
		                    }
							if(colQtyInRs_tDBInput_1 < 5) {
								row4.BL_LIGNE_ACTIVE = 0;
							} else {
		                          
            row4.BL_LIGNE_ACTIVE = rs_tDBInput_1.getInt(5);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 6) {
								row4.LB_JOB_NAME = null;
							} else {
	                         		
        	row4.LB_JOB_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_1, 6, false);
		                    }
					


 



/**
 * [tDBInput_1 begin ] stop
 */
	
	/**
	 * [tDBInput_1 main ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 


	tos_count_tDBInput_1++;

/**
 * [tDBInput_1 main ] stop
 */
	
	/**
	 * [tDBInput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 



/**
 * [tDBInput_1 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row4 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row4"
						
						);
					}
					


			   
			   

					row4Struct row4_HashRow = new row4Struct();
		   	   	   
				
				row4_HashRow.CD_TYPE_CLIENT = row4.CD_TYPE_CLIENT;
				
				row4_HashRow.LB_TYPE_CLIENT = row4.LB_TYPE_CLIENT;
				
				row4_HashRow.LB_NOM_FICHIER = row4.LB_NOM_FICHIER;
				
				row4_HashRow.DT_INSERTION = row4.DT_INSERTION;
				
				row4_HashRow.BL_LIGNE_ACTIVE = row4.BL_LIGNE_ACTIVE;
				
				row4_HashRow.LB_JOB_NAME = row4.LB_JOB_NAME;
				
			tHash_Lookup_row4.put(row4_HashRow);
			
            




 


	tos_count_tAdvancedHash_row4++;

/**
 * [tAdvancedHash_row4 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	

 



/**
 * [tAdvancedHash_row4 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row4 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	

 



/**
 * [tAdvancedHash_row4 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 



/**
 * [tDBInput_1 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_1 end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

	}
}finally{
	if (rs_tDBInput_1 != null) {
		rs_tDBInput_1.close();
	}
	if (stmt_tDBInput_1 != null) {
		stmt_tDBInput_1.close();
	}
	if(conn_tDBInput_1 != null && !conn_tDBInput_1.isClosed()) {
		
			conn_tDBInput_1.commit();
			
		
			conn_tDBInput_1.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	}
	
}
globalMap.put("tDBInput_1_NB_LINE",nb_line_tDBInput_1);
 

ok_Hash.put("tDBInput_1", true);
end_Hash.put("tDBInput_1", System.currentTimeMillis());




/**
 * [tDBInput_1 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row4 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	

tHash_Lookup_row4.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row4");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row4", true);
end_Hash.put("tAdvancedHash_row4", System.currentTimeMillis());




/**
 * [tAdvancedHash_row4 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 



/**
 * [tDBInput_1 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row4 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	

 



/**
 * [tAdvancedHash_row4 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_1_SUBPROCESS_STATE", 1);
	}
	
    public String resuming_logs_dir_path = null;
    public String resuming_checkpoint_path = null;
    public String parent_part_launcher = null;
    private String resumeEntryMethodName = null;
    private boolean globalResumeTicket = false;

    public boolean watch = false;
    // portStats is null, it means don't execute the statistics
    public Integer portStats = null;
    public int portTraces = 4334;
    public String clientHost;
    public String defaultClientHost = "localhost";
    public String contextStr = "Default";
    public boolean isDefaultContext = true;
    public String pid = "0";
    public String rootPid = null;
    public String fatherPid = null;
    public String fatherNode = null;
    public long startTime = 0;
    public boolean isChildJob = false;
    public String log4jLevel = "";
    
    private boolean enableLogStash;

    private boolean execStat = true;

    private ThreadLocal<java.util.Map<String, String>> threadLocal = new ThreadLocal<java.util.Map<String, String>>() {
        protected java.util.Map<String, String> initialValue() {
            java.util.Map<String,String> threadRunResultMap = new java.util.HashMap<String, String>();
            threadRunResultMap.put("errorCode", null);
            threadRunResultMap.put("status", "");
            return threadRunResultMap;
        };
    };


    protected PropertiesWithType context_param = new PropertiesWithType();
    public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

    public String status= "";
    

    public static void main(String[] args){
        final jODSTypeClient jODSTypeClientClass = new jODSTypeClient();

        int exitCode = jODSTypeClientClass.runJobInTOS(args);

        System.exit(exitCode);
    }


    public String[][] runJob(String[] args) {

        int exitCode = runJobInTOS(args);
        String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

        return bufferValue;
    }

    public boolean hastBufferOutputComponent() {
		boolean hastBufferOutput = false;
    	
        return hastBufferOutput;
    }

    public int runJobInTOS(String[] args) {
	   	// reset status
	   	status = "";
	   	
        String lastStr = "";
        for (String arg : args) {
            if (arg.equalsIgnoreCase("--context_param")) {
                lastStr = arg;
            } else if (lastStr.equals("")) {
                evalParam(arg);
            } else {
                evalParam(lastStr + " " + arg);
                lastStr = "";
            }
        }
        enableLogStash = "true".equalsIgnoreCase(System.getProperty("audit.enabled"));

    	
    	

        if(clientHost == null) {
            clientHost = defaultClientHost;
        }

        if(pid == null || "0".equals(pid)) {
            pid = TalendString.getAsciiRandomString(6);
        }

        if (rootPid==null) {
            rootPid = pid;
        }
        if (fatherPid==null) {
            fatherPid = pid;
        }else{
            isChildJob = true;
        }

        if (portStats != null) {
            // portStats = -1; //for testing
            if (portStats < 0 || portStats > 65535) {
                // issue:10869, the portStats is invalid, so this client socket can't open
                System.err.println("The statistics socket port " + portStats + " is invalid.");
                execStat = false;
            }
        } else {
            execStat = false;
        }
        boolean inOSGi = routines.system.BundleUtils.inOSGi();

        if (inOSGi) {
            java.util.Dictionary<String, Object> jobProperties = routines.system.BundleUtils.getJobProperties(jobName);

            if (jobProperties != null && jobProperties.get("context") != null) {
                contextStr = (String)jobProperties.get("context");
            }
        }

        try {
            //call job/subjob with an existing context, like: --context=production. if without this parameter, there will use the default context instead.
            java.io.InputStream inContext = jODSTypeClient.class.getClassLoader().getResourceAsStream("k_commerce_reporting/jodstypeclient_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = jODSTypeClient.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
            }
            if (inContext != null) {
                try {
                    //defaultProps is in order to keep the original context value
                    if(context != null && context.isEmpty()) {
	                defaultProps.load(inContext);
	                context = new ContextProperties(defaultProps);
                    }
                } finally {
                    inContext.close();
                }
            } else if (!isDefaultContext) {
                //print info and job continue to run, for case: context_param is not empty.
                System.err.println("Could not find the context " + contextStr);
            }

            if(!context_param.isEmpty()) {
                context.putAll(context_param);
				//set types for params from parentJobs
				for (Object key: context_param.keySet()){
					String context_key = key.toString();
					String context_type = context_param.getContextType(context_key);
					context.setContextType(context_key, context_type);

				}
            }
            class ContextProcessing {
                private void processContext_0() {
                        context.setContextType("database", "id_String");
                        if(context.getStringValue("database") == null) {
                            context.database = null;
                        } else {
                            context.database=(String) context.getProperty("database");
                        }
                        context.setContextType("password", "id_Password");
                        if(context.getStringValue("password") == null) {
                            context.password = null;
                        } else {
                            String pwd_password_value = context.getProperty("password");
                            context.password = null;
                            if(pwd_password_value!=null) {
                                if(context_param.containsKey("password")) {//no need to decrypt if it come from program argument or parent job runtime
                                    context.password = pwd_password_value;
                                } else if (!pwd_password_value.isEmpty()) {
                                    try {
                                        context.password = routines.system.PasswordEncryptUtil.decryptPassword(pwd_password_value);
                                        context.put("password",context.password);
                                    } catch (java.lang.RuntimeException e) {
                                        //do nothing
                                    }
                                }
                            }
                        }
                        context.setContextType("port", "id_String");
                        if(context.getStringValue("port") == null) {
                            context.port = null;
                        } else {
                            context.port=(String) context.getProperty("port");
                        }
                        context.setContextType("serverName", "id_String");
                        if(context.getStringValue("serverName") == null) {
                            context.serverName = null;
                        } else {
                            context.serverName=(String) context.getProperty("serverName");
                        }
                        context.setContextType("additionalParam", "id_String");
                        if(context.getStringValue("additionalParam") == null) {
                            context.additionalParam = null;
                        } else {
                            context.additionalParam=(String) context.getProperty("additionalParam");
                        }
                        context.setContextType("schema_PARAM", "id_String");
                        if(context.getStringValue("schema_PARAM") == null) {
                            context.schema_PARAM = null;
                        } else {
                            context.schema_PARAM=(String) context.getProperty("schema_PARAM");
                        }
                        context.setContextType("user", "id_String");
                        if(context.getStringValue("user") == null) {
                            context.user = null;
                        } else {
                            context.user=(String) context.getProperty("user");
                        }
                        context.setContextType("schema_ods", "id_String");
                        if(context.getStringValue("schema_ods") == null) {
                            context.schema_ods = null;
                        } else {
                            context.schema_ods=(String) context.getProperty("schema_ods");
                        }
                } 
                public void processAllContext() {
                        processContext_0();
                }
            }

            new ContextProcessing().processAllContext();
        } catch (java.io.IOException ie) {
            System.err.println("Could not load context "+contextStr);
            ie.printStackTrace();
        }

        // get context value from parent directly
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("database")) {
                context.database = (String) parentContextMap.get("database");
            }if (parentContextMap.containsKey("password")) {
                context.password = (java.lang.String) parentContextMap.get("password");
            }if (parentContextMap.containsKey("port")) {
                context.port = (String) parentContextMap.get("port");
            }if (parentContextMap.containsKey("serverName")) {
                context.serverName = (String) parentContextMap.get("serverName");
            }if (parentContextMap.containsKey("additionalParam")) {
                context.additionalParam = (String) parentContextMap.get("additionalParam");
            }if (parentContextMap.containsKey("schema_PARAM")) {
                context.schema_PARAM = (String) parentContextMap.get("schema_PARAM");
            }if (parentContextMap.containsKey("user")) {
                context.user = (String) parentContextMap.get("user");
            }if (parentContextMap.containsKey("schema_ods")) {
                context.schema_ods = (String) parentContextMap.get("schema_ods");
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
			parametersToEncrypt.add("password");
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt));

if(execStat) {
    try {
        runStat.openSocket(!isChildJob);
        runStat.setAllPID(rootPid, fatherPid, pid, jobName);
        runStat.startThreadStat(clientHost, portStats);
        runStat.updateStatOnJob(RunStat.JOBSTART, fatherNode);
    } catch (java.io.IOException ioException) {
        ioException.printStackTrace();
    }
}



	
	    java.util.concurrent.ConcurrentHashMap<Object, Object> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<Object, Object>();
	    globalMap.put("concurrentHashMap", concurrentHashMap);
	

    long startUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    long endUsedMemory = 0;
    long end = 0;

    startTime = System.currentTimeMillis();

try {
errorCode = null;Implicit_Context_DatabaseProcess(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_Implicit_Context_Database) {
globalMap.put("Implicit_Context_Database_SUBPROCESS_STATE", -1);

e_Implicit_Context_Database.printStackTrace();

}

this.globalResumeTicket = true;//to run tPreJob

try {
errorCode = null;tPrejob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPrejob_1) {
globalMap.put("tPrejob_1_SUBPROCESS_STATE", -1);

e_tPrejob_1.printStackTrace();

}




this.globalResumeTicket = false;//to run others jobs

try {
errorCode = null;tFileList_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tFileList_1) {
globalMap.put("tFileList_1_SUBPROCESS_STATE", -1);

e_tFileList_1.printStackTrace();

}

this.globalResumeTicket = true;//to run tPostJob

try {
errorCode = null;tPostjob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPostjob_1) {
globalMap.put("tPostjob_1_SUBPROCESS_STATE", -1);

e_tPostjob_1.printStackTrace();

}



        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : jODSTypeClient");
        }



if (execStat) {
    runStat.updateStatOnJob(RunStat.JOBEND, fatherNode);
    runStat.stopThreadStat();
}
    int returnCode = 0;


    if(errorCode == null) {
         returnCode = status != null && status.equals("failure") ? 1 : 0;
    } else {
         returnCode = errorCode.intValue();
    }
    resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","" + returnCode,"","","");

    return returnCode;

  }

    // only for OSGi env
    public void destroy() {
    closeSqlDbConnections();


    }



    private void closeSqlDbConnections() {
        try {
            Object obj_conn;
            obj_conn = globalMap.remove("conn_tDBConnection_1");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
        } catch (java.lang.Exception e) {
        }
    }











    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
            connections.put("conn_tDBConnection_1", globalMap.get("conn_tDBConnection_1"));






        return connections;
    }

    private void evalParam(String arg) {
        if (arg.startsWith("--resuming_logs_dir_path")) {
            resuming_logs_dir_path = arg.substring(25);
        } else if (arg.startsWith("--resuming_checkpoint_path")) {
            resuming_checkpoint_path = arg.substring(27);
        } else if (arg.startsWith("--parent_part_launcher")) {
            parent_part_launcher = arg.substring(23);
        } else if (arg.startsWith("--watch")) {
            watch = true;
        } else if (arg.startsWith("--stat_port=")) {
            String portStatsStr = arg.substring(12);
            if (portStatsStr != null && !portStatsStr.equals("null")) {
                portStats = Integer.parseInt(portStatsStr);
            }
        } else if (arg.startsWith("--trace_port=")) {
            portTraces = Integer.parseInt(arg.substring(13));
        } else if (arg.startsWith("--client_host=")) {
            clientHost = arg.substring(14);
        } else if (arg.startsWith("--context=")) {
            contextStr = arg.substring(10);
            isDefaultContext = false;
        } else if (arg.startsWith("--father_pid=")) {
            fatherPid = arg.substring(13);
        } else if (arg.startsWith("--root_pid=")) {
            rootPid = arg.substring(11);
        } else if (arg.startsWith("--father_node=")) {
            fatherNode = arg.substring(14);
        } else if (arg.startsWith("--pid=")) {
            pid = arg.substring(6);
        } else if (arg.startsWith("--context_type")) {
            String keyValue = arg.substring(15);
			int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.setContextType(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.setContextType(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }

            }

		} else if (arg.startsWith("--context_param")) {
            String keyValue = arg.substring(16);
            int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }
            }
        } else if (arg.startsWith("--log4jLevel=")) {
            log4jLevel = arg.substring(13);
		} else if (arg.startsWith("--audit.enabled") && arg.contains("=")) {//for trunjob call
		    final int equal = arg.indexOf('=');
			final String key = arg.substring("--".length(), equal);
			System.setProperty(key, arg.substring(equal + 1));
		}
    }
    
    private static final String NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY = "<TALEND_NULL>";

    private final String[][] escapeChars = {
        {"\\\\","\\"},{"\\n","\n"},{"\\'","\'"},{"\\r","\r"},
        {"\\f","\f"},{"\\b","\b"},{"\\t","\t"}
        };
    private String replaceEscapeChars (String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0],currIndex);
				if (index>=0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0], strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the result
			if (index < 0) {
				result.append(keyValue.substring(currIndex));
				currIndex = currIndex + keyValue.length();
			}
		}

		return result.toString();
    }

    public Integer getErrorCode() {
        return errorCode;
    }


    public String getStatus() {
        return status;
    }

    ResumeUtil resumeUtil = null;
}
/************************************************************************************************
 *     297771 characters generated by Talend Open Studio for Data Integration 
 *     on the 18 novembre 2023 à 12:13:27 AM CET
 ************************************************************************************************/