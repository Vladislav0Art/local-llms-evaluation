package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedByteArrayTest {

    @Test
    public void fromSecretSeedByteArrayTest() throws GeneralSecurityException {
        byte[] seed = new byte[32];
        new java.security.SecureRandom().nextBytes(seed);
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}