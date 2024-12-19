package org.stellar.sdk;

import org.stellar.sdk.DecoratedSignature;
import org.stellar.sdk.SignatureHint;
import org.stellar.sdk.SignerKey;
import org.stellar.sdk.XdrPublicKey;
import org.stellar.sdk.XdrSignerKey;

import java.util.Arrays;

public class GeneratedTestCanSign {

    @Test
    public void testCanSign() {
        KeyPair key = new KeyPair(EdDSAPublicKey.fromSeed("123456789012345678901234567890"));
        assertTrue(key.canSign());
    }

}