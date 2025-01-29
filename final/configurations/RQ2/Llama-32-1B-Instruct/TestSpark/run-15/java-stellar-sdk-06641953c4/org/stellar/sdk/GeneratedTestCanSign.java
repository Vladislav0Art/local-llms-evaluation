package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCanSign {

    @Test
    public void testCanSign() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey("eddsa_key"));
        assertEquals(true, keyPair.canSign());
    }

}