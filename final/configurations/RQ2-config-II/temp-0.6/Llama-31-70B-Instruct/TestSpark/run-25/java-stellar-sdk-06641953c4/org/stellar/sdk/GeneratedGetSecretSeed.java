package org.stellar.sdk;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedGetSecretSeed {

    @Mock
    public KeyPair keyPair;

    @Test
    public void getSecretSeed() {
        assertEquals(new char[0], keyPair.getSecretSeed());
    }

}