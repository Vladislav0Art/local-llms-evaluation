package org.stellar.sdk;

import com.google.common.baseObjects.ObjectOf;
import org.junit.Test;

import static org.junit.Assert.*;

import java.security.KeyPair;

public class GeneratedTestRandomSeed {

    @Test
    public void testRandomSeed() {
        KeyPair keyPair = KeyPair.random();
        assertEquals("random seed", new EdDSAPublicKey().getSecretSeed(), keyPair.getSecretSeed());
    }

}