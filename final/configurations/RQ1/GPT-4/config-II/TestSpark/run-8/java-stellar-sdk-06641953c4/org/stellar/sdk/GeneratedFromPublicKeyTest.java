package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedFromPublicKeyTest {

    @Test
    public void fromPublicKeyTest() throws GeneralSecurityException {
        byte[] publicKey = new byte[32];
        new java.security.SecureRandom().nextBytes(publicKey);
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
    }

}