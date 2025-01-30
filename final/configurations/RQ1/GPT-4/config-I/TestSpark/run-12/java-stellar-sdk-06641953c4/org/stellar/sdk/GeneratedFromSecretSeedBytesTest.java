package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.stellar.sdk.xdr.DecoratedSignature;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromSecretSeedBytesTest {

    @Test
    public void fromSecretSeedBytesTest() {
        byte[] seed = "SCTVSBM2ZNHZ7HYRZC3HDFYZUEQMNLAR446CZSVYVCXZCG3YG2HJQBI2".getBytes(StandardCharsets.UTF_8);
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}