package org.stellar.sdk;

import org.stellar.sdk.DecoratedSignature;
import org.stellar.sdk.SignatureHint;
import org.stellar.sdk.SignerKey;
import org.stellar.sdk.XdrPublicKey;
import org.stellar.sdk.XdrSignerKey;

import java.util.Arrays;

public class GeneratedTestFromXdrSignerKey {

    @Test
    public void testFromXdrSignerKey() {
        XdrSignerKey signerKey = new XdrSignerKey().toByteArray();
        KeyPair key = KeyPair.fromXdrSignerKey(signerKey);
        assertNotNull(key);
    }

}