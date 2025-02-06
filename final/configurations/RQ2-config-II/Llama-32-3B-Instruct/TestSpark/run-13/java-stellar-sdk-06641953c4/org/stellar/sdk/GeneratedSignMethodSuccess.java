package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSignMethodSuccess {

    @Test
    public void signMethodSuccess() {
        KeyPair keyPair = new KeyPair(Mockito.mock(EdDSAPublicKey.class));
        byte[] data = {1, 2, 3};
        byte[] signature = {4, 5, 6};
        when(keyPair.getPublicKey().toString()).thenReturn("testPublicKey");
        when(keyPair.sign(data)).thenReturn(signature);
        assertTrue(new DecoratedSignature(signature).getSignature().equals(signature));
    }

}