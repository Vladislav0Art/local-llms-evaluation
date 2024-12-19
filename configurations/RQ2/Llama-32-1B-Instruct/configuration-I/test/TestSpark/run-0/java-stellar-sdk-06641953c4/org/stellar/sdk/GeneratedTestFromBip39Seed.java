package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestFromBip39Seed {

    @Test
    public void testFromBip39Seed() {
        byte[] bip39Seed = "some-bip39-seed".getBytes();
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, 1);
        assertNotNull(keyPair);
        assertEquals(EdDSAPublicKey.class, keyPair.getPublicKey().getClass());
    }

}