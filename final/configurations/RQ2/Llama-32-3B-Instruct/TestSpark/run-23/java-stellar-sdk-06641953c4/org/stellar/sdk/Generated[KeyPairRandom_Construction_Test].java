package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.MessageDigest;
import java.util.Arrays;

public class Generated[KeyPairRandom_Construction_Test]{

@Test
public void [KeyPairRandom_Construction_Test](){
KeyPair keyPair = KeyPair.random();

assertNotNull(keyPair);

assertTrue(keyPair.canSign());
        }

        }