package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCanSign_ReturnsTrue {

    @Mock
    private EdDSAPublicKey publicKey;

    @InjectMocks
    private KeyPair keyPair;

    @Test
    public void canSign_ReturnsTrue() {
        // Given
        when(publicKey.isVerifiable()).thenReturn(true);

        // When
        boolean result = keyPair.canSign();

        // Then
        assertTrue(result);
    }

}