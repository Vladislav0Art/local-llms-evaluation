package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.Signature;
import java.util.Arrays;

public class GeneratedGetPublicKey_[MethodUnderTest]

Test {

    @Test
    public void getPublicKey_[ MethodUnderTest]Test() {
        KeyPair keyPair = KeyPair.fromSecretSeed("secret seed".toCharArray());
        byte[] publicKeyBytes = keyPair.getPublicKey();
        assertTrue(publicKeyBytes.length == 33);
    }

}