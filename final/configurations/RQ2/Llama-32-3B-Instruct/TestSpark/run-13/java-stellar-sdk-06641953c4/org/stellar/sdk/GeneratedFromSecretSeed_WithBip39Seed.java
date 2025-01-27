package org.stellar.sdk;

public class GeneratedFromSecretSeed_WithBip39Seed {

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
    public void fromSecretSeed_WithBip39Seed() {
        when(decoderMock.decode("bip39 seed")).thenReturn(publicKeyMock);
        KeyPair keyPair = KeyPair.fromSecretSeed("bip39 seed", 0);
        assertNotNull(keyPair);
    }

}