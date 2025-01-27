package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class GeneratedEquals_GivenDifferentKeyPairs_ReturnsFalse {

    @Test
    public void equals_GivenDifferentKeyPairs_ReturnsFalse() {
        KeyPair keyPair1 = new KeyPair(KeyPairGenerator.generate());
        KeyPair keyPair2 = new KeyPair(KeyPairGenerator.generate().duplicate());
        assertFalse(keyPair1.equals(keyPair2));
    }

}