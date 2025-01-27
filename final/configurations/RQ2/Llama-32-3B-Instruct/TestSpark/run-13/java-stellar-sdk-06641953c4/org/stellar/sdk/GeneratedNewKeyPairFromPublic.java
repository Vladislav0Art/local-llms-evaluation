package org.stellar.sdk;

public class GeneratedNewKeyPairFromPublic {

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
    public void newKeyPairFromPublic() {
        when(publicKeyMock.getEncoded()).thenReturn(new byte[]{1, 2, 3});
        KeyPair keyPair = KeyPair.newKeyPair(publicKeyMock);
        assertNotNull(keyPair);
        assertEquals(3, keyPair.getPublicKey().length);
    }

}