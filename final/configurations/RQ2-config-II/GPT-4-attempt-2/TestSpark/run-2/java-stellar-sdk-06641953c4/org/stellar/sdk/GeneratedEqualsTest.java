package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.KeyPairGenerator;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        KeyPair keyPair = KeyPair.random();
        KeyPair sameKeyPair = keyPair;
        assertTrue(keyPair.equals(sameKeyPair));
    }

}