package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.security.MessageDigest;

public class GeneratedGetPublic_BinaryData_ReturnsSamePublicKey {

    @Test
    public void getPublic_BinaryData_ReturnsSamePublicKey() {
        byte[] publicKey = KeyPair.fromBip39Seed("bip39-seed", 1).getPublicKey();
        assertEquals(publicKey, KeyPair.fromPublicKey(publicKey));
    }
}

}