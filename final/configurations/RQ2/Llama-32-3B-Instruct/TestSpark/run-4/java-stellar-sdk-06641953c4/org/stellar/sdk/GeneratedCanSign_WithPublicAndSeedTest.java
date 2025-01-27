package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCanSign_WithPublicAndSeedTest {

    @Test
    public void canSign_WithPublicAndSeedTest() {
        byte[] publicKey = {1, 2, 3};
        byte[] seed = "1234567890".getBytes();
        assertTrue(KeyPair.canSign(publicKey));
    }

}