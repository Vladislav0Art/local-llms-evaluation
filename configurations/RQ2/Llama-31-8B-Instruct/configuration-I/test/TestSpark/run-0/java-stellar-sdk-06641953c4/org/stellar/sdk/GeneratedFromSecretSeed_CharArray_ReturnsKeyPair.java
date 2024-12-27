package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.stellar.sdk.Keypair;
import org.stellar.sdk.XdrPublicKey;
import org.stellar.sdk.XdrSignerKey;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.stellar.sdk.KeyPair;
import org.stellar.sdk.EdDSAPublicKey;
import org.stellar.sdk.SignatureHint;
import org.stellar.sdk.SignerKey;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromSecretSeed_CharArray_ReturnsKeyPair {

    @Test
    public void fromSecretSeed_CharArray_ReturnsKeyPair() {
        char[] seed = new char[]{'a', 'b', 'c'};
        Keypair keyPair = Keypair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}