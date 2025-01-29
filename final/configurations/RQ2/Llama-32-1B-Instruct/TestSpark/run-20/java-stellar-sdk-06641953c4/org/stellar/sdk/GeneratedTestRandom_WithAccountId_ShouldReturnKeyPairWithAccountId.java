package org.stellar.sdk;

import com.google.common.base.Preconditions;
import org.junit.jupiter.api.Test;

import java.security.MessageDigest;
import java.util.Arrays;

public class GeneratedTestRandom_WithAccountId_ShouldReturnKeyPairWithAccountId {

    private static final String SECRET_SEED = "1234567890abcdef";
    private static final EdDSAPublicKey PUBLIC_KEY = new EdDSAPublicKey(SECRET_SEED);
    private static final byte[] BIP39_seed = BIP39
    seeds[SECRET_SEED.length()/2];

    @Test
    public void testRandom_WithAccountId_ShouldReturnKeyPairWithAccountId() {
        String accountId = UUID.randomUUID().toString();
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        Preconditions.checkNotNull(keyPair, "Expected non-null KeyPair");
    }

}