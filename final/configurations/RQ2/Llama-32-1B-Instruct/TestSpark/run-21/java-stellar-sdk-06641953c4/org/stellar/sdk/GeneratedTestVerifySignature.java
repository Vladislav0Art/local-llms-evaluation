package org.stellar.sdk;

public class GeneratedTestVerifySignature {

    public static KeyPair fromXdrPublicKey(PublicKey key) {
        return new EdDSAKeyPair(key);
    }

    public boolean canSign() {
        // placeholder implementation
        return true;
    }
}

public class KeyPairTest {

    @Test
    public void testVerifySignature() throws IOException, SignatureException {
        EdDSAPrivateKey privateKey = new EdDSAPrivateKey("...");
        XDRKeyPair xdrKeyPair = new XDRKeyPair(privateKey);
        byte[] data = "...".getBytes();
        DecoratedSignature signature = key.sign(data);
        assertTrue(xdrKeyPair.verify(data, signature));
    }

}