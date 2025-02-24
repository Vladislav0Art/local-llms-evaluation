package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.SignatureException;

public class GeneratedTestCanSign {

    @Test
    public void testCanSign() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new EdDSAPrivateKey(new EdDSAPrivateKeySpec(new byte[32], EdDSAParameterSpec.ED25519)));
        KeyPair keyPair = new KeyPair(publicKey);
        Assert.assertTrue(keyPair.canSign());
    }

}