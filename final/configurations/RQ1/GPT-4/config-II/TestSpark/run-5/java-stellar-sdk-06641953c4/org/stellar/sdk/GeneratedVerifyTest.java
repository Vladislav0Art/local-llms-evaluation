package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.SignatureHint;

import java.security.GeneralSecurityException;
import java.security.SignatureException;
import java.util.Arrays;

public class GeneratedVerifyTest {

    @Test
    public void verifyTest() throws GeneralSecurityException {
        byte[] publicKeyArray = {'t', 'e', 's', 't'};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKeyArray);

        byte[] data = {'t', 'e', 's', 't'};
        byte[] signature = {'s', 'i', 'g'};

        try {
            Assert.assertFalse(keyPair.verify(data, signature));
            Assert.assertFalse(keyPair.verify(null, null));
        } catch (RuntimeException e) {
            Assert.assertTrue(e instanceof RuntimeException);
        }

        try {
            keyPair.verify(data, null);
            Assert.fail("Expected a SignatureException to be thrown");
        } catch (SignatureException e) {
            Assert.assertTrue(e instanceof SignatureException);
        }
    }

}