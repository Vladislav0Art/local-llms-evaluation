package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void KeyPairConstructorTest() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
    }

    @Test
    public void canSignTest() {
        KeyPair keyPair = KeyPair.random();
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedCharTest() {
        char[] seed = "SDMDOMLNTWYT3JZPDLXTQL4UNRNKHS4J5DTSEXNBK3YXI3RGQBBNMIBQ".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "SDMDOMLNTWYT3JZPDLXTQL4UNRNKHS4J5DTSEXNBK3YXI3RGQBBNMIBQ";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromAccountIdTest() {
        String accountId = "GCUKMGTHGLBYHOBMCCIYPBUOYDTGJPW2PJUJRLKPWCGVO6HNEHIFGGYF";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertEquals(accountId, keyPair.getAccountId());
    }

    @Test
    public void fromPublicKeyTest() {
        byte[] publicKey = new byte[32];
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertArrayEquals(publicKey, keyPair.getPublicKey());
    }

    @Test
    public void randomTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        assertNotEquals(keyPair1, keyPair2);
    }

    @Test
    public void getAccountIdTest() {
        String seed = "SDMDOMLNTWYT3JZPDLXTQL4UNRNKHS4J5DTSEXNBK3YXI3RGQBBNMIBQ";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertEquals("GCUKMGTHGLBYHOBMCCIYPBUOYDTGJPW2PJUJRLKPWCGVO6HNEHIFGGYF", keyPair.getAccountId());
    }

    @Test
    public void getSignatureHintTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getSignatureHint());
    }

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getXdrPublicKey());
    }

    @Test
    public void getXdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getXdrSignerKey());
    }

    @Test
    public void fromXdrPublicKeyTest() {
        PublicKey publicKey = new PublicKey();
        assertNotNull(KeyPair.fromXdrPublicKey(publicKey));
    }

    @Test
    public void fromXdrSignerKeyTest() {
        SignerKey signerKey = new SignerKey();
        assertNotNull(KeyPair.fromXdrSignerKey(signerKey));
    }

    @Test
    public void signTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = new byte[32];
        assertNotNull(keyPair.sign(data));
    }

    @Test
    public void signDecoratedTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = new byte[32];
        assertNotNull(keyPair.signDecorated(data));
    }

    @Test
    public void verifyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = new byte[32];
        byte[] signature = keyPair.sign(data);
        assertTrue(keyPair.verify(data, signature));
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        assertNotEquals(keyPair1, keyPair2);
    }

}