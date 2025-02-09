package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedFromXdrPublicKeyTest {

    @Test
    public void fromXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        PublicKey publicKey = keyPair.getXdrPublicKey();
        KeyPair fromPublicKey = KeyPair.fromXdrPublicKey(publicKey);
        assertEquals(keyPair, fromPublicKey);
    }

}