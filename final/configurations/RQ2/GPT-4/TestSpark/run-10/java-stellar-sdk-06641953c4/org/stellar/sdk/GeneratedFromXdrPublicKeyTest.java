package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedFromXdrPublicKeyTest {

    @Test
    public void fromXdrPublicKeyTest() {
        KeyPair keypair1 = KeyPair.random();
        PublicKey publicKey = keypair1.getXdrPublicKey();
        KeyPair keypair2 = KeyPair.fromXdrPublicKey(publicKey);
        assertEquals(keypair1, keypair2);
    }

}