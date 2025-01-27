package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedGetAccountId_givenEdDSAPublicKey_shouldReturnNull {

    @Test
    public void getAccountId_givenEdDSAPublicKey_shouldReturnNull() {
        EdDSAPrivateKey private_key = new EdDSAPrivateKey();
        EdDSAPublicKey public_key = new EdDSAPublicKey();
        KeyPair key_pair = new KeyPair(public_key);
        assertNull(key_pair.getAccountId());
    }

}