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

public class GeneratedSignTest {

    @Test
    public void signTest() throws GeneralSecurityException {
        byte[] publicKeyArray = {'t', 'e', 's', 't'};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKeyArray);

        byte[] data = {'t', 'e', 's', 't'};

        try {
            keyPair.sign(data);
            keyPair.sign(null);
        } catch (RuntimeException e) {
            Assert.assertTrue(e instanceof RuntimeException);
        }
    }

}