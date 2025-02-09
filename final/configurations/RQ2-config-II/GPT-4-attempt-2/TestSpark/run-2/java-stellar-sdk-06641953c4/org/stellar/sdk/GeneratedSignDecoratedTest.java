package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.KeyPairGenerator;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedSignDecoratedTest {

    @Test
    public void signDecoratedTest() {
        KeyPair pair = KeyPair.random();
        String data = "someData";
        DecoratedSignature signature = pair.signDecorated(data.getBytes());
        assertNotNull(signature);
        assertTrue(pair.verify(data.getBytes(), signature.getSignature().getSignature()));
    }

}