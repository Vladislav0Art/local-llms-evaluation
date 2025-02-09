package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.SecureRandom;

import static org.junit.Assert.*;

public class GeneratedFromXdrPublicKeyTest {

    @Test
    public void fromXdrPublicKeyTest() {
        KeyPair keyPair1 = KeyPair.random();
        PublicKey publicKey = keyPair1.getXdrPublicKey();
        KeyPair keyPair2 = KeyPair.fromXdrPublicKey(publicKey);
        assertEquals(keyPair1, keyPair2);
    }

}