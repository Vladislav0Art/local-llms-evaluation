package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedRandom_HasUniquePublicKey {

    @Test
    public void random_HasUniquePublicKey() {
        byte[] publicKey1 = KeyPair.random().getPublicKey();
        byte[] publicKey2 = KeyPair.random().getPublicKey();

        assertNotEquals(publicKey1, publicKey2);
    }

}