package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedConstructor_givenEdDSAPublicKey_shouldCreateValidKeyPair {

    @Test
    public void constructor_givenEdDSAPublicKey_shouldCreateValidKeyPair() throws GeneralSecurityException {
        EdDSAPrivateKey private_key = new EdDSAPrivateKey();
        EdDSAPublicKey public_key = new EdDSAPublicKey();
        KeyPair key_pair = new KeyPair(public_key);
        assertNotNull(key_pair);
    }

}