package org.stellar.sdk;

public class GeneratedFromSecretSeed_SecretSeedIsValid_true {

    @Test
    public void fromSecretSeed_SecretSeedIsValid_true() throws Exception {
        char[] seed = "validseed".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair.getPublicKey());
    }

}