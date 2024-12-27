package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import java.security.KeyFactory;

import net.i2p.crypto.eddsa.EdDSAEngine;
import net.i2p.crypto.eddsa.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;

public class GeneratedVerifyTest {

    @Test
    public void verifyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "Test data".getBytes();
        byte[] signature = keyPair.sign(data);
        assertTrue(keyPair.verify(data, signature));
        assertFalse(keyPair.verify("Incorrect".getBytes(), signature));
    }

}