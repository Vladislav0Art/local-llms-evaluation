package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedSignEmptySeedAndDataShouldThrowException {

    @Test
    public void signEmptySeedAndDataShouldThrowException() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new char[0]);
        try {
            keyPair.sign(data);
            fail("Expected exception");
        } catch (Exception e) {
            // Expected
        }
    }

}