package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCanSign_Works {

    @Test
    public void canSign_Works() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(keyPair.canSign());
    }

}