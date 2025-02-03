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

    @Test
    public void canSign_ReturnsTrue_WhenPrivateKeyIsNotNull() {
        KeyPair keyPair = new KeyPair(mock(EdDSAPublicKey.class), mock(EdDSAPrivateKey.class));
        assertTrue(keyPair.canSign());
    }

}