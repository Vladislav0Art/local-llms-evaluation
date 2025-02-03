package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCanSign_ReturnsTrue_WhenPrivateKeyIsNotNull {

    @Mock
    private EdDSAPublicKeySpec publicKeySpec;

    @Mock
    private EdDSAPrivateKeySpec privateKeySpec;

    @Mock
    private EdDSAPublicKey publicKey;

    @Mock
    private EdDSAPrivateKey privateKey;

    @InjectMocks
    private KeyPair keyPair;

    @Test
    public void canSign_ReturnsTrue_WhenPrivateKeyIsNotNull() {
        when(privateKey != null).thenReturn(true);
        assertTrue(keyPair.canSign());
    }

}