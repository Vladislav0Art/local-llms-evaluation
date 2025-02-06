package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.security.MessageDigest;

public class GeneratedFromSecretSeed_String_ThrowsException_WhenInputIsInvalid {

    @Test
    public void fromSecretSeed_String_ThrowsException_WhenInputIsInvalid() {
        assertTrue(KeyPair.fromSecretSeed(null).equals(new KeyPair()));
        assertNotEquals(new KeyPair(), KeyPair.fromSecretSeed(""));
        assertNotEquals(new KeyPair(), KeyPair.fromSecretSeed(new String[]{"a", "b"}));
    }

}