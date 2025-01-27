package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.util.Arrays;

public class GeneratedCanSign_GivenPublicKeyCanSign_ReturnsTrue {

    @Test
    public void canSign_GivenPublicKeyCanSign_ReturnsTrue() {
        EdDSAPublicKey publicKey = generateRandomEdDSSAPublicKey();
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(keyPair.canSign());
    }

    private static EdDSAPublicKey generateRandomEdDSSAPublicKey() {
        // implementation to generate random EdDSAPublicKey
    }

}