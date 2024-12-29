package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.stellar.sdk.PublicKey;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedEquals_givenKeyPair_returnTrueWhenSameInstance {

    @Test
    public void equals_givenKeyPair_returnTrueWhenSameInstance() {
        KeyPair keyPair1 = new KeyPair(EdDSAPublicKey.fromBytes(new byte[]{1, 2, 3}));
        KeyPair keyPair2 = new KeyPair(EdDSAPublicKey.fromBytes(new byte[]{1, 2, 3}));
        assertTrue(keyPair1.equals(keyPair2));
    }

}