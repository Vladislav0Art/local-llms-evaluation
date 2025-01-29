package org.stellar.sdk;

public class GeneratedTestSigningFromAccountId {

    @Test
    public void testSigningFromAccountId() {
        String accountId = "my_account_id";
        byte[] seed = "my_secret_seed".getBytes();
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertEquals(KeyPair.class, keyPair.getClass());
        assertNotEquals(null, keyPair.getSecretSeed());
    }

}