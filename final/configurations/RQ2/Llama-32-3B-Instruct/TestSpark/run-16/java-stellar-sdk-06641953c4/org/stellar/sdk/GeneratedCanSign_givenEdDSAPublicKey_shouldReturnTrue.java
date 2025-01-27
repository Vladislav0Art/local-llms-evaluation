package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedCanSign_givenEdDSAPublicKey_shouldReturnTrue {

    @Test
    public void canSign_givenEdDSAPublicKey_shouldReturnTrue() throws GeneralSecurityException {
        EdDSAPrivateKey private_key = new EdDSAPrivateKey();
        EdDSAPublicKey public_key = new EdDSAPublicKey();
        KeyPair key_pair = new KeyPair(public_key);
        assertTrue(key_pair.canSign());
    }

}