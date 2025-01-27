package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetXdrPublicKey_GivenKeyPair_ReturnsXdrPublicKey {

    @Test
    public void getXdrPublicKey_GivenKeyPair_ReturnsXdrPublicKey() {
        PublicKey xdrPublicKey = new PublicKey();
        EdDSAPublicKey publicKey = new EdDSAPublicKey(xdrPublicKey);
        KeyPair keyPair = new KeyPair(publicKey);
        assertEquals(xdrPublicKey, keyPair.getXdrPublicKey());
    }

}