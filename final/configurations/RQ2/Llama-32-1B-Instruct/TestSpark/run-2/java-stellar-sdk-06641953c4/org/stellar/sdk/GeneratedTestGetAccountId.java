package org.stellar.sdk;

public class GeneratedTestGetAccountId {

    @Test
    public void testGetAccountId() {
        String accountId = "accountId";
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromSecretSeed(accountId.toCharArray()));
        assertEquals(accountId, keyPair.getAccountId());
    }

}