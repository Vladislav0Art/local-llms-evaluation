package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedEquals_GivenSameKeyPair_ReturnsTrue {

    @Test
    public void equals_GivenSameKeyPair_ReturnsTrue() {
        KeyPair keyPair1 = new KeyPair(new EdDSAPublicKey());
        KeyPair keyPair2 = new KeyPair(new EdDSAPublicKey());
        assertTrue(keyPair1.equals(keyPair2));
    }

}