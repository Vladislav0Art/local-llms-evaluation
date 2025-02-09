package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;

public class GeneratedCanSignFalseShouldReturnNull {

    @Test
    public void canSignFalseShouldReturnNull() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        keyPair.setCanSign(false);
        assertFalse(keyPair.canSign());
    }

}