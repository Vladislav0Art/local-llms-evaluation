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
public class GeneratedFromPublicKey_givenPublickey_whenCreatedThenPublicKeyReturned {

    @Mock
    private EdDSAPublicKey publicKey;

    @Test
    public void fromPublicKey_givenPublickey_whenCreatedThenPublicKeyReturned() {
        // Arrange
        byte[] publicKey = {1, 2, 3};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);

        // Assert
        assertTrue(keyPair.getPublic() != null);
    }

}