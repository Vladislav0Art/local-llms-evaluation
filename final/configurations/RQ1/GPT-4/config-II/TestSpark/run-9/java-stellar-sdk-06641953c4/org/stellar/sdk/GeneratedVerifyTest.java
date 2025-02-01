package org.stellar.sdk;

import net.i2p.crypto.eddsa.*;
import org.junit.Test;
import org.stellar.sdk.xdr.SignerKey;

import java.security.MessageDigest;

import static org.junit.Assert.*;

public class GeneratedVerifyTest {

    @Test
    public void verifyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] signedData = keyPair.sign(new byte[]{0, 1, 0, 1});
        assertTrue(keyPair.verify(new byte[]{0, 1, 0, 1}, signedData));
    }

}