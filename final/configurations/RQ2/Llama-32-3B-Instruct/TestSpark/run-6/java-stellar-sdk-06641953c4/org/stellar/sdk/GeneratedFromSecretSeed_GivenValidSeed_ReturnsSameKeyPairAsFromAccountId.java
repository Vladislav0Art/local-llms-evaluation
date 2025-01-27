package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.util.Arrays;

public class GeneratedFromSecretSeed_GivenValidSeed_ReturnsSameKeyPairAsFromAccountId {

    @Test
    public void fromSecretSeed_GivenValidSeed_ReturnsSameKeyPairAsFromAccountId() throws Exception {
        byte[] seed = new byte[32];
        Arrays.fill(seed, (byte) 0);
        KeyPair keyPair1 = KeyPair.fromSecretSeed(seed);
        String accountId = "account_id";
        KeyPair keyPair2 = KeyPair.fromAccountId(accountId);
        assertEquals(keyPair1, keyPair2);
    }

    private static KeyPair generateRandomKeyPair() {
        // implementation to generate random KeyPair
    }

}