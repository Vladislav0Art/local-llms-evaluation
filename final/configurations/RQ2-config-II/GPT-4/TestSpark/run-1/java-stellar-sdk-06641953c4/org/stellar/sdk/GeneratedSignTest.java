package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.SignerKeyType;

import static org.junit.Assert.*;

public class GeneratedSignTest {

    @Test
    public void signTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("SGUZP5NW");
        byte[] data = "Hello, World!".getBytes();
        byte[] signature = keyPair.sign(data);
        assertNotNull(signature);
    }

}