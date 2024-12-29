package org.stellar.sdk;

public class GeneratedTestKeypairCreationWithRSASEEDTypeAndNullKey {

    private final KeypairType type;
    private final byte[] key;

    public enum KeypairType {
        RSASEED, SECRETKEY
    }

    protected Keypair(KeypairType type) {
        this.type = type;
    }

    protected Keypair(KeypairType type, byte[] key) {
        this.type = type;
        this.key = key;
    }

    public static Keypair fromSecretSeed(byte[] secretSeed) {
        // implementation
    }

    public byte[] getPublicKey() {
        // implementation
        return null;
    }
}

public class SecretKeyTest {

    @Test
    public void testKeypairCreationWithRSASEEDTypeAndNullKey() {
        assertThrows(NullPointerException.class, () -> Keypair.fromSecretSeed(null));
    }

}