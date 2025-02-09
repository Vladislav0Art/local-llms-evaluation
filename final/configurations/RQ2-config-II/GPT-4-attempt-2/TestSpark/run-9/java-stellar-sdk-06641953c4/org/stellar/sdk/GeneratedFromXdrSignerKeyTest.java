package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedFromXdrSignerKeyTest {

    @Test
    public void fromXdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.random();
        SignerKey signerKey = keyPair.getXdrSignerKey();
        KeyPair keyPairFromXdr = KeyPair.fromXdrSignerKey(signerKey);
        Assert.assertNotNull(keyPairFromXdr);
    }

}