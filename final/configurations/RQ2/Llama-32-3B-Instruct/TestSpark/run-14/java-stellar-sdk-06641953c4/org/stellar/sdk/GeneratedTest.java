package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void canSign_ReturnsTrue() {
        // Arrange
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());

        // Act
        boolean result = keyPair.canSign();

        // Assert
        assertTrue(result);
    }

    @Test
    public void fromSecretSeed_WorksWithEmptyStringSeed() throws Exception {
        // Arrange
        byte[] seed = " ".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        // Act and Assert
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeed_WorksWithBip39Seed() throws Exception {
        // Arrange
        byte[] bip39Seed = new byte[16];
        Arrays.fill(bip39Seed, (byte) 0x01);
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, 1);

        // Act and Assert
        assertNotNull(keyPair);
    }

    @Test
    public void fromAccountId_ReturnsNull() {
        // Arrange
        String accountId = "account_id";

        // Act and Assert
        assertNull(KeyPair.fromAccountId(accountId));
    }

    @Test
    public void getPublicKey_WorksCorrectly() throws Exception {
        // Arrange
        byte[] publicKey = new byte[32];
        Arrays.fill(publicKey, (byte) 0x01);
        KeyPair keyPair = KeyPair.fromBip39Seed(publicKey, 1);

        // Act and Assert
        ByteArrayOutputStream expectedOutput = new ByteArrayOutputStream();
        XdrDataOutputStream xdrDataOutputStream = new XdrDataOutputStream(expectedOutput);
        KeyPair.toXdr(xdrDataOutputStream, keyPair);
        byte[] calculatedPublicKey = expectedOutput.toByteArray();

        assertArrayEquals(publicKey, calculatedPublicKey);
    }

    @Test
    public void sign_WorksCorrectly() throws Exception {
        // Arrange
        byte[] data = new byte[16];
        Arrays.fill(data, (byte) 0x01);
        KeyPair keyPair = KeyPair.fromSecretSeed(bip39Seed);

        // Act and Assert
        ByteArrayOutputStream expectedOutput = new ByteArrayOutputStream();
        XdrDataOutputStream xdrDataOutputStream = new XdrDataOutputStream(expectedOutput);
        byte[] signature = keyPair.sign(data);
        KeyPair.toXdr(xdrDataOutputStream, keyPair);
        byte[] calculatedSignature = expectedOutput.toByteArray();

        assertNotNull(signature);
    }

    @Test
    public void getSecretSeed_WorksCorrectly() {
        // Arrange
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());

        // Act and Assert
        char[] secretSeed = keyPair.getSecretSeed();
        assertNotNull(secretSeed);

        assertEquals(16, secretSeed.length);
    }

    @Test
    public void getAccountId_WorksCorrectly() {
        // Arrange
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());

        // Act and Assert
        String accountId = keyPair.getAccountId();
        assertNotNull(accountId);

        assertEquals(8, accountId.length());
    }

}