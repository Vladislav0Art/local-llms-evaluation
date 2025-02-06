package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCannotSignWhenPublicKeyIsNull {

    @Test
    public void cannotSignWhenPublicKeyIsNull() {
        assertNull(new KeyPair(null).canSign());
    }

}