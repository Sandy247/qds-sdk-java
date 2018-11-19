package com.qubole.qds.sdk.java.details;

import com.qubole.qds.sdk.java.api.AccountConfigBuilder;
import org.codehaus.jackson.node.ObjectNode;

import java.io.IOException;

public class AccountConfigBuilderImpl implements AccountConfigBuilder
{
    private final ObjectNode account = QdsClientImpl.getMapper().createObjectNode();

    public ObjectNode getAccount()
    {
        ObjectNode accountNode = QdsClientImpl.getMapper().createObjectNode();
        accountNode.put("account", account);
        return accountNode;
    }

    @Override
    public String toString()
    {
        try
        {
            return QdsClientImpl.getMapper().writer().writeValueAsString(getAccount());
        }catch (IOException ioe)
        {
            throw new RuntimeException("Could not serialize " + account, ioe);
        }
    }

    @Override
    public AccountConfigBuilder storage_type(String storage_type) {
        account.put("storage_type", storage_type);
        return this;
    }

    @Override
    public AccountConfigBuilder compute_type(String compute_type) {
        account.put("compute_type", compute_type);
        return this;
    }

    @Override
    public AccountConfigBuilder storage_secret_key(String storage_secret_key) {
        account.put("storage_secret_key", storage_secret_key);
        return this;
    }

    @Override
    public AccountConfigBuilder compute_secret_key(String compute_secret_key) {
        account.put("compute_secret_key", compute_secret_key);
        return this;
    }

    @Override
    public AccountConfigBuilder storage_access_key(String storage_access_key) {
        account.put("storage_access_key", storage_access_key);
        return this;
    }

    @Override
    public AccountConfigBuilder compute_access_key(String compute_access_key) {
        account.put("compute_access_key", compute_access_key);
        return this;
    }

    @Override
    public AccountConfigBuilder defloc(String defloc) {
        account.put("defloc", defloc);
        return this;
    }

    @Override
    public AccountConfigBuilder name(String name) {
        account.put("name", name);
        return this;
    }

    @Override
    public AccountConfigBuilder id(String id) {
        account.put("id", id);
        return this;
    }

    @Override
    public AccountConfigBuilder level(String level) {
        account.put("level", level);
        return this;
    }

    @Override
    public AccountConfigBuilder aws_region(String aws_region) {
        account.put("aws_region", aws_region);
        return this;
    }

    @Override
    public AccountConfigBuilder aws_AZ(String aws_AZ) {
        account.put("aws_AZ", aws_AZ);
        return this;
    }

    @Override
    public AccountConfigBuilder idle_cluster_timeout(int idle_cluster_timeout) {
        account.put("idle_cluster_timeout", idle_cluster_timeout);
        return this;
    }

    @Override
    public AccountConfigBuilder idle_session_timeout(int idle_session_timeout) {
        account.put("idle_session_timeout", idle_session_timeout);
        return this;
    }

    @Override
    public AccountConfigBuilder sub_account_creation(boolean sub_account_creation) {
        account.put("sub_account_creation", sub_account_creation);
        return this;
    }

    @Override
    public AccountConfigBuilder cacheQuotaSize(int cacheQuotaSize) {
        account.put("CacheQuotaSizeInGB", cacheQuotaSize);
        return this;
    }
}
