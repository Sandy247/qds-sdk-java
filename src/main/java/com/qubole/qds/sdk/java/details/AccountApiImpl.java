package com.qubole.qds.sdk.java.details;

import com.qubole.qds.sdk.java.api.AccountApi;
import com.qubole.qds.sdk.java.api.AccountConfigBuilder;
import com.qubole.qds.sdk.java.api.InvokableBuilder;
import com.qubole.qds.sdk.java.client.QdsClient;
import com.qubole.qds.sdk.java.entities.Account;

import java.util.HashMap;
import java.util.Map;

public class AccountApiImpl implements AccountApi {

    private final QdsClient client;

    public AccountApiImpl(QdsClient client)
    {
        this.client = client;
    }

    @Override
    public InvokableBuilder<Account> edit(AccountConfigBuilder builder) {
        RequestDetails entity = new RequestDetails(builder.toString(), RequestDetails.Method.PUT);
        return new GenericInvokableBuilderImpl<Account>(client, entity, Account.class, "accounts");
    }

    @Override
    public InvokableBuilder<Account> clone(String acc_id, String clone_acc_name, String clone_qbol_users) {
        Map<String, String> params = new HashMap<String, String>();
        if(acc_id != null){
            params.put("id", acc_id);
        }
        if(clone_acc_name != null) {
            params.put("name", clone_acc_name);
        }
        if (clone_qbol_users != null) {
            params.put("clone_qbol_users", clone_qbol_users);
        }
        RequestDetails entity = new RequestDetails(params, RequestDetails.Method.POST);
        return new GenericInvokableBuilderImpl<Account>(client, entity, Account.class, "accounts", "clone");
    }

    @Override
    public InvokableBuilder<Account> information() {
        return new GenericInvokableBuilderImpl<Account>(client, RequestDetails.retry(), Account.class, "accounts");
    }

    @Override
    public AccountConfigBuilder accountConfig() {
        return new AccountConfigBuilderImpl();
    }
}
