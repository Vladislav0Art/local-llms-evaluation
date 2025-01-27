package org.stellar.sdk;

public class GeneratedTestXdrPublicKeyEquality {

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
    public void testXdrPublicKeyEquality() {
        // implement your test logic here, for example:
        PublicKey publicKey2 = new PublicKey(publicKeyValue);
        assertEquals(this.publicKey, publicKey2);
    }
}

public class XdrSignerKeyTest {

    private final SignerKey signerKey;

    @Before
    public void setup() {
        // initialize the test data
        this.signerKey = new SignerKey(); // you need to implement this
    }

    private static final String signerKeyValue = "your_signer_key_value";

    @Before
    public void setupTest() {
        // initialize the test data
        this.signerKey = new SignerKey(signerKeyValue);
    }

}