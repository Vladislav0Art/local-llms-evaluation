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

    @Test
    public void canSign_ReturnsFalse_WhenPrivateKeyIsNull() {
        EdDSAPublicKey publicKey = mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(publicKey, null);
        assertFalse(keyPair.canSign());
    }

}