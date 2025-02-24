package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetSignatureHint {

    @InjectMocks
    private KeyPair keyPair;

    @Mock
    private MessageDigest messageDigest;

    @Test
    public void testGetSignatureHint() {
        SignatureHint signatureHint = new SignatureHint();
        when(keyPair.getSignatureHint()).thenReturn(signatureHint);
        assertEquals(keyPair.getSignatureHint(), signatureHint);
    }

}