package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.SignerKeyType;

public class GeneratedFromSecretSeedStringTest {

    public KeyPair generateKeyPair() {
        return KeyPair.random();
    }

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "seed";
        KeyPair actual = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(actual);
    }

}