package org.stellar.sdk;

import org.stellar.sdk.DecoratedSignature;
import org.stellar.sdk.SignatureHint;
import org.stellar.sdk.SignerKey;
import org.stellar.sdk.XdrPublicKey;
import org.stellar.sdk.XdrSignerKey;

import java.util.Arrays;

public class GeneratedTestSignDecorated {

    @Test
    public void testSignDecorated() {
        String signature = SignatureHelper.generateSignature(EdDSAPublicKey.fromSeed("123456789012345678901234567890").serialize(), "Hello, World!", 1);
        KeyPair key = new KeyPair(EdDSAPublicKey.fromSeed("123456789012345678901234567890").serialize());
        assertTrue(key.signDecorated(signature).equals(signature));
    }

}