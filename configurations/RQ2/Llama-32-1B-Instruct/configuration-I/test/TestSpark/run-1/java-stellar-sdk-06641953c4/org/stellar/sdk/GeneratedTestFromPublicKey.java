package org.stellar.sdk;

import org.stellar.sdk.DecoratedSignature;
import org.stellar.sdk.SignatureHint;
import org.stellar.sdk.SignerKey;
import org.stellar.sdk.XdrPublicKey;
import org.stellar.sdk.XdrSignerKey;

import java.util.Arrays;

public class GeneratedTestFromPublicKey {

    @Test
    public void testFromPublicKey() {
        byte[] publicKey = KeyPair.fromPublicKey(new EdDSAPublicKey().serialize());
        KeyPair key = new KeyPair(publicKey);
        assertNotNull(key);
    }

}