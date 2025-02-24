package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import static org.junit.Assert.assertEquals;

public class GeneratedCanSignTest_true {

    @Test
    public void canSignTest_true() {
        KeyPair keyPair = new KeyPair(null);
        assertEquals(true, keyPair.canSign());
    }

}