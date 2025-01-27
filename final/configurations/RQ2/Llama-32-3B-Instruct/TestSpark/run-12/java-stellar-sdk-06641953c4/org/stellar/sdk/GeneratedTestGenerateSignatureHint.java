package org.stellar.sdk;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGenerateSignatureHint {

    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
        mock(SignatureHint.class);
    }

    private SignatureHint signatureHint = mock(SignatureHint.class);

    @Test
    public void testGenerateSignatureHint() {
        SignatureHint generatedSignatureHint = Mockito.mock(SignatureHint.class);

        assertEquals(generatedSignatureHint, signatureHint);
    }
}

}