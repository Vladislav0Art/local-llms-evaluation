package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import static org.junit.Assert.*;

public class GeneratedFromPublicKeyValidArgumentsTest {

    @Test
    public void fromPublicKeyValidArgumentsTest() {
        KeyPair keyPair = KeyPair.fromPublicKey(new byte[32]);
        assertNotNull(keyPair);
    }

}