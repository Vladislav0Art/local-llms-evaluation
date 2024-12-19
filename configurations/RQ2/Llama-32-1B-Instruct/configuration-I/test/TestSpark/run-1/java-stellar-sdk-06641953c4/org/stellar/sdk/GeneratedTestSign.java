package org.stellar.sdk;

import org.stellar.sdk.DecoratedSignature;
import org.stellar.sdk.SignatureHint;
import org.stellar.sdk.SignerKey;
import org.stellar.sdk.XdrPublicKey;
import org.stellar.sdk.XdrSignerKey;

import java.util.Arrays;

public class GeneratedTestSign {

    @Test
    public void testSign() {
        char[] data = "1234567890".toCharArray();
        String signature = SignatureHelper.generateSignature(EdDSAPublicKey.fromSeed("123456789012345678901234567890").serialize(), data, 1);
        KeyPair key = new KeyPair(EdDSAPublicKey.fromSeed("123456789012345678901234567890").serialize());
        assertTrue(key.sign(data).equals(signature));
    }

}