package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSignDecoratedTest {

    @Test
    public void signDecoratedTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "data".getBytes();
        assertNotNull(keyPair.signDecorated(data));
    }

}