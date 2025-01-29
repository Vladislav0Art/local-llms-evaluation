package org.stellar.sdk;

import org.junit.jupiter.api.Test;

public class GeneratedTestFromBip39_SingleSeedShouldReturnPublicKeyWithPrivateKey {

    @Test
    public void testFromBip39_SingleSeedShouldReturnPublicKeyWithPrivateKey() {
        KeyPair keyPair = KeyPair.fromBip39(SECRET_SEED);
        Preconditions.checkNotNull(keyPair, "Expected non-null KeyPair");
        EdDSAPrivateKeySpec privateKeySpec = (EdDSAPrivateKeySpec) keyPair.getPublicSpec();
        EdDSAPublicKey publicKeySpec = (EdDSAPublicKey) keyPair.getPublicKey();
        String publicBytes = new byte[0];
        try {
            privateKeySpec.generateKey(new java.security.SecureRandom());
        } catch (Exception e) {
        }
        assertEquals(SECRET_SEED, new String(publicBytes));
    }

}