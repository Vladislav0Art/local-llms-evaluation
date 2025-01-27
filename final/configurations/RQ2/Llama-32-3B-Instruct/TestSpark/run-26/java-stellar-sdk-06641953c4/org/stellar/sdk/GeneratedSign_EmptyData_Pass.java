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

public class GeneratedSign_EmptyData_Pass {

    @Test
    public void sign_EmptyData_Pass() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XdrDataOutputStream os = new XdrDataOutputStream(bos);
        byte[] signature = new byte[0];
        assertEquals(signature, new KeyPair().sign(new byte[0]));
    }

}