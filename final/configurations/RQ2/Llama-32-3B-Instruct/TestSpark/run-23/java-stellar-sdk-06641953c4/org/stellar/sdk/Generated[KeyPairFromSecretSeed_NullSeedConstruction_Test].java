package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.MessageDigest;
import java.util.Arrays;

public class Generated[KeyPairFromSecretSeed_NullSeedConstruction_Test]{

@Test
public void [KeyPairFromSecretSeed_NullSeedConstruction_Test](){

assertThrows(NullPointerException .class, () ->KeyPair.

fromSecretSeed(null));
        }

        }