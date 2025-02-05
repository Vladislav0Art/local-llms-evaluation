package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromSecretSeedStringTest {

    @Mock
    private EdDSAPublicKey edDSAPublicKey;

    // Testing KeyPair(EdDSAPublicKey publicKey)

    @Test
    public void fromSecretSeedStringTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("SBWELPMMYS7KIUJTSEC6KOMTAZU5ITRZZVKXHZM5YMJWE5QHXNLPXT7Q");
        assertNotNull(keyPair);
    }

}