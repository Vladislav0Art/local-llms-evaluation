package org.stellar.sdk;

import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSignDecoratedTest {

    @Test
    public void signDecoratedTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = {1, 2, 3, 4, 5};
        assertNotNull(keyPair.signDecorated(data));
    }

}