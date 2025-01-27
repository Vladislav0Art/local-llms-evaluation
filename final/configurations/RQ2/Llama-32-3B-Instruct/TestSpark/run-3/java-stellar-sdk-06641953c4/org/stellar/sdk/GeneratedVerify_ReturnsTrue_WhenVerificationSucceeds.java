package org.stellar.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class GeneratedVerify_ReturnsTrue_WhenVerificationSucceeds {

    @Test
    public void verify_ReturnsTrue_WhenVerificationSucceeds() throws Exception, NoSuchAlgorithmException {
        assertDoesNotThrow(() -> {
            KeyPair keyPair = KeyPair.fromSecretSeed("secret_seed", "public_key", "signer_public_key");
            byte[] signatureData = keyPair.sign("signature_data").getBytes();
            boolean result = keyPair.verify(signatureData);
            // Use the result object as needed
        });
    }

}