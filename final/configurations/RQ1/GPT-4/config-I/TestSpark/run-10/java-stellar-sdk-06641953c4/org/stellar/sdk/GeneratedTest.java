package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void canSignTestWithPrivateKey() {
        KeyPair keyPair = KeyPair.fromSecretSeed("SCZANGBA5YHTNYVVV4C3U252E2B6P6F5T3U6MM63WBSBZATAQI3EBTQ4");
        assertTrue(keyPair.canSign());
    }

    @Test
    public void canSignTestWithoutPrivateKey() {
        KeyPair keyPair = KeyPair.fromAccountId("GD5T6IPRNCKFOHQWTJ3OOHYXDSM7GJN7K3E3Y6RMZ44ZJ2JT4ZT5YJPA");
        assertFalse(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedTest() {
        KeyPair expectedKeyPair = KeyPair.random();
        String expectedSeed = new String(expectedKeyPair.getSecretSeed());
        KeyPair actualKeyPair = KeyPair.fromSecretSeed(expectedSeed);
        assertEquals(expectedKeyPair.getAccountId(), actualKeyPair.getAccountId());
    }

    @Test
    public void fromAccountIdTest() {
        KeyPair expectedKeyPair = KeyPair.random();
        String expectedAccountId = expectedKeyPair.getAccountId();
        KeyPair actualKeyPair = KeyPair.fromAccountId(expectedAccountId);
        assertEquals(expectedKeyPair.getAccountId(), actualKeyPair.getAccountId());
    }

    @Test
    public void signTest() {
        KeyPair keyPair = KeyPair.random();
        String data = "Test Data";
        byte[] signature = keyPair.sign(data.getBytes(StandardCharsets.UTF_8));
        assertNotNull(signature);
    }

    @Test
    public void signTestWithoutPrivateKey() {
        KeyPair keyPair = KeyPair.fromAccountId("GD5T6IPRNCKFOHQWTJ3OOHYXDSM7GJN7K3E3Y6RMZ44ZJ2JT4ZT5YJPA");
        String data = "Test Data";
        keyPair.sign(data.getBytes(StandardCharsets.UTF_8));
    }

    @Test
    public void verifyTest() {
        KeyPair keyPair = KeyPair.random();
        String data = "Test Data";
        byte[] signature = keyPair.sign(data.getBytes(StandardCharsets.UTF_8));
        assertTrue(keyPair.verify(data.getBytes(StandardCharsets.UTF_8), signature));
    }

    @Test
    public void verifyTestInvalid() {
        KeyPair keyPair = KeyPair.random();
        byte[] invalidSignature = "invalid_signature".getBytes(StandardCharsets.UTF_8);
        String data = "Test Data";
        keyPair.verify(data.getBytes(StandardCharsets.UTF_8), invalidSignature);
    }

}