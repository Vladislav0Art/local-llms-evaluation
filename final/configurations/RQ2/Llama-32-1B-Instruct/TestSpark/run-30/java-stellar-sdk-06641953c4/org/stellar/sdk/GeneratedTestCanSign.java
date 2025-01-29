package org.stellar.sdk;

import java.security.KeyPair;
import java.security.KeyPairBuilder;
import java.security.PrivateKey;
import java.util.Base64;

public class GeneratedTestCanSign {

    @Test
    public void testCanSign() throws GeneralSecurityException {
        KeyPair keyPair = new KeyPairBuilder()
                .setPublic(EdDSAPublicKey.fromPublicKey("your_public_key_here"))
                .setPrivate(EdDSASecretKeySpec.fromByteArray("your_secret_seed_here"))
                .build();
        Preconditions.checkNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

}