package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class GeneratedFromPublicXdrKeyLengthTest {

    @Test
    public void fromPublicXdrKeyLengthTest() {
        byte[] publicKey = {1, 2, 3};
        KeyPair keyPair = KeyPair.fromXdrPublicKey(new PublicKey(publicKey));
        assertEquals(3, publicKey.length);
    }

}