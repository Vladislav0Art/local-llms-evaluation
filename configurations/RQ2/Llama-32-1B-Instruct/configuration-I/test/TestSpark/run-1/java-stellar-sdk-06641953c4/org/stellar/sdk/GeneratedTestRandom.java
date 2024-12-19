package org.stellar.sdk;

import org.stellar.sdk.DecoratedSignature;
import org.stellar.sdk.SignatureHint;
import org.stellar.sdk.SignerKey;
import org.stellar.sdk.XdrPublicKey;
import org.stellar.sdk.XdrSignerKey;

import java.util.Arrays;

public class GeneratedTestRandom {

    @Test
    public void testRandom() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            byte[] seed = new byte[16];
            random.nextBytes(seed);
            KeyPair key = KeyPair.fromSecretSeed(seed);
            assertNotNull(key);
            assertEquals(16, key.getSecretSeed().length);
        }
    }

}