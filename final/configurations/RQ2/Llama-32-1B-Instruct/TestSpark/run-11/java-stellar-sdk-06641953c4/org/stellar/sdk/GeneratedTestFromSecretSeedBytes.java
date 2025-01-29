package org.stellar.sdk;

public class GeneratedTestFromSecretSeedBytes {

    @Test
    public void testFromSecretSeedBytes() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new byte[]{1, 2, 3});
        String secretSeed = "1234567890";
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed.getBytes());
        assertEquals(publicKey, keyPair.getPublicKey());
    }

}