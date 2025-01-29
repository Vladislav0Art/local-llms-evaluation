package org.stellar.sdk;

import java.security.KeyPair;
import java.security.KeyPairBuilder;
import java.security.PrivateKey;
import java.util.Base64;

public class GeneratedTestFromSecretSeed {

    @Test
    public void testFromSecretSeed() throws GeneralSecurityException {
        byte[] seed = new byte[]{};
        KeyPair keyPair = KeyPairBuilder.fromSecretSeed(seed)
                .setAlgorithm(EdDSAPublicKeyAlgorithm.fromAlgorithmName("Ed25519"))
                .build();
        Preconditions.checkNotNull(keyPair);
        assertEquals(EdDSASecretKeySpec.class, keyPair.getPrivate().getClass());
    }

}