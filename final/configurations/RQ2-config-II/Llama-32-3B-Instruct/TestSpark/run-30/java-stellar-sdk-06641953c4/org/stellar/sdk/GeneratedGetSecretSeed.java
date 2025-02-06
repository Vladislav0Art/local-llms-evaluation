package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.stellar.sdk.KeyPair;

public class GeneratedGetSecretSeed {

    @Test
    public void getSecretSeed() {
        char[] seed = new char[32];
        Arrays.fill(seed, '0');
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair.getSecretSeed());
        assertEquals(Arrays.toString(seed), Arrays.toString(keyPair.getSecretSeed()));
    }

}