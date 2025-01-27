package org.stellar.sdk;

public class GeneratedSign_ReturnsSignatureForGivenData {

    @Test
    public void sign_ReturnsSignatureForGivenData() throws GeneralSecurityException, SignatureException {
        KeyPair key = new KeyPair(new EdDSAPublicKey());
        byte[] data = "Hello, World!".getBytes();
        XdrDataOutputStream xdr = new XdrDataOutputStream(new ByteArrayOutputStream());
        byte[] signature = key.sign(data, xdr);
        assertNotNull(signature);
    }

}