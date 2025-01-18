package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedSignAndVerifyTest {

    @Test
    public void signAndVerifyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "SomeData".getBytes();
        byte[] signature = keyPair.sign(data);
        boolean verify = keyPair.verify(data, signature);
        assertTrue(verify);
    }

}