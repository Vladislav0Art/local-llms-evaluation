package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.stellar.sdk.KeyPair;
import org.stellar.sdk.EdDSAPublicKey;
import org.stellar.sdk.SignatureHint;
import org.stellar.sdk.SignerKey;
import org.stellar.sdk.XdrPublicKey;
import org.stellar.sdk.XdrSignerKey;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCanSign_ReturnsTrue_WhenKeyPairIsGenerated {

    @Test
    public void canSign_ReturnsTrue_WhenKeyPairIsGenerated() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey("publicKey"));
        assertTrue(keyPair.canSign());
    }

}