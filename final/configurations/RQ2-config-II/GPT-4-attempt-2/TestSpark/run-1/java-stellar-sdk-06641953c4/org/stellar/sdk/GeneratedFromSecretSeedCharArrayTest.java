package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.SignerKeyType;

public class GeneratedFromSecretSeedCharArrayTest {

    public KeyPair generateKeyPair() {
        return KeyPair.random();
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] seed = {'s', 'e', 'e', 'd'};
        KeyPair actual = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(actual);
    }

}