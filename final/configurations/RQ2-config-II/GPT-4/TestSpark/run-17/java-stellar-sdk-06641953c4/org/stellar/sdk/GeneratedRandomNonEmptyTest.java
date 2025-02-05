package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.SignatureHint;

import static org.junit.Assert.*;

public class GeneratedRandomNonEmptyTest {

    @Test
    public void randomNonEmptyTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

}