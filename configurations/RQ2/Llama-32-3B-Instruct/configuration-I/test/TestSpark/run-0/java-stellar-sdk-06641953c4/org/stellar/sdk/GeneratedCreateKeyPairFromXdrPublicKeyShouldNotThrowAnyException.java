package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedCreateKeyPairFromXdrPublicKeyShouldNotThrowAnyException {

    @Test
    public void createKeyPairFromXdrPublicKeyShouldNotThrowAnyException() {
        PublicKey xdrPublicKey = new PublicKey();
        KeyPair keyPair = KeyPair.fromXdrPublicKey(xdrPublicKey);
        assertNotNull(keyPair);
    }

}