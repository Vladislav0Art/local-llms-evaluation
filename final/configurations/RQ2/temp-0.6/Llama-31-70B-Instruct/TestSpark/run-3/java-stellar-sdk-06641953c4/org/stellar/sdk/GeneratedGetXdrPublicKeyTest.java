package org.stellar.sdk;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.stellar.sdk.KeyPair;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignatureHint;
import org.stellar.sdk.xdr.SignerKey;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.SignatureException;

import static org.junit.Assert.*;

public class GeneratedGetXdrPublicKeyTest {

    private KeyPair keyPair;

    @Before
    public void setUp() {
        // setup code
    }

    @After
    public void tearDown() {
        // tear down code
    }

    @Test
    public void getXdrPublicKeyTest() {
        PublicKey xdrPublicKey = keyPair.getXdrPublicKey();
        assertNotNull(xdrPublicKey);
    }

}