package org.stellar.sdk;

import com.google.common.baseObjects.ObjectOf;
import org.junit.Test;

import static org.junit.Assert.*;

import java.security.KeyPair;

public class GeneratedTestFromAccountId {

    @Test
    public void testFromAccountId() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey().generateAccountId());
        assertNotNull(keyPair);
        assertEquals(EdDSAPublicKey.class, keyPair.getClass());
        assertEquals("random seed", keyPair.getAccountId(), Objects.toString(keyPair.getAccountId()));
    }

}