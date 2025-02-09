package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;

public class GeneratedGetPublicTest {

    @Test
    public void getPublicTest() {
        KeyPair keyPair = KeyPair.random();
        String publicKey = keyPair.getPublicKey();
        Assert.assertNotNull(publicKey);
    }

}