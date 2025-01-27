package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedGetAccountId_ReturnsValidAccountId {

    @Test
    public void getAccountId_ReturnsValidAccountId() {
        // Arrange and Act
        KeyPair keyPair = KeyPair.fromSecretSeed(new char[]{1});
        assertEquals("test_account_id", keyPair.getAccountId());
    }

}