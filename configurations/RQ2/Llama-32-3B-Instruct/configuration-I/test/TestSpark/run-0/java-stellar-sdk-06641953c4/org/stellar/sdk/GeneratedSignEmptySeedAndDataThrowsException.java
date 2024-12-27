package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedSignEmptySeedAndDataThrowsException {

    @Test
    public void signEmptySeedAndDataThrowsException() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new char[0]);
        try {
            keyPair.sign(new byte[0]);
            fail("Expected exception");
        } catch (Exception e) {
            // Expected
        }
    }

}