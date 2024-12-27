package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import java.security.KeyFactory;

import net.i2p.crypto.eddsa.EdDSAEngine;
import net.i2p.crypto.eddsa.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;

public class GeneratedFromSecretSeedCharArrayTest {

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] seed = new char[]{'a', 'g', 'n', '8', 'o', 't', '9', 'j', 'd', 'r', 'p', 'e', 's', 'w', 'i', 'x', '6', 'e', 't', '7', 'r', 'y', 'f', '2', 'e', 'c', 'g', 's', 'p', 'b', 'e', 'h', 'd', 'u'};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}