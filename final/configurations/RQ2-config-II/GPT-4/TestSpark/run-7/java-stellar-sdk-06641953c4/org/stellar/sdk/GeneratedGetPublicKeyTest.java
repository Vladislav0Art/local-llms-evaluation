package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.SignerKey;

import javax.xml.bind.DatatypeConverter;

import static org.junit.Assert.*;

public class GeneratedGetPublicKeyTest {

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getPublicKey());
    }

}