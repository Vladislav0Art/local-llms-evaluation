package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromAccountId_ReturnsKeyPair_WhenAccountIdIsProvided {

    @Mock
    private EdDSAPublicKeySpec publicKeySpec;

    @Mock
    private EdDSAPrivateKeySpec privateKeySpec;

    @Mock
    private EdDSANamedCurveSpec ed25519;

    @InjectMocks
    private KeyPair keyPair;

    @Test
    public void fromAccountId_ReturnsKeyPair_WhenAccountIdIsProvided() {
        String accountId = "accountId";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

}