package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestVerification_NoSignature {

    @Test
    public void testVerification_NoSignature() {
        byte[] data = "data_no_signature".getBytes();
        byte[] signature = null;
        assertFalse(keyPair.verify(data, signature));
    }

}