package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.io.ByteArrayOutputStream;

public class GeneratedEquals_givenKeyWhenReturnCorrectEquals {

    @Test
    public void equals_givenKeyWhenReturnCorrectEquals() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XdrDataOutputStream writer = new XdrDataOutputStream(out);
        KeyPair keyPair1 = new KeyPair(null); // constructor not used here, just a placeholder
        KeyPair keyPair2 = new KeyPair(null); // constructor not used here, just a placeholder
        assertTrue(keyPair1.equals(keyPair2));
    }

}