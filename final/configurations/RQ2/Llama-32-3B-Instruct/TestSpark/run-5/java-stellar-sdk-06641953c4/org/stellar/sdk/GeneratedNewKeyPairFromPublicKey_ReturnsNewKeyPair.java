package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedNewKeyPairFromPublicKey_ReturnsNewKeyPair {

    @Test
    public void newKeyPairFromPublicKey_ReturnsNewKeyPair() {
        byte[] publicKey = {1, 2, 3};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
    }

}