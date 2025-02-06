package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNewKeyPairCreationSuccess {

    @Test
    public void newKeyPairCreationSuccess() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        when(publicKey.toString()).thenReturn("testPublicKey");
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
        assertEquals(publicKey, keyPair.getPublicKey());
    }

}