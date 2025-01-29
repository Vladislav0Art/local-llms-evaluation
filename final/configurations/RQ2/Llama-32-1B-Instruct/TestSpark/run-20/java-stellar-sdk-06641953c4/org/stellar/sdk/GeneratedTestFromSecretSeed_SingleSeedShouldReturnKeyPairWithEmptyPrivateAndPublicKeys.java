package org.stellar.sdk;

import com.google.common.base.Preconditions;
import org.junit.jupiter.api.Test;

import java.security.MessageDigest;
import java.util.Arrays;

public class GeneratedTestFromSecretSeed_SingleSeedShouldReturnKeyPairWithEmptyPrivateAndPublicKeys {

    private static final String SECRET_SEED = "1234567890abcdef";
    private static final EdDSAPublicKey PUBLIC_KEY = new EdDSAPublicKey(SECRET_SEED);
    private static final byte[] BIP39_seed = BIP39
    seeds[SECRET_SEED.length()/2];

    @Test
    public void testFromSecretSeed_SingleSeedShouldReturnKeyPairWithEmptyPrivateAndPublicKeys() {
        KeyPair keyPair = KeyPair.fromSecretSeed(SECRET_SEED);
        Preconditions.checkNotNull(keyPair, "Expected non-null KeyPair");
        Preconditions.assertEquals(EdDSAPrivateKeySpec.valueOf(SECRET_SEED), keyPair.getPublicSpec());
        Preconditions.assertEquals(EdDSAPublicKeySpec.valueOf(""), keyPair.getPrivateSpec());
    }

}