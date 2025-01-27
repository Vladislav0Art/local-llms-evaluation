package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.MessageDigest;
import java.util.Arrays;

public class Generated[KeyPairFromSecretSeed_SingleByteSeedConstruction_Test]{

@Test
public void [KeyPairFromSecretSeed_SingleByteSeedConstruction_Test](){
char[] seed = "byte".toCharArray();
KeyPair keyPair = KeyPair.fromSecretSeed(seed);

assertNotNull(keyPair);

assertTrue(keyPair.canSign());
        }

        }