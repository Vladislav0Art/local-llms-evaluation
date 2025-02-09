package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.KeyPair;
import java.security.SignatureException;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedNewKeyPairFromPublicKeypreconditionCheck {

    @Test
    public void newKeyPairFromPublicKeypreconditionCheck() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(keyPair instanceof KeyPair);
    }

}