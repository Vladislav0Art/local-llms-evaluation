package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSignPayloadDecorated {

    @Test
    public void testSignPayloadDecorated() {
        byte[] signerPayload = "some-signer-payload".getBytes();
        SignerKey signerKey = EdDSAPublicKey.generate();
        KeyPair keyPair = new KeyPair(KeyPair.fromXdrSignerKey(signerKey));
        DecoratedSignature signature = keyPair.signPayloadDecorated(signerPayload);
        assertNotNull(signature);
    }

}