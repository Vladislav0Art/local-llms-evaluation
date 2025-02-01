package org.stellar.sdk;

import net.i2p.crypto.eddsa.*;
import org.junit.Test;
import org.stellar.sdk.xdr.SignerKey;

import java.security.MessageDigest;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        assertFalse(keyPair1.equals(keyPair2));
        assertTrue(keyPair1.equals(keyPair1));
    }

}