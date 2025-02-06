package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromSecretSeed_DifferentSeeds_ReturnsDifferentKeypair {

    @Mock
    private EdDSAPrivateKey privateKeyMock;

    @Mock
    private EdDSAPublicKey publicKeyMock;

    @InjectMocks
    private KeyPair keyPair;

    @Test
    public void fromSecretSeed_DifferentSeeds_ReturnsDifferentKeypair() {
        // Arrange
        char[] seed1 = "seed1".toCharArray();
        char[] seed2 = "seed2".toCharArray();

        KeyPair keyPair1 = KeyPair.fromSecretSeed(seed1);
        KeyPair keyPair2 = KeyPair.fromSecretSeed(seed2);

        // Act & Assert
        assertNotEquals(keyPair1.getPublicKey(), keyPair2.getPublicKey());
    }

}