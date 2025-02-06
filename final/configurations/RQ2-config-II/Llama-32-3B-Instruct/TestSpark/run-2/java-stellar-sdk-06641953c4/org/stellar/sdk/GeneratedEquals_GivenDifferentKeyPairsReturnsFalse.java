package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.util.Arrays;

public class GeneratedEquals_GivenDifferentKeyPairsReturnsFalse {

    @Test
    public void equals_GivenDifferentKeyPairsReturnsFalse() {
        KeyPair keyPair1 = new KeyPair(new EdDSAPublicKey("seed1".getBytes()));
        KeyPair keyPair2 = new KeyPair(new EdDSAPublicKey("seed2".getBytes()));
        assertFalse(keyPair1.equals(keyPair2));
    }

}