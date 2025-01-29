package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGeneratePublicKeyFromData {

    private byte[] generatePublicKey() {
        // Generate random bytes
        byte[] publicKeyBytes = new byte[32];
        for (int i = 0; i < 32; i++) {
            publicKeyBytes[i] = (byte) (Math.random() * 256);
        }

        return publicKeyBytes;
    }

    @Test
    public void testGeneratePublicKeyFromData() {
        byte[] data = {1, 2, 3};
        assertEquals(32, data.length);

        // Verify the generated code uses the correct functions
        String xdrPayloadDecoratedStr = new String(data).replace("\u0000", "");
        System.out.println(xdrPayloadDecoratedStr);
    }

}