package org.stellar.sdk;

public class GeneratedTestFromAccountId_1_2 {

    @Test
    public void testFromAccountId_1_2() {
        String accountId = "account-id-1-2";
        KeyPair key = KeyPair.fromAccountId(accountId);
        Preconditions.assertSame("xdr", key.getTypes());
    }

}