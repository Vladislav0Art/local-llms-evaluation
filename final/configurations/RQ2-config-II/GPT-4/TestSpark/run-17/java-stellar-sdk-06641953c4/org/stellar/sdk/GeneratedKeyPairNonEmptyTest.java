package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.SignatureHint;

import static org.junit.Assert.*;

public class GeneratedKeyPairNonEmptyTest {

    @Test
    public void KeyPairNonEmptyTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

}