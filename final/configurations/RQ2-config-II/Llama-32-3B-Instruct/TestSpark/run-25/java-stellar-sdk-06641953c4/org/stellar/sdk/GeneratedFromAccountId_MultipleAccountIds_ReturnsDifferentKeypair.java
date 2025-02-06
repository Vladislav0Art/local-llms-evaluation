package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromAccountId_MultipleAccountIds_ReturnsDifferentKeypair {

    @Mock
    private EdDSAPrivateKey privateKeyMock;

    @Mock
    private EdDSAPublicKey publicKeyMock;

    @InjectMocks
    private KeyPair keyPair;

    @Test
    public void fromAccountId_MultipleAccountIds_ReturnsDifferentKeypair() {
        // Arrange
        String accountId1 = "accountId1";
        String accountId2 = "accountId2";

        KeyPair keyPair1 = KeyPair.fromAccountId(accountId1);
        KeyPair keyPair2 = KeyPair.fromAccountId(accountId2);

        // Act & Assert
        assertNotEquals(keyPair1.getPublicKey(), keyPair2.getPublicKey());
    }

}