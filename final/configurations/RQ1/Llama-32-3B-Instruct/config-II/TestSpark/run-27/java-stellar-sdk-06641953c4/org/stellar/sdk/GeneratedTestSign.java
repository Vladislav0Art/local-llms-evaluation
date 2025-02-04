package org.stellar.sdk;

public class GeneratedTestSign {

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

}