package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertFalse(keyPair.canSign());
    }

    @Test
    public void accountIdTest() {
        KeyPair keyPair = KeyPair.fromAccountId("accountId");
        assertEquals(keyPair.getAccountId(), "accountId");
    }

    @Test
    public void publicKeyTest() {
        KeyPair keyPair = KeyPair.fromPublicKey(new byte[]{0, 1, 2, 3});
        assertArrayEquals(keyPair.getPublicKey(), new byte[]{0, 1, 2, 3});
    }

    @Test
    public void signatureHintTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("secretSeed");
        assertEquals(keyPair.getSignatureHint(), SignatureHint.fromBytes(new byte[]{0, 1, 2, 3}));
    }

    @Test
    public void xdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("secretSeed");
        assertEquals(keyPair.getXdrPublicKey(), PublicKey.fromBytes(new byte[]{0, 1, 2, 3}));
    }

    @Test
    public void xdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("secretSeed");
        assertEquals(keyPair.getXdrSignerKey(), SignerKey.fromBytes(new byte[]{0, 1, 2, 3}));
    }

}