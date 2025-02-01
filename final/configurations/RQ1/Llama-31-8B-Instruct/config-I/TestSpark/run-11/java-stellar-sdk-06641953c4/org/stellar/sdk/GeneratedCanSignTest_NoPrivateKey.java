package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCanSignTest_NoPrivateKey {

    @Test
    public void canSignTest_NoPrivateKey() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], KeyPair.ed25519)), null);
        assertFalse(keyPair.canSign());
    }

}