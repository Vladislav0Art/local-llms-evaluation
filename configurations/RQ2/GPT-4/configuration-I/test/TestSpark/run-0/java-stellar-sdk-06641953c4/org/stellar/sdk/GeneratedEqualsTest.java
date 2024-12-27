package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import java.security.KeyFactory;

import net.i2p.crypto.eddsa.EdDSAEngine;
import net.i2p.crypto.eddsa.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        KeyPair keyPair = KeyPair.random();
        assertTrue(keyPair.equals(keyPair));
        assertFalse(keyPair.equals(null));
        assertFalse(keyPair.equals("test"));
    }

}