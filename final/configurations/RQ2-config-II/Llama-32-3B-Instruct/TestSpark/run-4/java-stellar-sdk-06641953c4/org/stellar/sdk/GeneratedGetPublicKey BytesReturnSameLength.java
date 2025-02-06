package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedGetPublicKey BytesReturnSameLength {

    @Test
    public void getPublicKey

    BytesReturnSameLength() {
        byte[] publicKey = new byte[32];
        Arrays.fill(publicKey, (byte) 0x00);
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertEquals(32, keyPair.getPublicKey().length);
    }

}