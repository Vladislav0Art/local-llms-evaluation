package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestVerifyValidSignature {

    @Test
    public void testVerifyValidSignature() throws Exception {
        KeyPair keyPair = new KeyPair(new byte[]{1, 2, 3}, new byte[]{4, 5, 6});
        Signature signature = new Signature(keyPair.sign(new byte[]{7, 8, 9}));
        assertTrue(keyPair.verify(signature.getData()));
    }

}