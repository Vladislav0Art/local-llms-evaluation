package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromPublicKeyReturnsCorrectKeyPair {

    @Test
    public void fromPublicKeyReturnsCorrectKeyPair() throws IOException {
        byte[] publicKey = EdDSAPublicKey.getEncoded();
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
        assertEquals(EdDSAPublicKey.getEncoded(), keyPair.getPublicKey());
    }

}