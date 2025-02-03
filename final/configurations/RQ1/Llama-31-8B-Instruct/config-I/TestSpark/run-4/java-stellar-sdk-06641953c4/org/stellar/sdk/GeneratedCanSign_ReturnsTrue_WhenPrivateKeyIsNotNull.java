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
        EdDSAPublicKey publicKey = mock(EdDSAPublicKey.class);
        EdDSAPrivateKey privateKey = mock(EdDSAPrivateKey.class);
        KeyPair keyPair = new KeyPair(publicKey, privateKey);
        assertTrue(keyPair.canSign());
    }

}