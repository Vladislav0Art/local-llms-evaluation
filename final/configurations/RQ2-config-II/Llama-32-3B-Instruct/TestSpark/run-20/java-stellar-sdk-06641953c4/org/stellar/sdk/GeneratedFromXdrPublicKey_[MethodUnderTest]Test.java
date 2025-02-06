package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.Signature;
import java.util.Arrays;

public class GeneratedFromXdrPublicKey_[MethodUnderTest]

Test {

    @Test
    public void fromXdrPublicKey_[ MethodUnderTest]Test() {
        PublicKey publicKey = new PublicKey(new Uint256(0));
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKey);
        assertNotNull(keyPair);
        assertEquals(publicKey, keyPair.getXdrPublicKey());
    }

}