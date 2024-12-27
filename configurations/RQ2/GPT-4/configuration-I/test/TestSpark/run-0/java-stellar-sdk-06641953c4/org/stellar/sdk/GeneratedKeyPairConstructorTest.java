package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import java.security.KeyFactory;

import net.i2p.crypto.eddsa.EdDSAEngine;
import net.i2p.crypto.eddsa.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;

public class GeneratedKeyPairConstructorTest {

    @Test
    public void keyPairConstructorTest() {
        byte[] seed = new byte[32];
        EdDSANamedCurveSpec spec = EdDSANamedCurveTable.getByName(EdDSANamedCurveTable.ED_25519);
        EdDSAPublicKeySpec publicKeySpec = new EdDSAPublicKeySpec(seed, spec);
        KeyPair keyPair = new KeyPair(publicKeySpec.getA());
        assertNotNull(keyPair);
    }

}