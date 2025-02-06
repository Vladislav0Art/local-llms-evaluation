package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedVerify_DifferentSignatures_ReturnsDifferentResults {

    @Mock
    private EdDSAPrivateKey privateKeyMock;

    @Mock
    private EdDSAPublicKey publicKeyMock;

    @InjectMocks
    private KeyPair keyPair;

    @Test
    public void verify_DifferentSignatures_ReturnsDifferentResults() {
        // Arrange
        byte[] data = "data".getBytes();
        byte[] signature1 = "signature1".getBytes();
        byte[] signature2 = "signature2".getBytes();

        KeyPair keyPair = new KeyPair(new EdDSAPublicKey("mockedEncoded"));

        // Act & Assert
        boolean result1 = keyPair.verify(data, signature1);
        assertFalse(result1);

        boolean result2 = keyPair.verify(data, signature2);
        assertTrue(result2);
    }

}