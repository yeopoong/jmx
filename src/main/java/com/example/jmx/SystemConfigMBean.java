package com.example.jmx;

public interface SystemConfigMBean {
	 
    public void setThreadCount(int noOfThreads);
    public int getThreadCount();
     
    public void setSchemaName(String schemaName);
    public String getSchemaName();
     
    public String doConfig();
}