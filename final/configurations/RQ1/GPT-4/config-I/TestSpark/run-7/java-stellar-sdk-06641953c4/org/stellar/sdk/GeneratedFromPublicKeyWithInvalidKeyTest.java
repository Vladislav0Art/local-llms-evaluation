package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;

import static org.junit.Assert.assertTrue;

public class GeneratedFromPublicKeyWithInvalidKeyTest {

    @Test
    public void fromPublicKeyWithInvalidKeyTest() {
        org.stellar.sdk.KeyPair.fromPublicKey(new byte[31]);
    }

}