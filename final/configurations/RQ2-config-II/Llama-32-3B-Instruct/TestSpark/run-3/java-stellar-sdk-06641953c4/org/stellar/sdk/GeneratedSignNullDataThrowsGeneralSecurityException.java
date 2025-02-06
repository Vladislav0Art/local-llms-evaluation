package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSignNullDataThrowsGeneralSecurityException {

    @Test
    public void signNullDataThrowsGeneralSecurityException() throws GeneralSecurityException, IOException {
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.generate());
        assertThrows(GeneralSecurityException.class, () -> keyPair.sign(null));
    }

}