package org.stellar.sdk;

public class GeneratedTestRandomKeyFromAccountId {

    @Test
    public void testRandomKeyFromAccountId() {
        String accountId = "1234567890abcdef";
        KeyPair key = KeyPair.fromAccountId(accountId);
        assertTrue(key.getPublicKey().length == accountId.length);
        assertEquals(accountId, key.getPublicKey());
    }

}