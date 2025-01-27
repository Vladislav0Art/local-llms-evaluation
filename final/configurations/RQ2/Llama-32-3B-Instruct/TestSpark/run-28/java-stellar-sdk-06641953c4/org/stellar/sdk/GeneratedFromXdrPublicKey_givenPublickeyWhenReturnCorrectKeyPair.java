package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.io.ByteArrayOutputStream;

public class GeneratedFromXdrPublicKey_givenPublickeyWhenReturnCorrectKeyPair {

    @Test
    public void fromXdrPublicKey_givenPublickeyWhenReturnCorrectKeyPair() {
        byte[] publicKey = "publickey".getBytes();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XdrDataOutputStream writer = new XdrDataOutputStream(out);
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKey);
        assertNotNull(keyPair.getPublicKey());
    }

}