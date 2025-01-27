package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class GeneratedEquals_GivenSameKeyPairs_ReturnsTrue {

    @Test
    public void equals_GivenSameKeyPairs_ReturnsTrue() {
        KeyPair keyPair1 = new KeyPair(KeyPairGenerator.generate());
        KeyPair keyPair2 = new KeyPair(KeyPairGenerator.generate());
        assertTrue(keyPair1.equals(keyPair2));
    }

}