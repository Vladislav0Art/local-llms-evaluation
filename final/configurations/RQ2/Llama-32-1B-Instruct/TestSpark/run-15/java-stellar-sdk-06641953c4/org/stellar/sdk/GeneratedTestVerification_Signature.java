package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestVerification_Signature {

    @Test
    public void testVerification_Signature() {
        byte[] data = "data".getBytes();
        byte[] signature = "signature".getBytes();
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey("eddsa_key"));
        assertTrue(keyPair.verify(data, signature));
    }

}