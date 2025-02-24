package org.stellar.sdk;

public class GeneratedGetAccountIdTest {

    private KeyPair keyPair;

    @BeforeEach
    public void setUp() {
        keyPair = new KeyPair(/* TODO: mock or create real EdDSAPublicKey instance */);
    }

    @Test
    public void getAccountIdTest() {
        String accountId = keyPair.getAccountId();
        assertNotNull(accountId);
    }

}