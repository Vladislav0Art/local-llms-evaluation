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
public class GeneratedFromPublicKey_Byte_ReturnsKeyPair {

    @Test
    public void fromPublicKey_Byte_ReturnsKeyPair() {
        byte[] publicKey = new byte[]{1, 2, 3};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
    }

}