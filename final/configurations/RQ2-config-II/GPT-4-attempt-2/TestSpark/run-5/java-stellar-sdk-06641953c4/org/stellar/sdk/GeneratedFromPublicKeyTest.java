package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.Uint256;

import java.util.Random;

public class GeneratedFromPublicKeyTest {

    final static String HASHED_PUBLIC_KEY = "XXXXXXXXXXXXXXXXXXXXXXXXXX"; // the hashed public key

    @Test
    public void fromPublicKeyTest() {
        final byte[] publicKey = HASHED_PUBLIC_KEY.getBytes();
        final KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        Assert.assertNotNull(keyPair);
    }

}