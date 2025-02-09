package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;

public class GeneratedConstructorPublicKeyTest {

    @Test
    public void constructorPublicKeyTest() throws Exception {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        KeyPair keyPair = new KeyPair(publicKey);
        Assert.assertNotNull(keyPair);
    }

}