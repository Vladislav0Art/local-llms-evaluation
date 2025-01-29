package org.stellar.sdk;

import com.google.common.baseObjects.ObjectOf;
import org.junit.Test;

import static org.junit.Assert.*;

import java.security.KeyPair;

public class GeneratedTestGetXdrPublicKey {

    @Test
    public void testGetXdrPublicKey() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey().generateBip39Seed("seed1"));
        PublicKey publicKey = keyPair.getXdrPublicKey();
        assertNotNull(publicKey);
        assertEquals(EdDSAPublicKey.class, publicKey.getClass());
    }

}