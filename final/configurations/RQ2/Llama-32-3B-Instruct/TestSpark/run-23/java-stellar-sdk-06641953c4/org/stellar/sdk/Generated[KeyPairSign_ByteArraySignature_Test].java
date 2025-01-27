package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.MessageDigest;
import java.util.Arrays;

public class Generated[KeyPairSign_ByteArraySignature_Test]{

@Test
public void [KeyPairSign_ByteArraySignature_Test](){
KeyPair keyPair = KeyPair.random();
byte[] data = "data".getBytes();
byte[] signature = keyPair.sign(data);

assertNotNull(signature);

assertTrue(Arrays.equals(keyPair.sign(data),signature));
        }

        }