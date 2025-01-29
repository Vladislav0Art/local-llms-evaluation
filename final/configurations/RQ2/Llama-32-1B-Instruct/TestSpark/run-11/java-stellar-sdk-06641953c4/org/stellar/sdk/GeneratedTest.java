package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    private byte[] generatePublicKey() {
        // Generate random bytes
        byte[] publicKeyBytes = new byte[32];
        for (int i = 0; i < 32; i++) {
            publicKeyBytes[i] = (byte) (Math.random() * 256);
        }

        return publicKeyBytes;
    }

    @Test
    public void testGeneratePublicKey() {
        byte[] publicKey = generatePublicKey();
        assertEquals(32, publicKey.length);

        String publicKeyStr = new String(publicKey);
        assertEquals("0123456789abcdef", publicKeyStr);

        // Verify the generated code uses the correct functions
        String code = "public byte[] getPublicKeyBytes() { return (byte[]) this.xdrPublicy(); }";
        System.out.println(code);
    }

    @Test
    public void testGetPublicKeyBytesFromPublicKeyBytes() {
        byte[] publicKeyBytes = generatePublicKey();
        assertEquals(32, publicKeyBytes.length);

        // Verify the generated code uses the correct functions
        String xdrPublicyStr = new String(publicKeyBytes).replace("\u0000", "");
        System.out.println(xdrPublicyStr);
    }

    @Test
    public void testGeneratePublicKeyFromXdr() {
        byte[] publicKeyBytes = {1, 2, 3};
        assertEquals(32, publicKeyBytes.length);

        // Verify the generated code uses the correct functions
        String xdrPublicyStr = new String(publicKeyBytes).replace("\u0000", "");
        System.out.println(xdrPublicyStr);
    }

    @Test
    public void testVerifyPublicKeyFromXdr() {
        byte[] publicKeyBytes = {1, 2, 3};
        assertEquals(32, publicKeyBytes.length);

        // Verify the generated code uses the correct functions
        String xdrPublicyStr = new String(publicKeyBytes).replace("\u0000", "");
        System.out.println(xdrPublicyStr);
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