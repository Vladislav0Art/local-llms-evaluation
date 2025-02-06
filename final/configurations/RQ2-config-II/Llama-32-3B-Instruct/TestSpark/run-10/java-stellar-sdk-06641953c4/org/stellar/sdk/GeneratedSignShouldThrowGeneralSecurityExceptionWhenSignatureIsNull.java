package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSignShouldThrowGeneralSecurityExceptionWhenSignatureIsNull {

    @Test
    public void signShouldThrowGeneralSecurityExceptionWhenSignatureIsNull() {
        assertThrows(GeneralSecurityException.class, () -> new KeyPair(null).sign(new byte[]{1}));
    }

}