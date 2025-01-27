package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRandom_GeneratedKeysTest {

    @Test
    public void random_GeneratedKeysTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }
}

public class EdDSAPrivateKeyTest {

    private final EdDSAPrivateKey eddsaPrivateKey;

    public EdDSAPrivateKeyTest(EdDSAPrivateKey eddsaPrivateKey) {
        this.eddsaPrivateKey = checkNotNull(eddsaPrivateKey);
    }

}