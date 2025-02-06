package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSignNonEmptyDataReturnsCorrectSignature {

    @Test
    public void signNonEmptyDataReturnsCorrectSignature() throws GeneralSecurityException, IOException {
        byte[] data = "valid_data".getBytes();
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.generate());
        byte[] signature = keyPair.sign(data);
        assertNotNull(signature);
    }

}