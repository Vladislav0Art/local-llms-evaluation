package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAEngine;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKeySpec;
import net.i2p.crypto.eddsa.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.mockito.Mockito;

import java.security.*;
import java.util.Arrays;

public class GeneratedFromPublicKeyTest {

    @Test
    public void fromPublicKeyTest() throws NoSuchAlgorithmException {
        String publicKeyStr = "GBVUDZLMHTLMZANLZB6PJMRY5QJ6GZSW7VFAI4HQSGZDLN47JUJQIN5Y";
        Pair<byte[], byte[]> keyBytes = generateKeyBytes(publicKeyStr);
        KeyPair keyPair = KeyPair.fromPublicKey(keyBytes.getLeft());
        assertEquals(publicKeyStr, keyPair.getPublicKey());
    }

}