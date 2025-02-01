package org.stellar.sdk;

import net.i2p.crypto.eddsa.*;
import net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.Uint256;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();

        assertFalse(keyPair1.equals(keyPair2));
        assertTrue(keyPair1.equals(keyPair1));
        assertFalse(keyPair1.equals(null));
    }

    private EdDSAPublicKey generatePublicKey() {
        return new EdDSAPublicKey(new EdDSAPublicKeySpec("publicKey".getBytes(), ed25519));
    }

    private EdDSAPrivateKey generatePrivateKey() {
        return new EdDSAPrivateKey(new EdDSAPrivateKeySpec("privateKey".getBytes(), ed25519));
    }

}