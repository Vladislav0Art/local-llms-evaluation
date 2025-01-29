package org.stellar.sdk;

import java.security.KeyPair;
import java.security.KeyPairBuilder;
import java.security.PrivateKey;
import java.util.Base64;

public class GeneratedTestFromSecretSeed_String {

    @Test
    public void testFromSecretSeed_String() throws GeneralSecurityException {
        byte[] seed = "your_seed_here".getBytes();
        KeyPair keyPair = KeyPairBuilder.fromSecretSeed(seed)
                .setAlgorithm(EdDSAPublicKeyAlgorithm.fromAlgorithmName("Ed25519"))
                .setPublic(EdDSAPublicKey.fromPublicKey("your_public_key_here"))
                .build();
        Preconditions.checkNotNull(keyPair);
        assertEquals(EdDSAPublicKey.class, keyPair.getPublicKey().getClass());
    }

}