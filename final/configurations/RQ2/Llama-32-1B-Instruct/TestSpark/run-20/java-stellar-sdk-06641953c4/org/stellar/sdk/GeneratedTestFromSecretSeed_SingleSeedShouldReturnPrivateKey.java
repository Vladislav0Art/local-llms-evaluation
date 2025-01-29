package org.stellar.sdk;

import org.junit.jupiter.api.Test;

public class GeneratedTestFromSecretSeed_SingleSeedShouldReturnPrivateKey {

    @Test
    public void testFromSecretSeed_SingleSeedShouldReturnPrivateKey() {
        KeyPair keyPair = KeyPair.fromSecretSeed(SECRET_SEED);
        Preconditions.checkNotNull(keyPair, "Expected non-null KeyPair");
        EdDSAPrivateKeySpec privateKeySpec = (EdDSAPrivateKeySpec) keyPair.getPublicSpec();
        String privateBytes = new byte[0];
        try {
            privateKeySpec.generateKey(new java.security.SecureRandom());
        } catch (Exception e) {
        }
        assertEquals(SECRET_SEED, new String(privateBytes));
    }

}