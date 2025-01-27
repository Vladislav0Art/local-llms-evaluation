package org.stellar.sdk;

public class GeneratedTestEdDSAPrivateKeyEquality {

    private final EdDSAPrivateKey eddsaPrivateKey;

    @Before
    public void setup() {
        // initialize the test data
        // for example, create a new EdDSAPrivateKey object
        this.eddsaPrivateKey = new EdDSAPrivateKey(); // you need to implement this
    }

    private static final String eddsaPrivateKeyValue = "your_private_key_value";

    @Before
    public void setupTest() {
        // initialize the test data
        this.eddsaPrivateKey = new EdDSAPrivateKey(eddsaPrivateKeyValue);
    }

    @Test
    public void testEdDSAPrivateKeyEquality() {
        // implement your test logic here, for example:
        EdDSAPrivateKey eddsaPrivateKey2 = new EdDSAPrivateKey(eddsaPrivateKeyValue);
        assertEquals(this.eddsaPrivateKey, eddsaPrivateKey2);
    }
}

public class EdDSAPublicKeyTest {

    private final EdDSAPublicKey eddsaPublicKey;

    @Before
    public void setup() {
        // initialize the test data
        this.eddsaPublicKey = new EdDSAPublicKey(); // you need to implement this
    }

    private static final String eddsaPublicKeyValue = "your_public_key_value";

    @Before
    public void setupTest() {
        // initialize the test data
        this.eddsaPublicKey = new EdDSAPublicKey(eddsaPublicKeyValue);
    }

}