package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.Uint256;

import java.util.Random;

public class GeneratedFromXdrPublicKeyTest {

    final static String HASHED_PUBLIC_KEY = "XXXXXXXXXXXXXXXXXXXXXXXXXX"; // the hashed public key

    @Test
    public void fromXdrPublicKeyTest() {
        final KeyPair keyPair = KeyPair.random();
        final PublicKey publicKey = keyPair.getXdrPublicKey();
        Assert.assertNotNull(KeyPair.fromXdrPublicKey(publicKey));
    }

}