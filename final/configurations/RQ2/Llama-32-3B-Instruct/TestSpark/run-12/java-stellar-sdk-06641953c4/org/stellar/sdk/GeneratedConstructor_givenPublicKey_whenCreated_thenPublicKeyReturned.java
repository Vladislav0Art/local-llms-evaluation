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
public class GeneratedConstructor_givenPublicKey_whenCreated_thenPublicKeyReturned {

    @Mock
    private EdDSAPublicKey publicKey;

    @Test
    public void constructor_givenPublicKey_whenCreated_thenPublicKeyReturned() {
        // Arrange
        KeyPair keyPair = new KeyPair(publicKey);

        // Assert
        assertEquals(publicKey, keyPair.getPublic());
    }

}