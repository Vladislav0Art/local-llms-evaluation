package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedFromXdrPublicKeyTest {

    @Test
    public void fromXdrPublicKeyTest() {
        PublicKey key = new PublicKey();
        KeyPair keyPair = KeyPair.fromXdrPublicKey(key);
        assertNotNull(keyPair);
    }

}