package org.stellar.sdk;

public class GeneratedFromSecretSeedByteArray_test {

    @Test
    public void fromSecretSeedByteArray_test() {
        char[] seed = "test".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}