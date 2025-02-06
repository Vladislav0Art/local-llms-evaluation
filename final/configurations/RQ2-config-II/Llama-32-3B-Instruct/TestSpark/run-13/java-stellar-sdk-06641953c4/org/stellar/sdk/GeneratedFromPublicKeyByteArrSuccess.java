package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromPublicKeyByteArrSuccess {

    @Test
    public void fromPublicKeyByteArrSuccess() {
        byte[] publicKey = {1, 2, 3};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
        assertNotEquals(0, keyPair.getPublicKey().length);
    }

}