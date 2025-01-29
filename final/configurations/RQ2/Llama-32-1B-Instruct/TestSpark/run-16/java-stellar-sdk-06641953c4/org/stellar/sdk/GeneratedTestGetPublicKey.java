package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GeneratedTestGetPublicKey {

    @Test
    public void testGetPublicKey() {
        PublicKey publicKey = EdDSAPublicKeyGenerator.generatePublicKey(new byte[]{1, 2, 3});
        assertNotNull(publicKey);
        assertEquals(EdDSAPublicKey.class, publicKey.getClass());
    }

}