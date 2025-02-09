package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.KeyPairGenerator;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedSignPayloadDecoratedTest {

    @Test
    public void signPayloadDecoratedTest() {
        KeyPair keyPair = KeyPair.random();
        String data = "someData";
        DecoratedSignature signature = keyPair.signPayloadDecorated(data.getBytes());
        assertNotNull(signature);
    }

}