package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.stellar.sdk.xdr.*;
import org.stellar.sdk.xdr.PublicKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void canSignWithPrivateKeyTest() {
        byte[] seed = new byte[32];
        Arrays.fill(seed, (byte) 1);
        EdDSAPrivateKeySpec privKeySpec = new EdDSAPrivateKeySpec(seed, KeyPair.ed25519);
        EdDSAPublicKeySpec publicKeySpec = new EdDSAPublicKeySpec(privKeySpec.getA().toByteArray(), KeyPair.ed25519);

        org.stellar.sdk.KeyPair keyPair = new org.stellar.sdk.KeyPair(new EdDSAPublicKey(publicKeySpec), new EdDSAPrivateKey(privKeySpec));
        Assert.assertTrue(keyPair.canSign());
    }

    @Test
    public void cannotSignWithoutPrivateKeyTest() {
        byte[] seed = new byte[32];
        Arrays.fill(seed, (byte) 1);
        EdDSAPublicKeySpec publicKeySpec = new EdDSAPublicKeySpec(seed, KeyPair.ed25519);

        org.stellar.sdk.KeyPair keyPair = new org.stellar.sdk.KeyPair(new EdDSAPublicKey(publicKeySpec));
        Assert.assertFalse(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] seed = new char[56];
        Arrays.fill(seed, 'S');

        Assert.assertNotNull(org.stellar.sdk.KeyPair.fromSecretSeed(seed));
    }

    @Test
    public void fromSecretSeedByteArrayTest() {
        byte[] seed = new byte[32];
        Arrays.fill(seed, (byte) 1);

        Assert.assertNotNull(org.stellar.sdk.KeyPair.fromSecretSeed(seed));
    }

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "SAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";

        Assert.assertNotNull(org.stellar.sdk.KeyPair.fromSecretSeed(seed));
    }

    @Test
    public void fromAccountIdTest() {
        String accountId = "GAEM3FVNEXYTRGYJBLMIWA6EZV7XLNZED2WGQBGYIDO2RBR7EF2PKH6H";

        Assert.assertNotNull(org.stellar.sdk.KeyPair.fromAccountId(accountId));
    }

    @Test
    public void fromAccountIdInvalidTest() {
        String accountId = "invalid";
        org.stellar.sdk.KeyPair.fromAccountId(accountId);
    }

    @Test
    public void equalsTest() throws GeneralSecurityException {
        byte[] seed = new byte[32];
        Arrays.fill(seed, (byte) 1);
        EdDSAPrivateKeySpec privKeySpec = new EdDSAPrivateKeySpec(seed, KeyPair.ed25519);
        EdDSAPublicKeySpec publicKeySpec = new EdDSAPublicKeySpec(privKeySpec.getA().toByteArray(), KeyPair.ed25519);

        org.stellar.sdk.KeyPair keyPair1 = new org.stellar.sdk.KeyPair(new EdDSAPublicKey(publicKeySpec), new EdDSAPrivateKey(privKeySpec));
        org.stellar.sdk.KeyPair keyPair2 = new org.stellar.sdk.KeyPair(new EdDSAPublicKey(publicKeySpec), new EdDSAPrivateKey(privKeySpec));

        Assert.assertEquals(keyPair1, keyPair2);
    }

    @Test
    public void hashCodeTest() throws GeneralSecurityException {
        byte[] seed = new byte[32];
        Arrays.fill(seed, (byte) 1);
        EdDSAPrivateKeySpec privKeySpec = new EdDSAPrivateKeySpec(seed, KeyPair.ed25519);
        EdDSAPublicKeySpec publicKeySpec = new EdDSAPublicKeySpec(privKeySpec.getA().toByteArray(), KeyPair.ed25519);

        org.stellar.sdk.KeyPair keyPair = new org.stellar.sdk.KeyPair(new EdDSAPublicKey(publicKeySpec), new EdDSAPrivateKey(privKeySpec));

        int expectedHashCode = Objects.hashCode(keyPair.mPrivateKey, keyPair.mPublicKey);
        Assert.assertEquals(expectedHashCode, keyPair.hashCode());
    }

}