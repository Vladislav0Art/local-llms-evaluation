package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedSignDecoratedTest {

    @Test
    public void signDecoratedTest() {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        KeyPair keyPair = KeyPair.random();
        DecoratedSignature decoratedSignature = keyPair.signDecorated(data);
        assertNotNull(decoratedSignature);
    }

}