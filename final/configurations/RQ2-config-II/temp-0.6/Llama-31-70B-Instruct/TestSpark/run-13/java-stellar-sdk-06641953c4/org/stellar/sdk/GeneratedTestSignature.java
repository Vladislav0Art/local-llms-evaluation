package org.stellar.sdk;

public class GeneratedTestSignature {

    @Test
    public void testSignature() throws SignatureException, IOException {
        KeyPair keyPair = KeyPair.random();

        byte[] data = new byte[]{1, 2, 3};
        byte[] signature = keyPair.sign(data);

        assertArrayEquals(signature, keyPair.sign(data));
        assertTrue(keyPair.verify(data, signature));
    }

}