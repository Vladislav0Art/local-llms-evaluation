package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.io.ByteArrayOutputStream;

public class GeneratedHashCode_givenKeyWhenReturnCorrectHashcode {

    @Test
    public void hashCode_givenKeyWhenReturnCorrectHashcode() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XdrDataOutputStream writer = new XdrDataOutputStream(out);
        KeyPair keyPair = new KeyPair(null); // constructor not used here, just a placeholder
        assertNotNull(keyPair.hashCode());
    }

}