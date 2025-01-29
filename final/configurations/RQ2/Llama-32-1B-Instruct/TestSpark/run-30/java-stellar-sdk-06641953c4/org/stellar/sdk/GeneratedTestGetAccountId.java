package org.stellar.sdk;

import java.security.KeyPair;
import java.security.KeyPairBuilder;
import java.security.PrivateKey;
import java.util.Base64;

public class GeneratedTestGetAccountId {

    @Test
    public void testGetAccountId() throws GeneralSecurityException {
        String accountId = "your_account_id_here";
        KeyPair keyPair = KeyPairBuilder.fromAccountId(accountId)
                .setAlgorithm(EdDSAPublicKeyAlgorithm.fromAlgorithmName("Ed25519"))
                .build();
        Preconditions.checkNotNull(keyPair);
        assertEquals(accountId, keyPair.getAccountId());
    }

}