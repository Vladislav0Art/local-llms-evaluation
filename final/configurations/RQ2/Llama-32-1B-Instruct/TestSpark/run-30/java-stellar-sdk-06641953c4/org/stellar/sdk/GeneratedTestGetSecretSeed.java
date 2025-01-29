package org.stellar.sdk;

import java.security.KeyPair;
import java.security.KeyPairBuilder;
import java.security.PrivateKey;
import java.util.Base64;

public class GeneratedTestGetSecretSeed {

    @Test
    public void testGetSecretSeed() throws GeneralSecurityException {
        byte[] seed = "your_seed_here".getBytes();
        KeyPair keyPair = KeyPairBuilder.fromSecretSeed(seed)
                .setAlgorithm(EdDSAPublicKeyAlgorithm.fromAlgorithmName("Ed25519"))
                .build();
        Preconditions.checkNotNull(keyPair);
        assertEquals("your_secret_seed_here", new String(Base64.getEncoder().encode(keyPair.getPrivate())));
    }

}