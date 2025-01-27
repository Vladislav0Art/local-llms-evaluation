package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedGetSecretSeed_givenEdDSAPublicKey_shouldReturnNull {

    @Test
    public void getSecretSeed_givenEdDSAPublicKey_shouldReturnNull() {
        EdDSAPrivateKey private_key = new EdDSAPrivateKey();
        EdDSAPublicKey public_key = new EdDSAPublicKey();
        KeyPair key_pair = new KeyPair(public_key);
        assertArrayEquals(0, key_pair.getSecretSeed());
    }

}