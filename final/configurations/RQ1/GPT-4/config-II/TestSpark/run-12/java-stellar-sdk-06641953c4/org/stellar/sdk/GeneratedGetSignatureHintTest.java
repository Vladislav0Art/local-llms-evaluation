package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import net.i2p.crypto.eddsa.*;
import org.stellar.sdk.xdr.*;
import com.google.common.io.BaseEncoding;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetSignatureHintTest {

    @Test
    public void getSignatureHintTest() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class, Mockito.RETURNS_DEEP_STUBS);
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair.getSignatureHint());
    }

}