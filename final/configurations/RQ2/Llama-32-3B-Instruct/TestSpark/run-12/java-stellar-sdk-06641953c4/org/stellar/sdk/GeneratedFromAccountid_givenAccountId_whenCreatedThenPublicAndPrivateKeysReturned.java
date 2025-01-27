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
public class GeneratedFromAccountid_givenAccountId_whenCreatedThenPublicAndPrivateKeysReturned {

    @Mock
    private EdDSAPublicKey publicKey;

    @Test
    public void fromAccountid_givenAccountId_whenCreatedThenPublicAndPrivateKeysReturned() {
        // Arrange
        String accountId = "account-id";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);

        // Assert
        assertTrue(keyPair.getPublic() != null);
        assertTrue(keyPair.getPrivate() != null);
    }

}