package org.stellar.sdk;

import com.google.common.baseObjects.ObjectOf;
import org.junit.Test;

import static org.junit.Assert.*;

import java.security.KeyPair;

public class GeneratedTestFromBip39Seed {

    @Test
    public void testFromBip39Seed() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey().generateBip39Seed("seed1"));
        assertNotNull(keyPair);
        assertEquals(EdDSAPublicKey.class, keyPair.getClass());
        assertEquals("random seed", keyPair.getSecretSeed(), Objects.toString(keyPair.getSecretSeed()));
    }

}