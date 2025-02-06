package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedRandom_NewKey {

    @Test
    public void random_NewKey() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getPublicKey());
    }

}