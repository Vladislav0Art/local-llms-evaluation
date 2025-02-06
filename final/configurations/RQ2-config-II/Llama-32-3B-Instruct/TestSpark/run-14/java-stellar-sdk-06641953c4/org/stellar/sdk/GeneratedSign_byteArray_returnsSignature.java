package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.stellar.sdk.KeyPair;

public class GeneratedSign_byteArray_returnsSignature {

    @Test
    public void sign_byteArray_returnsSignature() throws IOException, GeneralSecurityException {
        byte[] data = "data".getBytes();
        Signature signature = new Signature("signature");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XdrDataOutputStream os = new XdrDataOutputStream(bos);
        byte[] signatureHint = {1, 2, 3};
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromSecretKeySpec("secret".toCharArray()));
        DecoratedSignature result = keyPair.sign(data);
        assertEquals(signature.getDigest(), result.getEncoded());
    }

}