package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        KeyPair keyPair = KeyPair.random();
        assertTrue(keyPair.equals(keyPair));
        assertFalse(keyPair.equals(null));
        assertFalse(keyPair.equals(new Object()));
    }

}