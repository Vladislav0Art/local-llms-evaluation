package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.SignatureHint;

import static org.junit.Assert.*;

public class GeneratedEqualsTrueTest {

    @Test
    public void equalsTrueTest() {
        KeyPair keyPair1 = KeyPair.random();
        assertTrue(keyPair1.equals(keyPair1));
    }

}