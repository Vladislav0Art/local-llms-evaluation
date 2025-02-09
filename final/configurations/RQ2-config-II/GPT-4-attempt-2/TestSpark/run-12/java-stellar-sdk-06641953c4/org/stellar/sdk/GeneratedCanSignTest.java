package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedCanSignTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = KeyPair.random();
        boolean result = keyPair.canSign();
        assertTrue(result);
    }

}