package org.stellar.sdk;

import org.stellar.sdk.DecoratedSignature;
import org.stellar.sdk.SignatureHint;
import org.stellar.sdk.SignerKey;
import org.stellar.sdk.XdrPublicKey;
import org.stellar.sdk.XdrSignerKey;

import java.util.Arrays;

public class GeneratedTestXdrPublicKey {

    @Test
    public void testXdrPublicKey() {
        XdrPublicKey publicKey = KeyPair.fromXdrPublicKey(new EdDSAPublicKey().serialize());
        assertNotNull(publicKey);
    }

}