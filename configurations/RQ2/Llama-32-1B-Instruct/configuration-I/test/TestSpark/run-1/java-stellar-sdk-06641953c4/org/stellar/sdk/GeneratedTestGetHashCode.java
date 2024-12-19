package org.stellar.sdk;

import org.stellar.sdk.DecoratedSignature;
import org.stellar.sdk.SignatureHint;
import org.stellar.sdk.SignerKey;
import org.stellar.sdk.XdrPublicKey;
import org.stellar.sdk.XdrSignerKey;

import java.util.Arrays;

public class GeneratedTestGetHashCode {

    @Test
    public void testGetHashCode() {
        char[] secretSeed = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String accountId = "123456789012345678901234567890";
        KeyPair key1 = new KeyPair(EdDSAPublicKey.fromSeed(secretSeed).serialize(), accountId);
        String accountId2 = "987654321098765432109876543210";
        KeyPair key2 = new KeyPair(EdDSAPublicKey.fromSeed(secretSeed).serialize(), accountId2);

        assertEquals(key1.hashCode(), key2.hashCode());
    }

}