package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;
import org.stellar.sdk.SignatureHint;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedCanSignTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = new KeyPair(null);
        assertTrue(keyPair.canSign());
    }

}