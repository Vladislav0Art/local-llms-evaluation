package org.stellar.sdk;

public class GeneratedTestSignPayloadDecorated {

    @Test
    public void testSignPayloadDecorated() throws Exception {
        //Arrange
        KeyPair keyPair = new KeyPair();
        byte[] dataToVerify = "Hello World".getBytes();
        byte[] signatureToVerify = {0x3a, 0x1f, 0x8b, 0x4d, 0x7c, 0x38, 0xe5, 0xc9};
        byte[] signerPayload = {0x12, 0x34, 0x56, 0x78};

        //Act
        DecoratedSignature decoratedSignature = keyPair.signPayloadDecorated(signerPayload);

        //Assert
        assertTrue(decoratedSignature.getHint().equals(signatureToVerify));
    }

}