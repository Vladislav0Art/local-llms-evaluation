package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.SignatureHint;

import static org.junit.Assert.*;

public class GeneratedCanSignTrueTest {

    @Test
    public void canSignTrueTest() {
        KeyPair keyPair = KeyPair.random();
        assertTrue(keyPair.canSign());
    }

}