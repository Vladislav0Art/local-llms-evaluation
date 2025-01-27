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
public class GeneratedFromBip39Seed_givenSeed_whenCreatedThenPublicAndPrivateKeysReturned {

    @Mock
    private EdDSAPublicKey publicKey;

    @Test
    public void fromBip39Seed_givenSeed_whenCreatedThenPublicAndPrivateKeysReturned() {
        // Arrange
        byte[] bip39Seed = {1, 2, 3};
        int accountNumber = 123;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);

        // Assert
        assertTrue(keyPair.getPublic() != null);
        assertTrue(keyPair.getPrivate() != null);
    }

}