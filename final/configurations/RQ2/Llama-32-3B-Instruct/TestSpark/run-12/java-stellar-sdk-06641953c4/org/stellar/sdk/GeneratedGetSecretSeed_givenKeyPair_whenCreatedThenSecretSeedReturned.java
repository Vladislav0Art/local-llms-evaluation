package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetSecretSeed_givenKeyPair_whenCreatedThenSecretSeedReturned {

    @Mock
    private EdDSAPublicKey publicKey;

    @Test
    public void getSecretSeed_givenKeyPair_whenCreatedThenSecretSeedReturned() {
        // Arrange
        char[] secretSeed = {1, 2, 3};
        KeyPair keyPair = new KeyPair(publicKey);

        // Assert
        assertEquals(secretSeed, keyPair.getSecretSeed());
    }

}