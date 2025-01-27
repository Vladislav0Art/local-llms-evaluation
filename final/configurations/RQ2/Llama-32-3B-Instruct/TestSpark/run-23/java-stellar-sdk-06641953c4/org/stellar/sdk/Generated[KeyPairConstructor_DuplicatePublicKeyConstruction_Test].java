package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.MessageDigest;
import java.util.Arrays;

public class Generated[KeyPairConstructor_DuplicatePublicKeyConstruction_Test]{

@Test
public void [KeyPairConstructor_DuplicatePublicKeyConstruction_Test](){
EdDSAPublicKey publicKey = EdDSAPublicKey.of("ed25519");
KeyPair keyPair1 = new KeyPair(publicKey);
KeyPair keyPair2 = new KeyPair(publicKey);

assertEquals(keyPair1, keyPair2);
	}

            }