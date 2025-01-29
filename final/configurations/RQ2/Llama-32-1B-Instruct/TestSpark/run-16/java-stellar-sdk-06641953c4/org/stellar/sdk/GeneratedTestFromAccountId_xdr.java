package org.stellar.sdk;

public class GeneratedTestFromAccountId_xdr {

    @Test
    public void testFromAccountId_xdr() throws Exception {
        String accountId = "account id".getBytes();
        KeyPair key = KeyPair.fromAccountId(accountId);
        Preconditions.checkState(key != null);
    }

}