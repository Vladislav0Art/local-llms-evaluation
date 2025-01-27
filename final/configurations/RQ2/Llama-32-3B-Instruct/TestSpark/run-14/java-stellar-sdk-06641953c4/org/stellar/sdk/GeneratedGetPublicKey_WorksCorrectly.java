package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPublicKey_WorksCorrectly {

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

}