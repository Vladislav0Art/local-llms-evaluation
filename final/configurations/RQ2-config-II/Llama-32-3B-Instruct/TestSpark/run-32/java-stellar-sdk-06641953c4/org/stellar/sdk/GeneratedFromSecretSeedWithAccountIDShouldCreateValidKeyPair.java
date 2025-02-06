package org.stellar.sdk;

public class GeneratedFromSecretSeedWithAccountIDShouldCreateValidKeyPair {

    @Test
    public void fromSecretSeedWithAccountIDShouldCreateValidKeyPair() throws Exception {
        String accountId = ...;
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

}