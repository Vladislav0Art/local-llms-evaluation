package org.stellar.sdk;

public class GeneratedTestSignDecorated {

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

}