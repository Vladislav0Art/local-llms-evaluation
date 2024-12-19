package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetXdrSignerKey {

    @Test
    public void testGetXdrSignerKey() {
        SignerKey signerKey = EdDSAPublicKey.generate();
        KeyPair keyPair = new KeyPair(KeyPair.fromPublicKey(signerKey.getXdrPublic()));
        assertNotNull(keyPair);
        assertEquals(EdDSAPublicKey.class, keyPair.getPublicKey().getClass());
    }

}