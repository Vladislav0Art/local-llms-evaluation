package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;

public class GeneratedFromPublicKeyTest {

    @Test
    public void fromPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] publicKey = keyPair.getPublicKey();
        KeyPair keyPairFromPublicKey = KeyPair.fromPublicKey(publicKey);
        Assert.assertNotNull(keyPairFromPublicKey);
    }

}