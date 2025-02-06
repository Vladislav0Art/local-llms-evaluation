package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedFromPublicAndSecretKeyIsSame {

    @Test
    public void fromPublicAndSecretKeyIsSame() {
        EdDSAPublicKey publicKey = mock(EdDSAPublicKey.class);
        KeyPair key = new KeyPair(publicKey);
        assertSame(key.getPublicKey(), key.fromSecretSeed().getPublicKey());
    }

}