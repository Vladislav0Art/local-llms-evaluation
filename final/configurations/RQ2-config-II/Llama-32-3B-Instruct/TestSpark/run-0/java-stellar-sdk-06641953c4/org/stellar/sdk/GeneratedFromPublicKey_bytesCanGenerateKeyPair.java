package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.security.GeneralSecurityException;

public class GeneratedFromPublicKey_bytesCanGenerateKeyPair {

    @Test
    public void fromPublicKey_bytesCanGenerateKeyPair() {
        byte[] publicKey = {1, 2, 3};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair.getXdrPublicKey());
    }

}