package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.KeyPair;
import java.security.SignatureException;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedGenerateKeypairWithCanSignMethodReturnsTrue {

    @Test
    public void generateKeypairWithCanSignMethodReturnsTrue() throws Exception {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertTrue(keyPair.canSign());
    }

}