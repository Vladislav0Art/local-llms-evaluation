package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.KeyPair;
import java.security.SignatureException;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedGetPublicKeyFromKeypreconditionCheckReturnsNotNullValue {

    @Test
    public void getPublicKeyFromKeypreconditionCheckReturnsNotNullValue() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertNotNull(keyPair.getPublicKey());
    }

}