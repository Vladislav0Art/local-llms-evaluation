package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.security.GeneralSecurityException;
import java.util.Arrays;

import org.junit.Test;

public class GeneratedCheckCanSign {

    @Test
    public void checkCanSign() {
        // Arrange
        KeyPair keyPair = KeyPair.fromSecretSeed("SAKNW4EUFGVW2B2O3JWG5F7GYNKLBPVUVWXNYJQE6KACPJAOTAFGCUQI");

        // Act
        boolean canSign = keyPair.canSign();

        // Assert
        assertTrue(canSign);
    }

}