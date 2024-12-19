package org.stellar.sdk;

import org.stellar.sdk.DecoratedSignature;
import org.stellar.sdk.SignatureHint;
import org.stellar.sdk.SignerKey;
import org.stellar.sdk.XdrPublicKey;
import org.stellar.sdk.XdrSignerKey;

import java.util.Arrays;

public class GeneratedTestFromXdrPublicKey {

    @Test
    public void testFromXdrPublicKey() {
        XdrPublicKey publicKey = new XdrPublicKey().toByteArray();
        KeyPair key = KeyPair.fromXdrPublicKey(publicKey);
        assertNotNull(key);
    }

}