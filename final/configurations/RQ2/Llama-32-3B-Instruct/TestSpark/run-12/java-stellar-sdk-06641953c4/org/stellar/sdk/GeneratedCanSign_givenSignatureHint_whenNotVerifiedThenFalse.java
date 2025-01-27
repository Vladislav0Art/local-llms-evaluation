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
public class GeneratedCanSign_givenSignatureHint_whenNotVerifiedThenFalse {

    @Mock
    private EdDSAPublicKey publicKey;

    @Test
    public void canSign_givenSignatureHint_whenNotVerifiedThenFalse() {
        // Arrange
        SignatureHint signatureHint = Mockito.mock(SignatureHint.class);
        when(signatureHint.getValidUntil()).thenReturn(0);

        KeyPair keyPair = new KeyPair(publicKey);

        // Act
        boolean result = keyPair.canSign(signatureHint);

        // Assert
        assertFalse(result);
    }

}