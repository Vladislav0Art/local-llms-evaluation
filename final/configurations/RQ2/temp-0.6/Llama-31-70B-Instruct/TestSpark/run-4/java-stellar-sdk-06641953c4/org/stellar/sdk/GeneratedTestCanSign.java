package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedTestCanSign {

    @Test
    public void testCanSign() {
        KeyPair keyPair = new KeyPair(new EdDSAPrivateKey(new EdDSAPrivateKeySpec(new byte[32], 0)));
        assertTrue(keyPair.canSign());
    }

}