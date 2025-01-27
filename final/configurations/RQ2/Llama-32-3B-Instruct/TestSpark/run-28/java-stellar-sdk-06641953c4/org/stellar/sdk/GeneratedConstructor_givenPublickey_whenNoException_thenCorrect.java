package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.io.ByteArrayOutputStream;

public class GeneratedConstructor_givenPublickey_whenNoException_thenCorrect {

    @Test
    public void constructor_givenPublickey_whenNoException_thenCorrect() {
        EdDSAPublicKey publicKey = null; // not used in constructor, just a placeholder
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
    }

}