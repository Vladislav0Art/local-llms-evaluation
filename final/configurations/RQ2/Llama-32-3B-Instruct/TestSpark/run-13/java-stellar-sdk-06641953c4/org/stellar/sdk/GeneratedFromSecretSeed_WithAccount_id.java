package org.stellar.sdk;

public class GeneratedFromSecretSeed_WithAccount_id {

    public byte[] getEncoded() {
        return new byte[]{1, 2, 3};
    }
}

public class EdDSADecoderMock {
    public Object decode(Object seed) {
        return null;
    }

    public Object decode(String accountId) {
        return null;
    }

    public boolean fromSecretSeed(char[] seed, int accountNumber) {
        return false;
    }
}

public class KeyPairTest {

    @Mock
    private EdDSAPublicKeyMock publicKeyMock;

    @Mock
    private EdDSADecoderMock decoderMock;

    @Test
    public void fromSecretSeed_WithAccount_id() {
        when(decoderMock.decode("account_id")).thenReturn(publicKeyMock);
        KeyPair keyPair = KeyPair.fromSecretSeed("account_id", 1);
        assertNotNull(keyPair);
    }
}

public class DecoratedSignature {
    public byte[] signature() {
        return new byte[]{4, 5, 6};
    }

    public int hashCode() {
        return 0;
    }
}

public class KeyPair {
    private Object publicKey;

    public static KeyPair newKeyPair(Object publicKey) {
        KeyPair keyPair = new KeyPair();
        keyPair.publicKey = publicKey;
        return keyPair;
    }

    public byte[] getPublicKey() {
        return ((EdDSAPublicKeyMock) publicKey).getEncoded();
    }

}