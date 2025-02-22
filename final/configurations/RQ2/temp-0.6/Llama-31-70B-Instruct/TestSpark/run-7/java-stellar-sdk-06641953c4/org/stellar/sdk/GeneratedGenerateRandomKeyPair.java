package org.stellar.sdk;

import org.junit.jupiter.api.Test;
import org.stellar.sdk.KeyPair;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedGenerateRandomKeyPair {

    @Test
    public void generateRandomKeyPair() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

}