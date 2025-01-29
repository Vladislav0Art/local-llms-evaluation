package org.stellar.sdk;

import com.google.common.base.Preconditions;
import org.junit.jupiter.api.Test;

import java.security.MessageDigest;
import java.util.Arrays;

public class GeneratedTestFromBip39Seed_SingleSeedShouldReturnBip39SeedPublicKey {

    private static final String SECRET_SEED = "1234567890abcdef";
    private static final EdDSAPublicKey PUBLIC_KEY = new EdDSAPublicKey(SECRET_SEED);
    private static final byte[] BIP39_seed = BIP39
    seeds[SECRET_SEED.length()/2];

    @Test
    public void testFromBip39Seed_SingleSeedShouldReturnBip39SeedPublicKey() {
        byte[] bip39Seed = BIP39 seeds[SECRET_SEED.length() / 2];
        KeyPair keyPair = KeyPair.fromSecretSeed(bip39Seed);
        Preconditions.checkNotNull(keyPair, "Expected non-null KeyPair");
    }

}