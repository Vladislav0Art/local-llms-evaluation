package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.util.Arrays;

public class GeneratedHashCode_GivenKeyPairReturnsUniqueHashCode {

    @Test
    public void hashCode_GivenKeyPairReturnsUniqueHashCode() throws IOException, GeneralSecurityException {
        KeyPair keyPair1 = new KeyPair(new EdDSAPublicKey("seed1".getBytes()));
        KeyPair keyPair2 = new KeyPair(new EdDSAPublicKey("seed2".getBytes()));
        assertNotEquals(keyPair1.hashCode(), keyPair2.hashCode());
    }

}