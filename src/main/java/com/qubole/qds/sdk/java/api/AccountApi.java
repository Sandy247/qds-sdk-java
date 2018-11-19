package com.qubole.qds.sdk.java.api;

import com.qubole.qds.sdk.java.entities.Account;

public interface AccountApi {

    //public InvokableBuilder<AccountItem> create (AccountConfigBuilder builder);

    public InvokableBuilder<Account> edit(AccountConfigBuilder builder);

    public InvokableBuilder<Account> information();

    public InvokableBuilder<Account> clone(String acc_id, String clone_acc_name, String clone_qbol_users);

    public AccountConfigBuilder accountConfig();
}
