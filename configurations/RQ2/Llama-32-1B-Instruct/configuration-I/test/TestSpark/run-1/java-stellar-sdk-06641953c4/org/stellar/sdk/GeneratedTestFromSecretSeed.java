package org.stellar.sdk;

import org.stellar.sdk.DecoratedSignature;
import org.stellar.sdk.SignatureHint;
import org.stellar.sdk.SignerKey;
import org.stellar.sdk.XdrPublicKey;
import org.stellar.sdk.XdrSignerKey;

import java.util.Arrays;

public class GeneratedTestFromSecretSeed {

    @Test
    public void testFromSecretSeed() {
        char[] secretSeed = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        KeyPair key = KeyPair.fromSecretSeed(secretSeed);
        assertNotNull(key);
        assertEquals(secretSeed.length, key.getSecretSeed().length);
    }

}