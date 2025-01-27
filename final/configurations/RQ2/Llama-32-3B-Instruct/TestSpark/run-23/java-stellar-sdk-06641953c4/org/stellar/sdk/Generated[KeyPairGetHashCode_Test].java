package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.MessageDigest;
import java.util.Arrays;

public class Generated[KeyPairGetHashCode_Test]{

@Test
public void [KeyPairGetHashCode_Test](){
KeyPair keyPair1 = KeyPair.random();
KeyPair keyPair2 = KeyPair.random();

assertNotEquals(keyPair1.hashCode(),keyPair2.

hashCode());
        }

        }