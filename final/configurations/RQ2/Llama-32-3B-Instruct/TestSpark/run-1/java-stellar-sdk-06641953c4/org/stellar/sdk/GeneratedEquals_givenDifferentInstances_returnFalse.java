package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.stellar.sdk.PublicKey;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedEquals_givenDifferentInstances_returnFalse {

    @Test
    public void equals_givenDifferentInstances_returnFalse() {
        KeyPair keyPair1 = new KeyPair(EdDSAPublicKey.fromBytes(new byte[]{1, 2, 3}));
        KeyPair keyPair2 = new KeyPair(EdDSAPublicKey.fromBytes(new byte[]{4, 5, 6}));
        assertFalse(keyPair1.equals(keyPair2));
    }

}