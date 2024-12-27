package org.stellar.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.stellar.sdk.EdDSAPublicKey;
import org.stellar.sdk.KeyPair;
import org.stellar.sdk.PublicKey;
import org.stellar.sdk.SignerKey;
import org.stellar.sdk.SignatureHint;
import org.stellar.sdk.SignatureVerificationException;
import org.stellar.sdk.DecoratedSignature;
import org.stellar.sdk.PublicKeyUtils;

public class GeneratedTestGetPublicXdr {

    @Test
    public void testGetPublicXdr() {
        KeyPair keyPair = new KeyPair();
        PublicKey publicKey = keyPair.getPublicKey();
        assertNotNull(publicKey);
    }

}