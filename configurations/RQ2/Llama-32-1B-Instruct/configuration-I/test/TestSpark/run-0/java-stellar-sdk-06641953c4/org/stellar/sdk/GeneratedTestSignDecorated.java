package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSignDecorated {

    @Test
    public void testSignDecorated() {
        byte[] data = "some-data".getBytes();
        SignatureHint hint = EdDSAPublicKey.generate().getSignatureHint();
        KeyPair keyPair = new KeyPair(KeyPair.fromPublicKey(hint.getPublic()));
        DecoratedSignature signature = keyPair.signDecorated(data);
        assertNotNull(signature);
    }

}