package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromSecretSeedCharArraySuccess {

    @Test
    public void fromSecretSeedCharArraySuccess() {
        char[] seed = {'a', 'b', 'c'};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
        assertNotEquals(0, keyPair.getSecretSeed().length);
    }

}