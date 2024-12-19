package org.stellar.sdk;

import org.stellar.sdk.DecoratedSignature;
import org.stellar.sdk.SignatureHint;
import org.stellar.sdk.SignerKey;
import org.stellar.sdk.XdrPublicKey;
import org.stellar.sdk.XdrSignerKey;

import java.util.Arrays;

public class GeneratedTestGetSecretSeed {

    @Test
    public void testGetSecretSeed() {
        char[] secretSeed = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        KeyPair key = new KeyPair(EdDSAPublicKey.fromSeed(secretSeed).serialize());
        assertEquals(secretSeed, key.getSecretSeed());
    }

}