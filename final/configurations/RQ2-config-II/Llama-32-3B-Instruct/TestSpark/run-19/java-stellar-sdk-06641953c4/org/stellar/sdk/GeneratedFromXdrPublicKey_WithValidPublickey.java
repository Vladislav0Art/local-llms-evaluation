package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromXdrPublicKey_WithValidPublickey {

    @Test
    public void fromXdrPublicKey_WithValidPublickey() {
        PublicKey key = new PublicKey(0x10, 0x20);
        KeyPair keyPair = KeyPair.fromXdrPublicKey(key);
        assertNotNull(keyPair.getPublicKey());
    }

}