package org.stellar.sdk;

import java.security.KeyPair;
import java.security.KeyPairBuilder;
import java.security.PrivateKey;
import java.util.Base64;

public class GeneratedTestRandom {

    @Test
    public void testRandom() throws GeneralSecurityException {
        KeyPair keyPair = new KeyPairBuilder()
                .setPublic(EdDSAPublicKey.fromPublicKey("your_public_key_here"))
                .build();
        Preconditions.checkNotNull(keyPair);
        assertFalse(keyPair.canSign());
    }

}