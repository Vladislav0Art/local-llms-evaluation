package org.stellar.sdk;

public class GeneratedSign_ReturnsSignatureForGivenDataWithAccountNumber {

    @Test
    public void sign_ReturnsSignatureForGivenDataWithAccountNumber() throws GeneralSecurityException, SignatureException {
        KeyPair key = new KeyPair(new EdDSAPublicKey("1234567890", 1));
        byte[] data = "Hello, World!".getBytes();
        XdrDataOutputStream xdr = new XdrDataOutputStream(new ByteArrayOutputStream());
        byte[] signature = key.sign(data, xdr);
        assertNotNull(signature);
    }

}