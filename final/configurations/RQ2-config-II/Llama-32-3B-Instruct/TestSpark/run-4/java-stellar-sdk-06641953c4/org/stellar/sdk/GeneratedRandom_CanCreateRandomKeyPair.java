package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedRandom_CanCreateRandomKeyPair {

    @Test
    public void random_CanCreateRandomKeyPair() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

}