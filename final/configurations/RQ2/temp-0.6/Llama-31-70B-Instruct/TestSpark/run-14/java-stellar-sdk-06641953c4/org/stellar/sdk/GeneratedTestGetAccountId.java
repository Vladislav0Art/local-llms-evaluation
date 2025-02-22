package org.stellar.sdk;

public class GeneratedTestGetAccountId {

    private static KeyPair keyPair;

    @Before
    public void setUp() {
        keyPair = new KeyPair(new EdDSAPublicKey(), new EdDSAPrivateKey());
    }

    @Test
    public void testGetAccountId() {
        String accountId = keyPair.getAccountId();
        assertNotNull(accountId);
    }

}