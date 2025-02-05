package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedSignTest {

    @Test
    public void signTest() {
        byte[] data = new byte[256];
        KeyPair keyPair = KeyPair.random();
        assertTrue(keyPair.canSign());
        assertNotNull(keyPair.sign(data));
    }

}