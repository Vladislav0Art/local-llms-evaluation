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

public class GeneratedFromPublicKeyInvalidArgumentsTest {

    @Test
    public void fromPublicKeyInvalidArgumentsTest() {
        KeyPair.fromPublicKey(new byte[]{1, 2, 3, 4});
    }

}