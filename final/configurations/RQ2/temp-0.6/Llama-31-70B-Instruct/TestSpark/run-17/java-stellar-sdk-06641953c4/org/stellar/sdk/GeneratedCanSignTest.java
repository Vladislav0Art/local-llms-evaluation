package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedCanSignTest {

    @Test
    public void canSignTest() throws Exception {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        boolean canSign = keyPair.canSign();
        assertTrue(canSign);
    }

}