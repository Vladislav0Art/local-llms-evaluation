package org.stellar.sdk;

import net.i2p.crypto.eddsa.*;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.DecoratedSignature;

import java.security.MessageDigest;

public class GeneratedGetXdrSignerKeyTest {

    @Test
    public void getXdrSignerKeyTest() {
        byte[] seed = new byte[32];
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        SignerKey signerKey = keyPair.getXdrSignerKey();
        Assert.assertNotNull(signerKey);
    }

}