package org.stellar.sdk;

import java.security.KeyPair;
import java.security.KeyPairBuilder;
import java.security.PrivateKey;
import java.util.Base64;

public class GeneratedTestFromAccountId {

    @Test
    public void testFromAccountId() throws GeneralSecurityException {
        String accountId = "your_account_id_here";
        KeyPair keyPair = KeyPairBuilder.fromAccountId(accountId)
                .setAlgorithm(EdDSAPublicKeyAlgorithm.fromAlgorithmName("Ed25519"))
                .setPublic(EdDSAPublicKey.fromPublicKey("your_public_key_here"))
                .build();
        Preconditions.checkNotNull(keyPair);
        assertEquals(EdDSAPublicKey.class, keyPair.getPublicKey().getClass());
    }

}