package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestFromXdrPublicKey {

    @Test
    public void testFromXdrPublicKey() {
        PublicKey publicKey = EdDSAPublicKey.generate();
        KeyPair keyPair = new KeyPair(KeyPair.fromXdrPublicKey(publicKey));
        assertNotNull(keyPair);
        assertEquals(EdDSAPublicKey.class, keyPair.getPublicKey().getClass());
    }

}