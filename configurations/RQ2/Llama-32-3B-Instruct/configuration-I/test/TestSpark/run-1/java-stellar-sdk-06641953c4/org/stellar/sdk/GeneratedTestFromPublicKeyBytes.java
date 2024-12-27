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
public class GeneratedTestFromPublicKeyBytes {

    @Mock
    private EdDSAPublicKey publicKey;

    @Mock
    private byte[] seed;
    @Mock
    private String accountId;
    @Mock
    private byte[] publicKeyBip39;

    public KeyPairTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testFromPublicKeyBytes() {
        when(PublicKey.fromXdrBytes(publicKeyBip39)).thenReturn(publicKey);
        KeyPair keyPair = KeyPair.fromPublicKey(publicKeyBip39);
        assertNotNull(keyPair);
    }

}