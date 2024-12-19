package org.stellar.sdk;

import org.stellar.sdk.DecoratedSignature;
import org.stellar.sdk.SignatureHint;
import org.stellar.sdk.SignerKey;
import org.stellar.sdk.XdrPublicKey;
import org.stellar.sdk.XdrSignerKey;

import java.util.Arrays;

public class GeneratedTestSignatureHint {

    @Test
    public void testSignatureHint() {
        SignatureHint hint = new SignatureHint();
        KeyPair key = new KeyPair(EdDSAPublicKey.fromSeed("123456789012345678901234567890").serialize());
        assertTrue(key.getSignatureHint().equals(hint));
    }

}