package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.MessageDigest;
import java.util.Arrays;

public class Generated[KeyPairConstructor_SinglePublicKeyConstruction_Test]{

@Test
public void [KeyPairConstructor_SinglePublicKeyConstruction_Test](){
EdDSAPublicKey publicKey = EdDSAPublicKey.of("ed25519");
KeyPair keyPair = new KeyPair(publicKey);

assertNotNull(keyPair);

assertTrue(keyPair.canSign());
        }

        }