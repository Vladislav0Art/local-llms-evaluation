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
public class GeneratedFromSecretSeed_givenSeed_whenCreatedThenPublicAndPrivateKeysReturned {

    @Mock
    private EdDSAPublicKey publicKey;

    @Test
    public void fromSecretSeed_givenSeed_whenCreatedThenPublicAndPrivateKeysReturned() {
        // Arrange
        byte[] seed = {1, 2, 3};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        // Assert
        assertTrue(keyPair.getPublic() != null);
        assertTrue(keyPair.getPrivate() != null);
    }

}