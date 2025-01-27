package org.stellar.sdk;

public class GeneratedVerifyBytesbytesSignatureTest {

    @Test
    public void verifyBytesbytesSignatureTest() throws IOException, GeneralSecurityException {
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.getInstance(EdDSANamedCurveTable.getByName("secp256k1")));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XdrDataOutputStream dos = new XdrDataOutputStream(bos);
        dos.writeUint32(12345);
        dos.writeUint64(67890);
        byte[] signature = keyPair.sign(bos.toByteArray());
        assertTrue(keyPair.verify(bos.toByteArray(), signature));
    }

}