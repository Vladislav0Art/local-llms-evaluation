package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;

public class GeneratedTestCanSign {

    private KeyPair keyPair;

    @Before
    public void setUp() {
        keyPair = new KeyPair(new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], EdDSANamedCurveTable.getByName("ed25519-sha-256"))));
    }

    @After
    public void tearDown() {
        keyPair = null;
    }

    @Test
    public void testCanSign() throws Exception {
        Assert.assertTrue(keyPair.canSign());
    }

}