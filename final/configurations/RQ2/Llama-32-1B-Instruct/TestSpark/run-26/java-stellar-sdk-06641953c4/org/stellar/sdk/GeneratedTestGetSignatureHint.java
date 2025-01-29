package org.stellar.sdk;

import com.google.common.baseObjects.ObjectOf;
import org.junit.Test;

import static org.junit.Assert.*;

import java.security.KeyPair;

public class GeneratedTestGetSignatureHint {

    @Test
    public void testGetSignatureHint() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey().generateBip39Seed("seed1"));
        SignatureHint hint = keyPair.getSignatureHint();
        assertNotNull(hint);
        assertEquals(EdDSAPrivateKeySpec.class, hint.getClass());
    }

}