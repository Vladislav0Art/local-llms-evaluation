package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.security.MessageDigest;

public class GeneratedCanSign_DoesNotThrowException_WhenPublicAndPrivateKeysAreAvailable {

    @Test
    public void canSign_DoesNotThrowException_WhenPublicAndPrivateKeysAreAvailable() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        EdDSAPrivateKey privateKey = new EdDSAPrivateKey();
        assertTrue(KeyPair.canSign(publicKey, privateKey));
    }

}