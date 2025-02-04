package org.stellar.sdk;

public class GeneratedTest {

    @Test
    public void testKeyPairCreation() {
        //Arrange
        KeyPair keyPair = new KeyPair();

        //Act
        assertNotNull(keyPair);

        //Assert
        assertTrue(keyPair.getPrivateKey() != null);
        assertTrue(keyPair.getPublicKey() != null);
    }

    @Test
    public void testSign() throws Exception {
        //Arrange
        KeyPair keyPair = new KeyPair();
        byte[] dataToSign = "Hello World".getBytes();
        byte[] expectedSignature = {0x3a, 0x1f, 0x8b, 0x4d, 0x7c, 0x38, 0xe5, 0xc9};

        //Act
        byte[] actualSignature = keyPair.sign(dataToSign);

        //Assert
        assertArrayEquals(expectedSignature, actualSignature);
    }

    @Test
    public void testVerify() throws Exception {
        //Arrange
        KeyPair keyPair = new KeyPair();
        byte[] dataToVerify = "Hello World".getBytes();
        byte[] signatureToVerify = {0x3a, 0x1f, 0x8b, 0x4d, 0x7c, 0x38, 0xe5, 0xc9};

        //Act
        boolean isValid = keyPair.verify(dataToVerify, signatureToVerify);

        //Assert
        assertTrue(isValid);
    }

    @Test
    public void testSignDecorated() throws Exception {
        //Arrange
        KeyPair keyPair = new KeyPair();
        byte[] dataToSign = "Hello World".getBytes();
        byte[] expectedSignature = {0x3a, 0x1f, 0x8b, 0x4d, 0x7c, 0x38, 0xe5, 0xc9};

        //Act
        DecoratedSignature decoratedSignature = keyPair.signDecorated(dataToSign);

        //Assert
        assertTrue(decoratedSignature.getHint().equals(expectedSignature));
    }

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