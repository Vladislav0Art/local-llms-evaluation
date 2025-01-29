package org.stellar.sdk;

import org.junit.jupiter.api.Test;

public class GeneratedTestFromSecretSeed_SingleSeedShouldReturnPublicKey {

    @Test
    public void testFromSecretSeed_SingleSeedShouldReturnPublicKey() {
        KeyPair keyPair = KeyPair.fromSecretSeed(SECRET_SEED);
        Preconditions.checkNotNull(keyPair, "Expected non-null KeyPair");
        EdDSAPublicKey publicKeySpec = (EdDSAPublicKey) keyPair.getPublicSpec();
        String publicBytes = new byte[0];
        try {
            publicKeySpec.generateKey(new java.security.SecureRandom());
        } catch (Exception e) {
        }
        assertEquals(SECRET_SEED, new String(publicBytes));
    }

}