package org.stellar.sdk;

import org.hamcrest.core.IsEqual;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedSignTest {

    @Test
    public void signTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("TESTSEED".getBytes());
        byte[] data = "DATA".getBytes();
        byte[] signedData = keyPair.sign(data);
        assertNotNull(signedData);
    }

}