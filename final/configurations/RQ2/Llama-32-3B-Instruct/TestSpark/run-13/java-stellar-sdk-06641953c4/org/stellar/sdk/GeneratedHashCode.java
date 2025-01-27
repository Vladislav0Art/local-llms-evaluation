package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedHashCode {

    @Mock
    private EdDSAPublicKey publicKeyMock;

    @Mock
    private EdDSADecoder decoderMock;

    @Test
    public void hashCode() {
        KeyPair keyPair = new KeyPair(publicKeyMock);
        int hashCode = keyPair.hashCode();
        assertNotNull(hashCode);
    }

}