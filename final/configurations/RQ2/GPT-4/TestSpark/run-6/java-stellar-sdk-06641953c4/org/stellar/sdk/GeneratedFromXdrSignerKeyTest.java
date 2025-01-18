package org.stellar.sdk;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedFromXdrSignerKeyTest {

    @Test
    public void fromXdrSignerKeyTest() {
        SignerKey signerKey = new SignerKey();
        signerKey.setDiscriminant(SignerKeyType.SIGNER_KEY_TYPE_ED25519);
        assertNotNull(KeyPair.fromXdrSignerKey(signerKey));
    }

}