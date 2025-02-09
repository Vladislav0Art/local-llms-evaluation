package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.SignerKeyType;

public class GeneratedFromSecretSeedBytesAndAccountNumberTest {

    public KeyPair generateKeyPair() {
        return KeyPair.random();
    }

    @Test
    public void fromSecretSeedBytesAndAccountNumberTest() {
        byte[] bip39Seed = "seed".getBytes();
        KeyPair actual = KeyPair.fromBip39Seed(bip39Seed, 1);
        Assert.assertNotNull(actual);
    }

}