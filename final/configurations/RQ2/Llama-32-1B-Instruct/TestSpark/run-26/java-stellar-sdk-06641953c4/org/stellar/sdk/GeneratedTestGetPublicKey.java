package org.stellar.sdk;

import com.google.common.baseObjects.ObjectOf;
import org.junit.Test;

import static org.junit.Assert.*;

import java.security.KeyPair;

public class GeneratedTestGetPublicKey {

    @Test
    public void testGetPublicKey() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey().generateBip39Seed("seed1"));
        PublicKey publicKey = keyPair.getPublicKey();
        assertNotNull(publicKey);
        assertEquals(EdDSAPublicKey.class, publicKey.getClass());
        assertEquals("random seed", Objects.toString(publicKey), "[]");
    }

}