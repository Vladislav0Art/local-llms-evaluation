package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.stellar.sdk.xdr.DecoratedSignature;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        KeyPair pair = KeyPair.random();
        int expected = Objects.hashCode(pair.mPrivateKey, pair.mPublicKey);
        assertEquals(expected, pair.hashCode());
    }

}