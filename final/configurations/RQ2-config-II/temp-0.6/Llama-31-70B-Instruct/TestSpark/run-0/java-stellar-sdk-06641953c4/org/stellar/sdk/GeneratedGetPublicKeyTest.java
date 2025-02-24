package org.stellar.sdk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedGetPublicKeyTest {

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = new KeyPair(/* some public key */);
        assertEquals(new byte[]{/* expected public key */}, keyPair.getPublicKey());
    }

}