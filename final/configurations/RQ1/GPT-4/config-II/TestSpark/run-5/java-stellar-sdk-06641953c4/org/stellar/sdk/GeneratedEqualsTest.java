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

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        char[] seed = {'t', 'e', 's', 't'};
        KeyPair keyPair1 = KeyPair.fromSecretSeed(seed);
        KeyPair keyPair2 = KeyPair.fromSecretSeed(seed);
        KeyPair keyPair3 = KeyPair.random();

        Assert.assertTrue(keyPair1.equals(keyPair2));
        Assert.assertFalse(keyPair1.equals(keyPair3));
        Assert.assertFalse(keyPair1.equals(null));
        Assert.assertFalse(keyPair1.equals(new Object()));
    }

}