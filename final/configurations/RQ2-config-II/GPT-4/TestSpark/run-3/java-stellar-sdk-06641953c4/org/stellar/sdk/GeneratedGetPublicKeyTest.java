package org.stellar.sdk;

import org.hamcrest.core.IsEqual;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedGetPublicKeyTest {

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = KeyPair.fromPublicKey("PUBLIC KEY".getBytes());
        assertArrayEquals("PUBLIC KEY".getBytes(), keyPair.getPublicKey());
    }

}