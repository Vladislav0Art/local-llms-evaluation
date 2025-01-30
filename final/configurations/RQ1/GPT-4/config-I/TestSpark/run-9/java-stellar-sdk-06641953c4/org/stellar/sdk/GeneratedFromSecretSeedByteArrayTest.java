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

public class GeneratedFromSecretSeedByteArrayTest {

    @Test
    public void fromSecretSeedByteArrayTest() throws NoSuchAlgorithmException {
        String seed = "SACJC372QBSSKJYTV5AEPJPBWWIMXN7OYEFRZEZ6P3C4HQYU2SG47R3H";
        Pair<byte[], byte[]> keyBytes = generateKeyBytes(seed);
        KeyPair keyPair = KeyPair.fromSecretSeed(keyBytes.getRight());
        assertArrayEquals(keyPair.getPublicKey(), keyBytes.getLeft());
    }

}