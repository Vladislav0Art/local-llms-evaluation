package org.stellar.sdk;

public class GeneratedTestGetAccountId {

    @Test
    public void testGetAccountId() {
        String accountId = "1234567890abcdef";
        KeyPair key = new KeyPair(fromAccountId(accountId));
        assertEquals(accountId, key.getAccountId());
    }

}