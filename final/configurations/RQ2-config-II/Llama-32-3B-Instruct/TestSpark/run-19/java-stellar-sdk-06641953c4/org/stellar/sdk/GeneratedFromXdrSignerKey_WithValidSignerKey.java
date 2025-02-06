package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromXdrSignerKey_WithValidSignerKey {

    @Test
    public void fromXdrSignerKey_WithValidSignerKey() {
        SignerKey key = new SignerKey(0x30, 0x40);
        KeyPair keyPair = KeyPair.fromXdrSignerKey(key);
        assertNotNull(keyPair.getPublicKey());
    }

}