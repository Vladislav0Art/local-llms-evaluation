package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetPublicKey {

    @Test
    public void testGetPublicKey() {
        byte[] publicKey = EdDSAPublicKey.generate().getPublic();
        KeyPair keyPair = new KeyPair(KeyPair.fromPublicKey(publicKey));
        assertNotNull(keyPair);
        assertEquals(EdDSAPublicKey.class, keyPair.getPublicKey().getClass());
    }

}