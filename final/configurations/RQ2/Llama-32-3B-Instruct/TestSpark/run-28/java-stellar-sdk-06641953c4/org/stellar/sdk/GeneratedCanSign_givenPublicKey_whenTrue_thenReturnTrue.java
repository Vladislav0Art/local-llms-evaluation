package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.io.ByteArrayOutputStream;

public class GeneratedCanSign_givenPublicKey_whenTrue_thenReturnTrue {

    @Test
    public void canSign_givenPublicKey_whenTrue_thenReturnTrue() throws Exception {
        EdDSAPublicKey publicKey = null; // not used in canSign method, just a placeholder
        assertTrue(KeyPair.canSign(publicKey));
    }

}