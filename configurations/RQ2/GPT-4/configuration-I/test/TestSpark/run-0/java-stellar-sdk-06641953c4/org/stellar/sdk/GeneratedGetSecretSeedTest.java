package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import java.security.KeyFactory;

import net.i2p.crypto.eddsa.EdDSAEngine;
import net.i2p.crypto.eddsa.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;

public class GeneratedGetSecretSeedTest {

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getSecretSeed());
    }

}