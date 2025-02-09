package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class GeneratedGetAccountIdEmptyStringTest {

    @Test
    public void getAccountIdEmptyStringTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new String[]{});
        assertNull(keyPair.getAccountId());
    }
}

public class KeyPair {

    private final PublicKey publicKey;

    public KeyPair(PublicKey publicKey) {
        this.publicKey = publicKey;
    }

}