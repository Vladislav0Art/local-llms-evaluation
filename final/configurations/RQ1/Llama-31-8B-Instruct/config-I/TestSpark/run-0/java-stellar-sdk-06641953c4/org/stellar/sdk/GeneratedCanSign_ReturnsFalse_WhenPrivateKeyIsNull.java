package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCanSign_ReturnsFalse_WhenPrivateKeyIsNull {

    @Mock
    private EdDSAPublicKeySpec publicKeySpec;

    @Mock
    private EdDSAPrivateKeySpec privateKeySpec;

    @Mock
    private EdDSANamedCurveSpec ed25519;

    @InjectMocks
    private KeyPair keyPair;

    @Test
    public void canSign_ReturnsFalse_WhenPrivateKeyIsNull() {
        keyPair = new KeyPair(publicKeySpec, null);
        assertFalse(keyPair.canSign());
    }

}