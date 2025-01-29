package org.stellar.sdk;

public class GeneratedTestCanVerifySignature {

    @Test
    public void testCanVerifySignature() throws SignatureException, GeneralSecurityException {
        EdDSAEngine eddsaEngine = EdDSAEngine.getInstance("secp256k1");
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromSecretSeed("publicKey"));
        Signature signature = keyPair.signDecorator(decoratedSignature);
        assertTrue(KeyPair.verify(keyPair.getPublicKey(), signature));
    }

}