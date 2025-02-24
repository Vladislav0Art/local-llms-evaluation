package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import static org.junit.Assert.assertEquals;

public class GeneratedCanSignTest_false {

    @Test
    public void canSignTest_false() {
        KeyPair keyPair = new KeyPair(null);
        assertEquals(false, keyPair.canSign());
    }

}