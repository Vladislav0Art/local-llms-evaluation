package org.stellar.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class GeneratedFromSecretSeed_WithSeed_Succeeds {

    @Test
    public void fromSecretSeed_WithSeed_Succeeds() throws Exception {
        assertDoesNotThrow(() -> {
            KeyPair keyPair = KeyPair.fromSecretSeed("secret_seed", "public_key", "signer_public_key");
            // Use the keyPair object as needed
        });
    }

}