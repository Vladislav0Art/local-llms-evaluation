package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetSecretSeed {

    @Test
    public void testGetSecretSeed() {
        KeyPair keyPair = new KeyPair(null);
        assertEquals(0, keyPair.getSecretSeed().length);
    }

}