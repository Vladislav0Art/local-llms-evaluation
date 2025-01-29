package org.stellar.sdk;

public class GeneratedTestSignature {

    @Test
    public void testSignature() throws SignatureException {
        byte[] data = "your_data_here".getBytes();
        DecoratedSignature signature = KeyPair.sign(data);
        assertNotNull(signature);
        assertEquals(DecoratedSignature.class, signature.getClass());
    }

}