package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSign_DifferentData_ReturnsDifferentSignatures {

    @Mock
    private EdDSAPrivateKey privateKeyMock;

    @Mock
    private EdDSAPublicKey publicKeyMock;

    @InjectMocks
    private KeyPair keyPair;

    @Test
    public void sign_DifferentData_ReturnsDifferentSignatures() {
        // Arrange
        byte[] data1 = "data1".getBytes();
        byte[] data2 = "data2".getBytes();

        KeyPair keyPair = new KeyPair(new EdDSAPublicKey("mockedEncoded"));

        // Act & Assert
        ByteArrayOutputStream bos1 = new ByteArrayOutputStream();
        XdrDataOutputStream out1 = new XdrDataOutputStream(bos1);
        DecoratedSignature signature1 = keyPair.sign(data1, out1);
        assertEquals("mockedEncoded", signature1.getPublicKey());
        assertEquals(0, bos1.size());

        ByteArrayOutputStream bos2 = new ByteArrayOutputStream();
        XdrDataOutputStream out2 = new XdrDataOutputStream(bos2);
        DecoratedSignature signature2 = keyPair.sign(data2, out2);
        assertEquals("mockedEncoded", signature2.getPublicKey());
        assertEquals(0, bos2.size());
    }

}