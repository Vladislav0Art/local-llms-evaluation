package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.stellar.sdk.*;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromSecretSeedTest {

    @Test
    public void fromSecretSeedTest() {
        KeyPair keyPair1 = KeyPair.random();
        char[] secretSeed = keyPair1.getSecretSeed();
        KeyPair keyPair2 = KeyPair.fromSecretSeed(secretSeed);
        assertEquals(keyPair1.getPublicKey(), keyPair2.getPublicKey());
    }

}