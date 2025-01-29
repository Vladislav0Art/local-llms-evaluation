package org.stellar.sdk;

import com.google.common.base.Preconditions;
import org.junit.jupiter.api.Test;

import java.security.MessageDigest;
import java.util.Arrays;

public class GeneratedTestFromXdrSignerKey_SingleSeedShouldReturnXdrSignerKey {

    private static final String SECRET_SEED = "1234567890abcdef";
    private static final EdDSAPublicKey PUBLIC_KEY = new EdDSAPublicKey(SECRET_SEED);
    private static final byte[] BIP39_seed = BIP39
    seeds[SECRET_SEED.length()/2];

    @Test
    public void testFromXdrSignerKey_SingleSeedShouldReturnXdrSignerKey() {
        SignerKey signerKey = new SignerKey(BIP39_seed);
        KeyPair keyPair = KeyPair.fromXdrSignerKey(signerKey);
        Preconditions.checkNotNull(keyPair, "Expected non-null KeyPair");
    }

}