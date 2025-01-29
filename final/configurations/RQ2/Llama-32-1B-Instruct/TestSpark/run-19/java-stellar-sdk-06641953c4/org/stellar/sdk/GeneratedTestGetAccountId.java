package org.stellar.sdk;

public class GeneratedTestGetAccountId {

    @Test
    public void testGetAccountId() {
        String accountId = "your_account_id_here";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        Preconditions.checkNotNull(keyPair, "key pair is null");

        assertEquals(accountId.length(), keyPair.getAccountId().length, "account id length");
    }

}