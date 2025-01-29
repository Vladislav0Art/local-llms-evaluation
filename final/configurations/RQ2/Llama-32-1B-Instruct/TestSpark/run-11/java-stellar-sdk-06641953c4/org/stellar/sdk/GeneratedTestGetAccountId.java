package org.stellar.sdk;

public class GeneratedTestGetAccountId {

    @Test
    public void testGetAccountId() {
        String accountId = "test-account";
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(new byte[]{1, 2, 3}));
        assertEquals(accountId, keyPair.getAccountId());
    }

}