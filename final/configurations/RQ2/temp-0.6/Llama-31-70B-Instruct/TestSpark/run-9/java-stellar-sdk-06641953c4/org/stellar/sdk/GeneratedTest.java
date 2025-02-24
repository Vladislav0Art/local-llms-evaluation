package org.stellar.sdk;

public class GeneratedTest {

    private KeyPair keyPair;

    @BeforeEach
    public void setUp() {
        keyPair = new KeyPair(/* TODO: mock or create real EdDSAPublicKey instance */);
    }

    @Test
    public void canSignTest() {
        boolean result = keyPair.canSign();
        assertTrue(result);
    }

    @Test
    public void getAccountIdTest() {
        String accountId = keyPair.getAccountId();
        assertNotNull(accountId);
    }

    @Test
    public void getSecretSeedTest() {
        char[] secretSeed = keyPair.getSecretSeed();
        assertNotNull(secretSeed);
    }

    @Test
    public void getPublicKeyTest() {
        byte[] publicKey = keyPair.getPublicKey();
        assertNotNull(publicKey);
    }

    @Test
    public void getSignatureHintTest() {
        SignatureHint signatureHint = keyPair.getSignatureHint();
        assertNotNull(signatureHint);
    }

    @Test
    public void getXdrPublicKeyTest() {
        PublicKey xdrPublicKey = keyPair.getXdrPublicKey();
        assertNotNull(xdrPublicKey);
    }

    @Test
    public void getXdrSignerKeyTest() {
        SignerKey xdrSignerKey = keyPair.getXdrSignerKey();
        assertNotNull(xdrSignerKey);
    }

    @Test
    public void fromXdrPublicKeyTest() {
        PublicKey xdrPublicKey = new PublicKey();
        // TODO: set up xdrPublicKey properties

        KeyPair keyPair = KeyPair.fromXdrPublicKey(xdrPublicKey);
        assertNotNull(keyPair);
    }

}