package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedTestCanSign {

    @Test
    public void testCanSign() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(new EdDSAPrivateKey(new EdDSAPrivateKeySpec(new byte[32], EdDSANamedCurveTable.getByName("Ed25519")))));
        Assert.assertTrue(keyPair.canSign());
    }

}