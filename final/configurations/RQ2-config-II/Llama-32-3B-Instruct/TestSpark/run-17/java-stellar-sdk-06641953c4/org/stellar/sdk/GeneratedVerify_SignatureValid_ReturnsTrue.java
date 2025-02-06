package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedVerify_SignatureValid_ReturnsTrue {

    @Test
    public void verify_SignatureValid_ReturnsTrue() throws IOException {
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
        assertFalse(KeyPair.fromSecretSeed(secretSeed).verify(signedBytes, signature.getSignature()));
    }

}