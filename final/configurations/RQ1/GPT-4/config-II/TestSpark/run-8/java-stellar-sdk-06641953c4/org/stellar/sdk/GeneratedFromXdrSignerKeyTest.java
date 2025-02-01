package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedFromXdrSignerKeyTest {

    @Test
    public void fromXdrSignerKeyTest() {
        SignerKey key = new SignerKey();
        KeyPair keyPair = KeyPair.fromXdrSignerKey(key);
        assertNotNull(keyPair);
    }

}