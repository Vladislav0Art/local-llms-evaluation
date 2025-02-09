package org.stellar.sdk;

import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedRandomTest {

    @Test
    public void randomTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotEquals(null, keyPair);
    }

}