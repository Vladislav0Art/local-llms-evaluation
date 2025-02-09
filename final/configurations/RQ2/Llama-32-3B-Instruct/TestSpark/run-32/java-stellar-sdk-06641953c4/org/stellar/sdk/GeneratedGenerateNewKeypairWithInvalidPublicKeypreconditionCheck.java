package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.KeyPair;
import java.security.SignatureException;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedGenerateNewKeypairWithInvalidPublicKeypreconditionCheck {

    @Test
    public void generateNewKeypairWithInvalidPublicKeypreconditionCheck() {
        try {
            KeyPair keyPair = new KeyPair(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }

        try {
            KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
            fail("Expected null value for public key");
        } catch (Exception e) {
        }
    }

}