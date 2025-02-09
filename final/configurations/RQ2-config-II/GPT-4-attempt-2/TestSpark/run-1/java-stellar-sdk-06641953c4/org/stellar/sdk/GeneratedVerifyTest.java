package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.SignerKeyType;

public class GeneratedVerifyTest {

    public KeyPair generateKeyPair() {
        return KeyPair.random();
    }

    @Test
    public void verifyTest() {
        KeyPair keyPair = generateKeyPair();
        byte[] data = "test".getBytes();
        byte[] signature = keyPair.sign(data);
        Assert.assertTrue(keyPair.verify(data, signature));
    }

}