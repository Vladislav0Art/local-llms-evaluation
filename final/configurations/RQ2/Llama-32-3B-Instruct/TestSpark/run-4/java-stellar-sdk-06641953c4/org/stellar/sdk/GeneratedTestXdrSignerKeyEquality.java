package org.stellar.sdk;

public class GeneratedTestXdrSignerKeyEquality {

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
    public void testXdrSignerKeyEquality() {
        // implement your test logic here, for example:
        SignerKey signerKey2 = new SignerKey(signerKeyValue);
        assertEquals(this.signerKey, signerKey2);
    }

}