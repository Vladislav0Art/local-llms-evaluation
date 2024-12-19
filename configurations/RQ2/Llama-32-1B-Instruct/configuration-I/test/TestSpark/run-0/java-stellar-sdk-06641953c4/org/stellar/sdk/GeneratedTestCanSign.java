package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCanSign {

    @Test
    public void testCanSign() {
        EdDSAPublicKey publicKey = EdDSAPublicKey.generate();
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(keyPair.canSign());
    }

}