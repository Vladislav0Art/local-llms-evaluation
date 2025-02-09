package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.Uint256;

import java.util.Random;

public class GeneratedVerifyTest {

    final static String HASHED_PUBLIC_KEY = "XXXXXXXXXXXXXXXXXXXXXXXXXX"; // the hashed public key

    @Test
    public void verifyTest() {
        final KeyPair keyPair = KeyPair.random();
        final byte[] data = "test data".getBytes();
        final byte[] signature = keyPair.sign(data);
        Assert.assertTrue(keyPair.verify(data, signature));
    }

}