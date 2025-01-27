package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.util.Arrays;

public class GeneratedCanSign_GivenPublicPrivateKeyCannotSign_ReturnsFalse {

    @Test
    public void canSign_GivenPublicPrivateKeyCannotSign_ReturnsFalse() {
        EdDSAPublicKey publicKey = generateRandomEdDSSAPublicKey();
        EdDSAPrivateKey privateKey = generateRandomEdDSAPrivateKey(publicKey);
        KeyPair keyPair = new KeyPair(publicKey);
        assertFalse(keyPair.canSign());
    }

}