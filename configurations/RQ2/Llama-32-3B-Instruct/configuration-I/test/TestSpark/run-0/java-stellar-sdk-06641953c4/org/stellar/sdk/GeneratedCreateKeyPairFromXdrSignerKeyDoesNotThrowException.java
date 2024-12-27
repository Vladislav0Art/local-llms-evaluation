package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedCreateKeyPairFromXdrSignerKeyDoesNotThrowException {

    @Test
    public void createKeyPairFromXdrSignerKeyDoesNotThrowException() {
        SignerKey xdrSignerKey = new SignerKey();
        KeyPair keyPair = KeyPair.fromXdrSignerKey(xdrSignerKey);
        assertNotNull(keyPair);
    }

}