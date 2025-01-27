package org.stellar.sdk;

public class GeneratedCreateKeyPairFromPublicKeypublicKeyNoThrowTest {

    @Test
    public void createKeyPairFromPublicKeypublicKeyNoThrowTest() {
        EdDSAPublicKey publicKey = EdDSAPublicKey.getInstance(EdDSANamedCurveTable.getByName("secp256k1"));
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(keyPair.canSign());
    }

}