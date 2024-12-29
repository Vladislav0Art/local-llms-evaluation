package org.stellar.sdk;

public class GeneratedConstructorShouldNotThrowException_WhenPublicKeyIsNotNull {

    @Test
    public void constructorShouldNotThrowException_WhenPublicKeyIsNotNull() {
        EdDSAPublicKey publicKey = EdDSAPublicKey.generateRandom();
        new KeyPair(publicKey);
    }

}