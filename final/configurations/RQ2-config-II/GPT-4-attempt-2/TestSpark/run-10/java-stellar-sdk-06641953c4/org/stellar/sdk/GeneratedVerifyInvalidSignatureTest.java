package org.stellar.sdk;

import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedVerifyInvalidSignatureTest {

    @Test
    public void verifyInvalidSignatureTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = {1, 2, 3, 4, 5};
        byte[] signature = {6, 7, 8, 9, 10};
        keyPair.verify(data, signature);
    }

}