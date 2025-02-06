package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCanSign_WhenPublicKeyIsNotNull_ReturnsTrue {

    @Test
    public void canSign_WhenPublicKeyIsNotNull_ReturnsTrue() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        when(publicKey.getEncoded()).thenReturn(new byte[]{1, 2, 3});
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(keyPair.canSign());
    }

}