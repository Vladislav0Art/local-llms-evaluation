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

public class GeneratedFromSecretSeedCharArrayTest {

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] seed = new char[56];
        Arrays.fill(seed, 'S');

        Assert.assertNotNull(org.stellar.sdk.KeyPair.fromSecretSeed(seed));
    }

}