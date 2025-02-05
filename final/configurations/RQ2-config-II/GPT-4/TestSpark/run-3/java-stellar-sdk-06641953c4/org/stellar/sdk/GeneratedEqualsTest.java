package org.stellar.sdk;

import org.hamcrest.core.IsEqual;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        KeyPair firstKeyPair = KeyPair.fromSecretSeed("TESTSEED".getBytes());
        KeyPair secondKeyPair = KeyPair.fromSecretSeed("TESTSEED".getBytes());
        assertTrue(firstKeyPair.equals(secondKeyPair));
    }

}