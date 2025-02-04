package org.stellar.sdk;

public class GeneratedTestVerify {

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

}