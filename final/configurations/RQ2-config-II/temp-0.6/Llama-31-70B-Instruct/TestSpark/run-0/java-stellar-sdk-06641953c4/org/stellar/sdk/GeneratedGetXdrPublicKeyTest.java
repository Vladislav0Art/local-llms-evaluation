package org.stellar.sdk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedGetXdrPublicKeyTest {

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair keyPair = new KeyPair(/* some public key */);
        assertEquals(new PublicKey(/* expected xdr public key */), keyPair.getXdrPublicKey());
    }

}