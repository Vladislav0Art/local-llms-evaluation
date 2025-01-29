package org.stellar.sdk;

import org.junit.jupiter.api.Test;

public class GeneratedTestFromBip39_SingleSeedShouldReturnPublicKey {

    @Test
    public void testFromBip39_SingleSeedShouldReturnPublicKey() {
        KeyPair keyPair = KeyPair.fromBip39(SECRET_SEED);
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