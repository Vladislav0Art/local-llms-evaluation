package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedTestGetAccountId {

    @Test
    public void testGetAccountId() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(new EdDSAPrivateKey(new EdDSAPrivateKeySpec(new byte[32], EdDSANamedCurveTable.getByName("Ed25519")))));
        Assert.assertNotNull(keyPair.getAccountId());
    }

}