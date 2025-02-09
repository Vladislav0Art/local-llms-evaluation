package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.KeyPairGenerator;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void fromSecretSeedTest() {
        char[] seed = {'s', 'e', 'e', 'd'};
        assertNotNull(KeyPair.fromSecretSeed(seed));
    }

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "seed";
        assertNotNull(KeyPair.fromSecretSeed(seed));
    }

    @Test
    public void fromSecretSeedBytesTest() {
        byte[] seed = {'s', 'e', 'e', 'd'};
        assertNotNull(KeyPair.fromSecretSeed(seed));
    }

    @Test
    public void fromAccountIdTest() {
        String accountId = "123456";
        assertNotNull(KeyPair.fromAccountId(accountId));
    }

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = KeyPair.fromAccountId("123456");
        String accountId = keyPair.getAccountId();
        assertEquals("123456", accountId);
    }

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] publicKey = keyPair.getPublicKey();
        assertNotNull(publicKey);
    }

    @Test
    public void signTest() {
        KeyPair keyPair = KeyPair.random();
        String data = "someData";
        byte[] signature = keyPair.sign(data.getBytes());
        assertTrue(keyPair.verify(data.getBytes(), signature));
    }

    @Test
    public void signPayloadDecoratedTest() {
        KeyPair keyPair = KeyPair.random();
        String data = "someData";
        DecoratedSignature signature = keyPair.signPayloadDecorated(data.getBytes());
        assertNotNull(signature);
    }

    @Test
    public void verifyTest() {
        KeyPair keyPair = KeyPair.random();
        String data = "someData";
        byte[] signature = keyPair.sign(data.getBytes());
        assertTrue(keyPair.verify(data.getBytes(), signature));
    }

    @Test
    public void hashCodeTest() {
        KeyPair keyPair = KeyPair.random();
        KeyPair sameKeyPair = keyPair;
        assertTrue(keyPair.hashCode() == sameKeyPair.hashCode());
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair = KeyPair.random();
        KeyPair sameKeyPair = keyPair;
        assertTrue(keyPair.equals(sameKeyPair));
    }

    @Test
    public void fromXdrPublicKeyInvalidTest() {
        KeyPair.fromXdrPublicKey(new PublicKey());
    }

    @Test
    public void fromXdrSignerKeyInvalidTest() {
        KeyPair.fromXdrSignerKey(new SignerKey());
    }

    @Test
    public void signDecoratedTest() {
        KeyPair pair = KeyPair.random();
        String data = "someData";
        DecoratedSignature signature = pair.signDecorated(data.getBytes());
        assertNotNull(signature);
        assertTrue(pair.verify(data.getBytes(), signature.getSignature().getSignature()));
    }

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair pair = KeyPair.random();
        PublicKey publicKey = pair.getXdrPublicKey();
        assertNotNull(publicKey);
    }

    @Test
    public void getXdrSignerKeyTest() {
        KeyPair pair = KeyPair.random();
        SignerKey signerKey = pair.getXdrSignerKey();
        assertNotNull(signerKey);
    }

    @Test
    public void getSignatureHintTest() {
        KeyPair pair = KeyPair.random();
        assertNotNull(pair.getSignatureHint());
    }

    @Test
    public void canSignTest() {
        KeyPair pair = KeyPair.random();
        assertTrue(pair.canSign());
    }

}