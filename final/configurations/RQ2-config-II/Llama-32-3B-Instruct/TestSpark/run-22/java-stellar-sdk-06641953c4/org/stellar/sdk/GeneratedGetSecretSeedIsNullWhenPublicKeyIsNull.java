package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetSecretSeedIsNullWhenPublicKeyIsNull {

    @Test
    public void getSecretSeedIsNullWhenPublicKeyIsNull() {
        assert (null == new KeyPair(null).getSecretSeed());
    }

}