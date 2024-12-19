package org.stellar.sdk;

import org.stellar.sdk.DecoratedSignature;
import org.stellar.sdk.SignatureHint;
import org.stellar.sdk.SignerKey;
import org.stellar.sdk.XdrPublicKey;
import org.stellar.sdk.XdrSignerKey;

import java.util.Arrays;

public class GeneratedTestVerify {

    @Test
    public void testVerify() {
        byte[] data = "Hello, World!".getBytes();
        String signature = SignatureHelper.generateSignature(EdDSAPublicKey.fromSeed("123456789012345678901234567890").serialize(), data, 1);
        KeyPair key = new KeyPair(EdDSAPublicKey.fromSeed("123456789012345678901234567890").serialize());
        assertTrue(key.verify(data, signature).equals(true));
    }

}