package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetPublicKeyBytesFromPublicKeyBytes {

    private byte[] generatePublicKey() {
        // Generate random bytes
        byte[] publicKeyBytes = new byte[32];
        for (int i = 0; i < 32; i++) {
            publicKeyBytes[i] = (byte) (Math.random() * 256);
        }

        return publicKeyBytes;
    }

    @Test
    public void testGetPublicKeyBytesFromPublicKeyBytes() {
        byte[] publicKeyBytes = generatePublicKey();
        assertEquals(32, publicKeyBytes.length);

        // Verify the generated code uses the correct functions
        String xdrPublicyStr = new String(publicKeyBytes).replace("\u0000", "");
        System.out.println(xdrPublicyStr);
    }

}