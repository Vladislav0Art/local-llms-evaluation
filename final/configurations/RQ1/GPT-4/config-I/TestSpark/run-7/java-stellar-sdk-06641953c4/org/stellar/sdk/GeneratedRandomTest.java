package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;

import static org.junit.Assert.assertTrue;

public class GeneratedRandomTest {

    @Test
    public void randomTest() {
        org.stellar.sdk.KeyPair keyPair = org.stellar.sdk.KeyPair.random();
        assertTrue(keyPair instanceof org.stellar.sdk.KeyPair);
    }

}