package org.stellar.sdk;

public class GeneratedFromXdrPublicKey_MatchesWithOriginal {

    private KeyPair keyPair;
    private EdDSAPublicKey publicKey;

    @Before
    public void setup() {
        this.publicKey = new EdDSAPublicKey();
        keyPair = new KeyPair(publicKey);
    }

    @Test
    public void fromXdrPublicKey_MatchesWithOriginal() {
        PublicKey xdrPublicKey = new PublicKey("test");
        KeyPair fromXdr = KeyPair.fromXdrPublicKey(xdrPublicKey);
        assertTrue(fromXdr.getXdrPublicKey().equals(xdrPublicKey));
    }

}