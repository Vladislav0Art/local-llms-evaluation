package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.MessageDigest;
import java.util.Arrays;

public class Generated[KeyPairGetPublicKey_NullPublicKeyConstruction_Test]{

@Test
public void [KeyPairGetPublicKey_NullPublicKeyConstruction_Test](){

assertThrows(NullPointerException .class, () ->((KeyPair)KeyPair.

fromPublicKey(new byte[0])).

getPublicKey());
        }

        }