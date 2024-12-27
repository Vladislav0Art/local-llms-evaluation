package org.stellar.sdk;

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

@RunWith(org.junit4.SpringJUnit4ClassRunner.class)
public class GeneratedTestGetXdrSignerKey {

    public static class TestSpark {
        public static void main(String[] args) {
            org.junit.runner.JUnitCore.main("org.stellar.sdk.GeneratedTest");
        }
    }

}

public class KeyPairTest {

    private EdDSAPublicKey publicKey;

    @Mock
    private byte[] seed;
    @Mock
    private String accountId;
    @Mock
    private byte[] publicKeyBip39;

    public void setup() {
        MockitoAnnotations.initMocks(this);
        this.publicKey = new EdDSAPublicKey();
    }

    @Test
    public void testGetXdrSignerKey() {
        when(publicKey.toBytes()).thenReturn(seed);
        SignerKey signerKey = publicKey.getSignerKey();
        assertNotNull(signerKey);
    }

}