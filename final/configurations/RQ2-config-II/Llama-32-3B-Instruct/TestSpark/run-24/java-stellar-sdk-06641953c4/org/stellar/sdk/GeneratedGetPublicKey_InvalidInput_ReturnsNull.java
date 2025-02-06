package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPublicKey_InvalidInput_ReturnsNull {

    @Test
    public void getPublicKey_InvalidInput_ReturnsNull() {
        EdDSAPublicKey publicKey = null;
        KeyPair keyPair = new KeyPair(publicKey);
        assertNull(keyPair.getPublicKey());
    }

}