package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedFromSecretSeedIsNotNullWhenSeedIsValid {

    @Test
    public void fromSecretSeedIsNotNullWhenSeedIsValid() throws Exception {
        KeyPair key = KeyPair.fromSecretSeed(new char[]{1, 2, 3});
        assertNotNull(key);
    }

}