package org.stellar.sdk;

public class GeneratedTestEdDSAPublicKeyEquality {

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
    public void testEdDSAPublicKeyEquality() {
        // implement your test logic here, for example:
        EdDSAPublicKey eddsaPublicKey2 = new EdDSAPublicKey(eddsaPublicKeyValue);
        assertEquals(this.eddsaPublicKey, eddsaPublicKey2);
    }
}

public class XdrPublicKeyTest {

    private final PublicKey publicKey;

    @Before
    public void setup() {
        // initialize the test data
        this.publicKey = new PublicKey(); // you need to implement this
    }

    private static final String publicKeyValue = "your_public_key_value";

    @Before
    public void setupTest() {
        // initialize the test data
        this.publicKey = new PublicKey(publicKeyValue);
    }

}