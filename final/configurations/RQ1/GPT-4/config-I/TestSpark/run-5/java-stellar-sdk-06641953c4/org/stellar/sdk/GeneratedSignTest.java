package org.stellar.sdk;

import net.i2p.crypto.eddsa.*;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.DecoratedSignature;

import java.security.MessageDigest;

public class GeneratedSignTest {

    @Test
    public void signTest() {
        byte[] seed = new byte[32];
        byte[] data = "testdata".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        byte[] signature = keyPair.sign(data);
        Assert.assertNotNull(signature);
    }

}