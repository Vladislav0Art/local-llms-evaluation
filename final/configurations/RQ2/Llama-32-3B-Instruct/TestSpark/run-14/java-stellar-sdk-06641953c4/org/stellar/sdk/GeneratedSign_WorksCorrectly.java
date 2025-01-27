package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSign_WorksCorrectly {

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

}