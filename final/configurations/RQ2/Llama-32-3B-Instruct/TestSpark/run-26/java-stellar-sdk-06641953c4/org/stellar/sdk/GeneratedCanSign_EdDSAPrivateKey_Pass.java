package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAEngine;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;
import net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;
import org.stellar.sdk.XdrDataOutputStream;

import java.io.ByteArrayOutputStream;

public class GeneratedCanSign_EdDSAPrivateKey_Pass {

    @Test
    public void canSign_EdDSAPrivateKey_Pass() {
        EdDSAPrivateKey privatekey = new EdDSAPrivateKey();
        assertEquals(true, new KeyPair(privatekey).canSign());
    }

}