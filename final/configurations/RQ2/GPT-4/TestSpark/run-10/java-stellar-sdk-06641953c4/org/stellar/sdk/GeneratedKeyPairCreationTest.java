package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedKeyPairCreationTest {

    @Test
    public void KeyPairCreationTest() {
        KeyPair keypair = KeyPair.random();
        assertNotNull(keypair);
    }

}