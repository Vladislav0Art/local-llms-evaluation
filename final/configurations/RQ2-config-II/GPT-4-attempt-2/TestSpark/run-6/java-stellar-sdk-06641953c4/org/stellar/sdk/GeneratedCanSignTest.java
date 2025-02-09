package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedCanSignTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = KeyPair.random();
        assertTrue(keyPair.canSign());
    }

}