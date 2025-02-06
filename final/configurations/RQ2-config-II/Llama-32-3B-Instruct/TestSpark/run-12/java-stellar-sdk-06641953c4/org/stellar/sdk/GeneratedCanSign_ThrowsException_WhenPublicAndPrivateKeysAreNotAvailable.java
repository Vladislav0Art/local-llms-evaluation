package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.security.MessageDigest;

public class GeneratedCanSign_ThrowsException_WhenPublicAndPrivateKeysAreNotAvailable {

    @Test
    public void canSign_ThrowsException_WhenPublicAndPrivateKeysAreNotAvailable() {
        EdDSAPublicKey publicKey = null;
        EdDSAPrivateKey privateKey = null;
        assertFalse(KeyPair.canSign(publicKey, privateKey));
    }
}

}