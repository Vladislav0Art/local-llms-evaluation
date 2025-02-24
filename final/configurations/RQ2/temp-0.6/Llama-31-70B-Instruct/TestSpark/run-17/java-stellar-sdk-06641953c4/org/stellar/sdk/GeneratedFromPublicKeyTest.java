package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedFromPublicKeyTest {

    @Test
    public void fromPublicKeyTest() throws Exception {
        byte[] publicKey = new byte[]{(byte) 'a', (byte) 'b', (byte) 'c'};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertEquals(keyPair.getPublicKey(), publicKey);
    }

}