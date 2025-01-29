package org.stellar.sdk;

public class GeneratedTestFromAccountId {

    @Test
    public void testFromAccountId() {
        String accountId = "test-account";
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new byte[]{1, 2, 3});
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertEquals(publicKey, keyPair.getPublicKey());
    }

}