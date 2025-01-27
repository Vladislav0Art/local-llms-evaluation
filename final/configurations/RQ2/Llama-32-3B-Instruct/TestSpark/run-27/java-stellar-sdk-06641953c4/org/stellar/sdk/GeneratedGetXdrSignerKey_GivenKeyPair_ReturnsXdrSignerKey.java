package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetXdrSignerKey_GivenKeyPair_ReturnsXdrSignerKey {

    @Test
    public void getXdrSignerKey_GivenKeyPair_ReturnsXdrSignerKey() {
        SignerKey xdrSignerKey = new SignerKey();
        EdDSAPrivateKey privateKey = new EdDSAPrivateKey(xdrSignerKey);
        KeyPair keyPair = new KeyPair(privateKey);
        assertEquals(xdrSignerKey, keyPair.getXdrSignerKey());
    }

}