package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.security.GeneralSecurityException;
import java.util.Arrays;

import org.junit.Test;

public class GeneratedCheckGetAccountId {

    @Test
    public void checkGetAccountId() {
        // Arrange
        KeyPair keyPair = KeyPair.fromSecretSeed("SAKNW4EUFGVW2B2O3JWG5F7GYNKLBPVUVWXNYJQE6KACPJAOTAFGCUQI");

        // Act
        String accountId = keyPair.getAccountId();

        // Assert
        assertEquals("GBY5H5W5E5JASVQ6V7MJSUB5NCX3OLO2M547QB6N2YU42BMAYQC25HWQ", accountId);
    }

}