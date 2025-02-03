package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRandom_ReturnsKeyPair {

    @Mock
    private EdDSAPublicKey publicKey;

    @Mock
    private EdDSAPrivateKey privateKey;

    @InjectMocks
    private KeyPair keyPair;

    @Test
    public void random_ReturnsKeyPair() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

}