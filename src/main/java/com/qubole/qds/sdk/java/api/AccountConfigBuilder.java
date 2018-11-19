package com.qubole.qds.sdk.java.api;



public interface AccountConfigBuilder
{
   AccountConfigBuilder storage_type(String storage_type);
   AccountConfigBuilder compute_type(String compute_type);
   AccountConfigBuilder storage_secret_key(String storage_secret_key);
   AccountConfigBuilder compute_secret_key(String compute_secret_key);
   AccountConfigBuilder storage_access_key(String storage_access_key);
   AccountConfigBuilder compute_access_key(String compute_access_key);
   AccountConfigBuilder defloc(String defloc);
   AccountConfigBuilder name(String name);
   AccountConfigBuilder id(String id);
   AccountConfigBuilder level(String level);
   AccountConfigBuilder aws_region(String aws_region);
   AccountConfigBuilder aws_AZ(String aws_AZ);
   AccountConfigBuilder idle_cluster_timeout(int idle_cluster_timeout);
   AccountConfigBuilder idle_session_timeout(int idle_session_timeout);
   AccountConfigBuilder sub_account_creation(boolean sub_account_creation);
   AccountConfigBuilder cacheQuotaSize(int cacheQuotaSize);
}
