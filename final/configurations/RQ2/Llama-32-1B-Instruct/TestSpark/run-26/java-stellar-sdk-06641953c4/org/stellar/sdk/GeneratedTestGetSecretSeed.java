package org.stellar.sdk;

import com.google.common.baseObjects.ObjectOf;
import org.junit.Test;

import static org.junit.Assert.*;

import java.security.KeyPair;

public class GeneratedTestGetSecretSeed {

    @Test
    public void testGetSecretSeed() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        char[] secretSeed = keyPair.getSecretSeed();
        assertNotNull(secretSeed);
        assertEquals("random seed", Arrays.toString(secretSeed), "[]");
    }

}