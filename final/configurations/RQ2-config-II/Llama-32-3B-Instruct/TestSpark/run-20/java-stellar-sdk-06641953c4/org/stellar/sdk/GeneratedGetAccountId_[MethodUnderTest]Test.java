package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.Signature;
import java.util.Arrays;

public class GeneratedGetAccountId_[MethodUnderTest]

Test {

    @Test
    public void getAccountId_[ MethodUnderTest]Test() {
        KeyPair keyPair = KeyPair.fromSecretSeed("secret seed".toCharArray());
        assertEquals(0, 0, keyPair.getAccountId().compareTo(Integer.toString(0)));
    }

}