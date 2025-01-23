package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignatureHint;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.SignerKeyType;
import org.stellar.sdk.xdr.Uint256;
import org.stellar.sdk.xdr.XdrDataOutputStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = new KeyPair(null);
        assertFalse(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("secret");
        assertEquals("accountId", keyPair.getAccountId());
    }

    @Test
    public void fromAccountIdTest() {
        KeyPair keyPair = KeyPair.fromAccountId("accountId");
        assertEquals("accountId", keyPair.getAccountId());
    }

    @Test
    public void fromPublicKeyTest() {
        KeyPair keyPair = KeyPair.fromPublicKey(new byte[0]);
        assertEquals("accountId", keyPair.getAccountId());
    }

}