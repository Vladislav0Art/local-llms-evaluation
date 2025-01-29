package org.stellar.sdk;

import org.junit.jupiter.api.Test;

public class GeneratedTestFromSecretSeed_SingleSeedShouldReturnKeyPairWithPrivateAndPublicKeys {

    @Test
    public void testFromSecretSeed_SingleSeedShouldReturnKeyPairWithPrivateAndPublicKeys() {
        KeyPair keyPair = KeyPair.fromSecretSeed(SECRET_SEED);
        Preconditions.checkNotNull(keyPair, "Expected non-null KeyPair");
        Preconditions.assertEquals(EdDSAPrivateKeySpec.valueOf(SECRET_SEED), keyPair.getPublicSpec());
        Preconditions.assertEquals(EdDSAPublicKey.class, keyPair.getPublicKey().getClass());
    }

}