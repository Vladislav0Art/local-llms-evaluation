package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;

public class GeneratedFromXdrPublicKeyTest {

    @Test
    public void fromXdrPublicKeyTest() {
        KeyPair randomKeyPair = KeyPair.random();
        KeyPair keyPair = KeyPair.fromXdrPublicKey(randomKeyPair.getXdrPublicKey());
        Assert.assertNotNull(keyPair);
    }

}