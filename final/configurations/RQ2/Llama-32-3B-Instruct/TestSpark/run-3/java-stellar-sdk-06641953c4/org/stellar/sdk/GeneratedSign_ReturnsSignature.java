package org.stellar.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class GeneratedSign_ReturnsSignature {

    @Test
    public void sign_ReturnsSignature() throws Exception, NoSuchAlgorithmException, SignatureException {
        assertDoesNotThrow(() -> {
            KeyPair keyPair = KeyPair.fromSecretSeed("secret_seed", "public_key", "signer_public_key");
            byte[] signatureData = "signature_data".getBytes();
            Signature signature = keyPair.sign(signatureData);
            // Use the signature object as needed
        });
    }

}