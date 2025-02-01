package org.stellar.sdk;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedEqualTest {

    @Test
    public void equalTest() {
        // Test method "equals" using the same object
        KeyPair keyPair = KeyPair.random();
        assertTrue(keyPair.equals(keyPair));
    }

}