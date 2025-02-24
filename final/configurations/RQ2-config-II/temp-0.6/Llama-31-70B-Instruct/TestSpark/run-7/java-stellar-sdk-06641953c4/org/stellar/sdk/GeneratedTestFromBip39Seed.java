package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestFromBip39Seed {

    @Test
    public void testFromBip39Seed() {
        KeyPair keyPair = KeyPair.fromBip39Seed(new byte[0], 0);
        assertNotNull(keyPair);
    }

}