package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSign_SignatureValid_ReturnsSignature {

    @Test
    public void sign_SignatureValid_ReturnsSignature() throws IOException {
        char[] secretSeed = "some_seed".toCharArray();
        Signature signature = Signature.getInstance("SHA256withEd25519");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XdrDataOutputStream out = new XdrDataOutputStream(bos);
        EdDSAPrivateKey privateKey = KeyPair.fromSecretSeed(secretSeed).getPrivateKey();
        signature.initSign(privateKey);
        signature.update(new Uint256(1));
        boolean success = signature.sign();
        assertTrue(success);
        byte[] signedBytes = bos.toByteArray();
        assertEquals(signature.getSignature(), signedBytes);
    }

}