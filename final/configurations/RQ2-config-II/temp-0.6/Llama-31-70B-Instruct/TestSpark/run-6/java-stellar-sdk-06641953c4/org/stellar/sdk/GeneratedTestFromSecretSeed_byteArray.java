package org.stellar.sdk;

public class GeneratedTestFromSecretSeed_byteArray {

    @Test
    public void testFromSecretSeed_byteArray() {
        byte[] seed = "Test Seed".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}