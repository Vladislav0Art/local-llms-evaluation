package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import net.i2p.crypto.eddsa.*;

import static org.junit.Assert.*;

public class GeneratedVerifyIncorrectSignatureTest {

    @Test
    public void verifyIncorrectSignatureTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "test data".getBytes();
        byte[] signature = keyPair.sign(new byte[1]);
        assertFalse(keyPair.verify(data, signature));
    }

}