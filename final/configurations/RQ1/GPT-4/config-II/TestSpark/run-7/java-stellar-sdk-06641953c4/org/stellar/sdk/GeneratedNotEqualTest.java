package org.stellar.sdk;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedNotEqualTest {

    @Test
    public void notEqualTest() {
        // Test method "equals" using a different object
        KeyPair keyPair = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        assertFalse(keyPair.equals(keyPair2));
    }

}