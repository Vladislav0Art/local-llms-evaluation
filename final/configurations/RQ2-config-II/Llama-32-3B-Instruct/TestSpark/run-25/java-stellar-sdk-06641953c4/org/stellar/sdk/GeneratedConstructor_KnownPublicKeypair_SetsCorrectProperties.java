package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConstructor_KnownPublicKeypair_SetsCorrectProperties {

    @Mock
    private EdDSAPrivateKey privateKeyMock;

    @Mock
    private EdDSAPublicKey publicKeyMock;

    @InjectMocks
    private KeyPair keyPair;

    @Test
    public void constructor_KnownPublicKeypair_SetsCorrectProperties() {
        // Arrange
        publicKeyMock.setEncoded("mockedEncoded");
        keyPair = new KeyPair(publicKeyMock);

        // Act & Assert
        assertEquals("mockedEncoded", keyPair.getPublicKey());
        assertTrue(keyPair.canSign());
    }

}