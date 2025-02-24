package org.stellar.sdk;

public class GeneratedTestFromSecretSeed_charArray {

    @Test
    public void testFromSecretSeed_charArray() {
        char[] seed = "Test Seed".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}