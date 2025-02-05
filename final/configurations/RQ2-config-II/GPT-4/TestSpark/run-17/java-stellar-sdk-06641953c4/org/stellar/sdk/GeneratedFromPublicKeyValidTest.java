package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.SignatureHint;

import static org.junit.Assert.*;

public class GeneratedFromPublicKeyValidTest {

    @Test
    public void fromPublicKeyValidTest() {
        byte[] publicKey = "GCKEYPAIRJWK67Y3DHI5XHJ6G5K4L6JDYEZR335YE3RVNOO2CDXJAZI4J".getBytes();
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
    }

}