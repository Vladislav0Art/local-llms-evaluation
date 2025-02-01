package org.stellar.sdk;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        // Test method "hashCode"
        KeyPair keyPair = KeyPair.random();
        int hashCode = keyPair.hashCode();
        assertTrue(hashCode != 0);
    }

}