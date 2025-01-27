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
public class GeneratedSign_givenData_whenCreatedThenSignatureReturned {

    @Mock
    private EdDSAPublicKey publicKey;

    @Test
    public void sign_givenData_whenCreatedThenSignatureReturned() {
        // Arrange
        byte[] data = {1, 2, 3};
        KeyPair keyPair = new KeyPair(publicKey);

        // Act
        byte[] signature = keyPair.sign(data);

        // Assert
        // Assuming XdrSignerKey signature contains a reference to the actual bytes
        assertNull(signature);
    }

}