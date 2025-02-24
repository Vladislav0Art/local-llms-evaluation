package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void canSignTest_true() {
        KeyPair keyPair = new KeyPair(null);
        assertEquals(true, keyPair.canSign());
    }

    @Test
    public void canSignTest_false() {
        KeyPair keyPair = new KeyPair(null);
        assertEquals(false, keyPair.canSign());
    }

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = new KeyPair(null);
        assertEquals("expectedAccountId", keyPair.getAccountId());
    }

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = new KeyPair(null);
        assertEquals("expectedSeed", String.valueOf(keyPair.getSecretSeed()));
    }

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = new KeyPair(null);
        assertEquals(new byte[]{1, 2, 3}, keyPair.getPublicKey());
    }

    @Test
    public void getSignatureHintTest() {
        KeyPair keyPair = new KeyPair(null);
        assertEquals(new SignatureHint(), keyPair.getSignatureHint());
    }

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair keyPair = new KeyPair(null);
        assertEquals(new PublicKey(), keyPair.getXdrPublicKey());
    }

    @Test
    public void getXdrSignerKeyTest() {
        KeyPair keyPair = new KeyPair(null);
        assertEquals(new SignerKey(), keyPair.getXdrSignerKey());
    }

}