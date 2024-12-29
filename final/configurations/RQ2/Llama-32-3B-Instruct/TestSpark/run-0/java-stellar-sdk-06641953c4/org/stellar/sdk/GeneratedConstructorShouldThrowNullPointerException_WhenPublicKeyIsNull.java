package org.stellar.sdk;

public class GeneratedConstructorShouldThrowNullPointerException_WhenPublicKeyIsNull {

    @Test
    public void constructorShouldThrowNullPointerException_WhenPublicKeyIsNull() {
        assertThrows(NullPointerException.class, () -> new KeyPair(null));
    }

}