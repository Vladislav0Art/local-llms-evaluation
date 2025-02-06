package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCanSign_InvalidInput_ReturnsFalse {

    @Test
    public void canSign_InvalidInput_ReturnsFalse() throws GeneralSecurityException {
        KeyPair keyPair = new KeyPair(null);
        assertFalse(keyPair.canSign());
    }

}