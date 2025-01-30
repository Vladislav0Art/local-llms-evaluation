package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;

import static org.junit.Assert.assertTrue;

public class GeneratedFromPublicKeyTest {

    @Test
    public void fromPublicKeyTest() {
        org.stellar.sdk.KeyPair keyPair = org.stellar.sdk.KeyPair.fromPublicKey(new byte[32]);
        assertTrue(keyPair instanceof org.stellar.sdk.KeyPair);
    }

}