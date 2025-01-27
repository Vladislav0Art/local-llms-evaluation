package org.stellar.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedFromSecretSeed_SingleCharacterSeed_ReturnsKeyPair {

    @Test
    public void fromSecretSeed_SingleCharacterSeed_ReturnsKeyPair() throws Exception {
        SecretKey secretKey = new SecretKey("secret-seed");
        KeyPair keyPair = Llama32_3B_Instruct_TestSpark.generateFromSecretKey(secretKey);
        assertNotNull(keyPair.getPublic());
    }

}