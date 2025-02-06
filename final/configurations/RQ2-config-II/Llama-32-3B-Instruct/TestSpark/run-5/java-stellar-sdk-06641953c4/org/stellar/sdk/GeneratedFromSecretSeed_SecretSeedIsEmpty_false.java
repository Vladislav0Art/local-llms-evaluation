package org.stellar.sdk;

public class GeneratedFromSecretSeed_SecretSeedIsEmpty_false {

    @Test
    public void fromSecretSeed_SecretSeedIsEmpty_false() throws Exception {
        char[] seed = "".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNull(keyPair.getPublicKey());
    }

}