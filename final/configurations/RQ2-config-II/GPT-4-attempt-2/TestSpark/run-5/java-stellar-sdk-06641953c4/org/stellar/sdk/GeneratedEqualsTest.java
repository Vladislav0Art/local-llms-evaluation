package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.Uint256;

import java.util.Random;

public class GeneratedEqualsTest {

    final static String HASHED_PUBLIC_KEY = "XXXXXXXXXXXXXXXXXXXXXXXXXX"; // the hashed public key

    @Test
    public void equalsTest() {
        final KeyPair keyPair1 = KeyPair.random();
        final KeyPair keyPair2 = KeyPair.random();
        Assert.assertNotEquals(keyPair1, keyPair2);
    }

}