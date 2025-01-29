package org.stellar.sdk;

public class GeneratedTestFromAccountId {

    @Test
    public void testFromAccountId() {
        String accountId = "your_account_id_here";
        EdDSAPublicKey publicKey = fromAccountId(accountId);
        assert publicKeys.getAccountId().equals(accountId) : "Key pair created with invalid account id";
    }

}