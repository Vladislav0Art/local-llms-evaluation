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

public class GeneratedCanSignTest {

    @Test
    public void canSignTest() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        EdDSAPrivateKey privateKey = Mockito.mock(EdDSAPrivateKey.class);

        KeyPair keyPairWithPrivateKey = new KeyPair(publicKey, privateKey);
        Assert.assertTrue(keyPairWithPrivateKey.canSign());

        KeyPair keyPairWithoutPrivateKey = new KeyPair(publicKey, null);
        Assert.assertFalse(keyPairWithoutPrivateKey.canSign());
    }

}