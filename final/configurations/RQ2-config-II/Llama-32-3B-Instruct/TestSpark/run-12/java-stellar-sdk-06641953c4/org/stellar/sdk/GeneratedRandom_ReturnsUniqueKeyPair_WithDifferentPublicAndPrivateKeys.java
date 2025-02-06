package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.security.MessageDigest;

public class GeneratedRandom_ReturnsUniqueKeyPair_WithDifferentPublicAndPrivateKeys {

    @Test
    public void random_ReturnsUniqueKeyPair_WithDifferentPublicAndPrivateKeys() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        assertNotEquals(keyPair1.getPublicKey(), keyPair2.getPublicKey());
        assertTrue(keyPair1.canSign(keyPair1.getPublicKey()));
    }
}

}