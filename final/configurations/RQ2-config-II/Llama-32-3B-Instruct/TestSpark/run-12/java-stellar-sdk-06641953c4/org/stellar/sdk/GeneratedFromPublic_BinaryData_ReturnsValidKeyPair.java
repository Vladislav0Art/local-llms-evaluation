package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.security.MessageDigest;

public class GeneratedFromPublic_BinaryData_ReturnsValidKeyPair {

    @Test
    public void fromPublic_BinaryData_ReturnsValidKeyPair() {
        byte[] publicKey = {1, 2, 3};
        assertTrue(KeyPair.fromPublicKey(publicKey).getPublicKey().equals(publicKey));
    }
}

}