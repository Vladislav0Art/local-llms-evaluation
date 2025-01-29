package org.stellar.sdk;

public class GeneratedTestFromAccountId {

    @Test
    public void testFromAccountId() {
        String accountId = "account ID";
        KeyPair keyPair = org.stellar.sdk.KeyPair.fromAccountId(accountId);
        Preconditions.checkNotNull(keyPair, "Expected a valid KeyPair instance");
        assertEquals(accountId.length(), keyPair.getAccountId().length, "KeyPair should have the correct length for account ID");
    }

}