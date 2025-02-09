package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.Uint256;

import java.util.Random;

public class GeneratedKeyPairInitializationTest {

    final static String HASHED_PUBLIC_KEY = "XXXXXXXXXXXXXXXXXXXXXXXXXX"; // the hashed public key

    @Test
    public void keyPairInitializationTest() {
        final byte[] publicKey = HASHED_PUBLIC_KEY.getBytes();
        final EdDSAPublicKey edDSAPublicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(publicKey, EdDSANamedCurveTable.getByName(EdDSANamedCurveTable.ED_25519)));

        final KeyPair keyPair = new KeyPair(edDSAPublicKey);
        Assert.assertNotNull(keyPair);
    }

}