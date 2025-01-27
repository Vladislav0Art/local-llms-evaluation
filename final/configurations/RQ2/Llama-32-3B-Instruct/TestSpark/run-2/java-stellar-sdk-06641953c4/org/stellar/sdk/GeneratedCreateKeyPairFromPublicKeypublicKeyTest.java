package org.stellar.sdk;

public class GeneratedCreateKeyPairFromPublicKeypublicKeyTest {

    @Test
    public void createKeyPairFromPublicKeypublicKeyTest() {
        EdDSAPublicKey publicKey = EdDSAPublicKey.getInstance(EdDSANamedCurveTable.getByName("secp256k1"));
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
    }

}