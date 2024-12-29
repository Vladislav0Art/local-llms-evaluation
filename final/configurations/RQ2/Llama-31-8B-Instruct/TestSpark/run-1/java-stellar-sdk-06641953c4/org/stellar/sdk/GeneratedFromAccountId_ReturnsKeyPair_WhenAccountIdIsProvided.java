package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import net.i2p.crypto.eddsa.EdDSAPublicKey;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromAccountId_ReturnsKeyPair_WhenAccountIdIsProvided {

    @Test
    public void fromAccountId_ReturnsKeyPair_WhenAccountIdIsProvided() {
        String accountId = "account1";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

}