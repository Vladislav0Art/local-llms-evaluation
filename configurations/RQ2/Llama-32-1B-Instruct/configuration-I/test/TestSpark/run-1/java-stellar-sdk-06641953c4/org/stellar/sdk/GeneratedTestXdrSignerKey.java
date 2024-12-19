package org.stellar.sdk;

import org.stellar.sdk.DecoratedSignature;
import org.stellar.sdk.SignatureHint;
import org.stellar.sdk.SignerKey;
import org.stellar.sdk.XdrPublicKey;
import org.stellar.sdk.XdrSignerKey;

import java.util.Arrays;

public class GeneratedTestXdrSignerKey {

    @Test
    public void testXdrSignerKey() {
        SignerKey signerKey = new SignerKey();
        KeyPair key = new KeyPair(EdDSAPublicKey.fromSeed("123456789012345678901234567890").serialize(), signerKey);
        assertNotNull(key);
    }

}