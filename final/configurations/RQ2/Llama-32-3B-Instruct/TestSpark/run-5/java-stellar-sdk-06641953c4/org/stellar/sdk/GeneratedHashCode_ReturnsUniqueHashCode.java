package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedHashCode_ReturnsUniqueHashCode {

    @Test
    public void hashCode_ReturnsUniqueHashCode() {
        KeyPair keyPair1 = new KeyPair(new EdDSAPublicKey());
        KeyPair keyPair2 = new KeyPair(new EdDSAPublicKey());
        assertNotEquals(keyPair1.hashCode(), keyPair2.hashCode());
    }

}