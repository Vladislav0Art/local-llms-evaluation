package org.stellar.sdk;

public class GeneratedFromAccountId_AccountIdIsSet_true {

    @Test
    public void fromAccountId_AccountIdIsSet_true() throws Exception {
        String accountId = "testaccountid";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair.getAccountId());
    }

}