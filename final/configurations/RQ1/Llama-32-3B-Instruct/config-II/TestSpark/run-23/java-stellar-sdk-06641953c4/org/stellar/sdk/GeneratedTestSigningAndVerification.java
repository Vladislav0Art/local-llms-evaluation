package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Random;

public class GeneratedTestSigningAndVerification {

    // fields, constructors, and all methods from the original class
}

// Test cases for KeyPair
import org.junit.Test;
import static org.junit.Assert .*;
        import java.util.Random;

public class KeyPairTest {

    @Test
    public void testSigningAndVerification() {
        // Generate a new key pair
        KeyPair keyPair = new KeyPair();

        // Sign some data with the private key
        byte[] signatureBytes = keyPair.sign(new byte[10]);

        // Verify that the signature is correct
        assertTrue(keyPair.verify(new byte[0], signatureBytes));

        // Attempt to sign with a different key pair
        try {
            new KeyPair().sign(new byte[0]);
            assert false;
        } catch (RuntimeException e) {
            // Expected exception
        }

        // Verify that signing and verification are reversible
        byte[] originalSignature = keyPair.sign(new byte[10]);
        assertTrue(keyPair.verify(new byte[10], originalSignature));
    }

}