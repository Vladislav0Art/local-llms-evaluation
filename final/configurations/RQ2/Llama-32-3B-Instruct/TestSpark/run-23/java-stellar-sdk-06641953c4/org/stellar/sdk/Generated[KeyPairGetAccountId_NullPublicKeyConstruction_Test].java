package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.MessageDigest;
import java.util.Arrays;

public class Generated[KeyPairGetAccountId_NullPublicKeyConstruction_Test]{

@Test
public void [KeyPairGetAccountId_NullPublicKeyConstruction_Test](){

assertThrows(NullPointerException .class, () ->((KeyPair)KeyPair.

fromPublicKey(new byte[0])).

getAccountId());
        }

        }