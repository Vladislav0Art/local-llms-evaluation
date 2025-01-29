package org.stellar.sdk;

import com.google.common.base.Preconditions;
import org.junit.jupiter.api.Test;

import java.security.MessageDigest;
import java.util.Arrays;

public class GeneratedTestVerify_SingleSeedShouldReturnFalse {

    private static final String SECRET_SEED = "1234567890abcdef";
    private static final EdDSAPublicKey PUBLIC_KEY = new EdDSAPublicKey(SECRET_SEED);
    private static final byte[] BIP39_seed = BIP39
    seeds[SECRET_SEED.length()/2];

    @Test
    public void testVerify_SingleSeedShouldReturnFalse() {
        byte[] data = BIP39 seeds[SECRET_SEED.length() / 2].getBytes();
        boolean verified = KeyPair.verify(data, signature);
        Preconditions.assertFalse(verified, "Expected false verification");
    }

}