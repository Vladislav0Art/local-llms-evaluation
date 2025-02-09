package org.stellar.sdk;

import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCanSignTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = KeyPair.random();
        assertTrue(keyPair.canSign());
    }

}