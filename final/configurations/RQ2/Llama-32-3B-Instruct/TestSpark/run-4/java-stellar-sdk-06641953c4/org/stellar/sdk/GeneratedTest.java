package org.stellar.sdk;

public class GeneratedTest {

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
    public void testEdDSAPrivateKeyCreation() {
        assertNotNull(this.eddsaPrivateKey);
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

    @Test
    public void testEdDSAPublicKeyCreation() {
        assertNotNull(this.eddsaPublicKey);
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

    @Test
    public void testXdrPublicKeyCreation() {
        assertNotNull(this.publicKey);
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

    @Test
    public void testXdrSignerKeyCreation() {
        assertNotNull(this.signerKey);
    }

    @Test
    public void testXdrSignerKeyEquality() {
        // implement your test logic here, for example:
        SignerKey signerKey2 = new SignerKey(signerKeyValue);
        assertEquals(this.signerKey, signerKey2);
    }

}