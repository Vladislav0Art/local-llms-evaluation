package org.stellar.sdk;

import com.google.common.base.Charsets;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromSecretSeedBytesTest {

    @Test
    public void fromSecretSeedBytesTest() {
        byte[] seed = "*".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
    }

}