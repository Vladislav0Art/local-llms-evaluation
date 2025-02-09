package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedGetXdrPublicKeyTest {

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        PublicKey publicKey = keyPair.getXdrPublicKey();
        assertNotNull(publicKey);
    }

}