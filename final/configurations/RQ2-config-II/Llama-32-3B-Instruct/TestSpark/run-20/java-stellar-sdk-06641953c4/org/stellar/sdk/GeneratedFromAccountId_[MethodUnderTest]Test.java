package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.Signature;
import java.util.Arrays;

public class GeneratedFromAccountId_[MethodUnderTest]

Test {

    @Test
    public void fromAccountId_[ MethodUnderTest]Test() throws IOException {
        KeyPair keyPair = KeyPair.fromAccountId("account_id");
        assertNotNull(keyPair);
    }

}