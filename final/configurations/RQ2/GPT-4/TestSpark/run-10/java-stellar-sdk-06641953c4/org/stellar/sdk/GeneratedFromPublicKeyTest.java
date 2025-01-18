package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedFromPublicKeyTest {

    @Test
    public void fromPublicKeyTest() {
        KeyPair keypair1 = KeyPair.random();
        byte[] publicKey = keypair1.getPublicKey();
        KeyPair keypair2 = KeyPair.fromPublicKey(publicKey);
        assertEquals(keypair1, keypair2);
    }

}