package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetSignatureHint {

    @Test
    public void testGetSignatureHint() {
        SignatureHint hint = EdDSAPublicKey.generate().getSignatureHint();
        KeyPair keyPair = new KeyPair(KeyPair.fromPublicKey(hint.getPublic()));
        assertNotNull(keyPair);
        assertEquals(EdDSAPublicKey.class, keyPair.getPublicKey().getClass());
    }

}