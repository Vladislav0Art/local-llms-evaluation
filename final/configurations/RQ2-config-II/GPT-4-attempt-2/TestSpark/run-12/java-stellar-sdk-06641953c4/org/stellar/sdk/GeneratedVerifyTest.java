package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedVerifyTest {

    @Test
    public void verifyTest() {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        KeyPair keyPair = KeyPair.random();
        byte[] signedData = keyPair.sign(data);
        boolean result = keyPair.verify(data, signedData);
        assertTrue(result);
    }

}