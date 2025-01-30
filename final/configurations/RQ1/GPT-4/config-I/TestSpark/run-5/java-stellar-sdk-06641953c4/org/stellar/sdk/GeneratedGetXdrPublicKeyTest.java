package org.stellar.sdk;

import net.i2p.crypto.eddsa.*;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.DecoratedSignature;

import java.security.MessageDigest;

public class GeneratedGetXdrPublicKeyTest {

    @Test
    public void getXdrPublicKeyTest() {
        byte[] seed = new byte[32];
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        PublicKey publicKey = keyPair.getXdrPublicKey();
        Assert.assertNotNull(publicKey);
    }

}