package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedTest {

    @Test
    public void fromSecretSeedTest() {
        KeyPair expectedKeyPair = KeyPair.random();
        String expectedSeed = new String(expectedKeyPair.getSecretSeed());
        KeyPair actualKeyPair = KeyPair.fromSecretSeed(expectedSeed);
        assertEquals(expectedKeyPair.getAccountId(), actualKeyPair.getAccountId());
    }

}