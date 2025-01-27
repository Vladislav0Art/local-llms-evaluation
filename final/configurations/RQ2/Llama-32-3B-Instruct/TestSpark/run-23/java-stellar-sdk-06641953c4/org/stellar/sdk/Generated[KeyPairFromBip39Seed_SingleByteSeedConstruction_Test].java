package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.MessageDigest;
import java.util.Arrays;

public class Generated[KeyPairFromBip39Seed_SingleByteSeedConstruction_Test]{

@Test
public void [KeyPairFromBip39Seed_SingleByteSeedConstruction_Test](){
byte[] bip39Seed = "byte".getBytes();
int accountNumber = 0;
KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);

assertNotNull(keyPair);

assertTrue(keyPair.canSign());
        }

        }