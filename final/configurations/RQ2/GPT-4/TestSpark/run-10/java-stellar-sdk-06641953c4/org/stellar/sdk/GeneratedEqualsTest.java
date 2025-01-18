package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        KeyPair keypair1 = KeyPair.random();
        KeyPair keypair2 = KeyPair.random();
        assertFalse(keypair1.equals(keypair2));
        assertTrue(keypair1.equals(keypair1));
    }

}