package org.stellar.sdk;

import com.google.common.baseObjects.ObjectOf;
import org.junit.Test;

import static org.junit.Assert.*;

import java.security.KeyPair;

public class GeneratedTestGetXdrSignerKey {

    @Test
    public void testGetXdrSignerKey() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey().generateBip39Seed("seed1"));
        SignerKey signerKey = keyPair.getXdrSignerKey();
        assertNotNull(signerKey);
        assertEquals(SignerKey.class, signerKey.getClass());
    }

}