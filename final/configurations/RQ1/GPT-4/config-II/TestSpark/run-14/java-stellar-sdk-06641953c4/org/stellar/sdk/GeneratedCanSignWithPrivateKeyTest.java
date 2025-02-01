package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.stellar.sdk.xdr.*;
import org.stellar.sdk.xdr.PublicKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;
import java.util.Arrays;

public class GeneratedCanSignWithPrivateKeyTest {

    @Test
    public void canSignWithPrivateKeyTest() {
        byte[] seed = new byte[32];
        Arrays.fill(seed, (byte) 1);
        EdDSAPrivateKeySpec privKeySpec = new EdDSAPrivateKeySpec(seed, KeyPair.ed25519);
        EdDSAPublicKeySpec publicKeySpec = new EdDSAPublicKeySpec(privKeySpec.getA().toByteArray(), KeyPair.ed25519);

        org.stellar.sdk.KeyPair keyPair = new org.stellar.sdk.KeyPair(new EdDSAPublicKey(publicKeySpec), new EdDSAPrivateKey(privKeySpec));
        Assert.assertTrue(keyPair.canSign());
    }

}