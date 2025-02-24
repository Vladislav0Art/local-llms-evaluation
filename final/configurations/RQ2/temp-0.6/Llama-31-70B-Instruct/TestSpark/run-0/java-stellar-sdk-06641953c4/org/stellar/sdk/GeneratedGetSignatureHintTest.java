package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetSignatureHintTest {

    @Test
    public void getSignatureHintTest() {
        KeyPair keyPair = mock(KeyPair.class);
        SignatureHint signatureHint = mock(SignatureHint.class);
        when(keyPair.getSignatureHint()).thenReturn(signatureHint);
        assertEquals(signatureHint, keyPair.getSignatureHint());
    }

}