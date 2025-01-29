package org.stellar.sdk;

public class GeneratedTestFromAccountId {

    @Test
    public void testFromAccountId() throws GeneralSecurityException {
        String accountId = "your_account_id_here";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        Preconditions.checkNotNull(keyPair, "key pair is null");

        assertEquals(accountId.length(), keyPair.getAccountId().length, "account id length");
    }

}