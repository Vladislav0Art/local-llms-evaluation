package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.MessageDigest;
import java.util.Arrays;

public class Generated[KeyPairVerify_ByteArrayVerificationResult_Test]{

@Test
public void [KeyPairVerify_ByteArrayVerificationResult_Test](){
KeyPair keyPair = KeyPair.random();
byte[] data = "data".getBytes();
byte[] signature = ((KeyPair) KeyPair.fromPublicKey(new byte[0])).sign(data);

assertTrue(keyPair.verify(data, signature));

assertFalse(keyPair.verify(data, new byte[0]));
        }

        }