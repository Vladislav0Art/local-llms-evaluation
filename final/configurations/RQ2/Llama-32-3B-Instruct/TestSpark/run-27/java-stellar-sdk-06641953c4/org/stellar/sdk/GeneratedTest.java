package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void canSign_GivenKeyPair_ReturnsTrue() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeed_GivenSeed_ReturnsKeyPair() {
        char[] seed = "my_seed".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeed_GivenStringSeed_ReturnsKeyPair() {
        String seed = "my_seed";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromAccountId_GivenAccountId_ReturnsKeyPair() {
        String accountId = "my_account_id";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

    @Test
    public void fromPublicKey_GivenPublicKey_ReturnsKeyPair() {
        byte[] publicKey = new byte[32];
        Arrays.fill(publicKey, 0x00);
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
    }

    @Test
    public void getAccountId_GivenKeyPair_ReturnsAccountId() {
        String accountId = "my_account_id";
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(accountId));
        assertEquals(accountId, keyPair.getAccountId());
    }

    @Test
    public void getSecretSeed_GivenKeyPair_ReturnsSecretSeed() {
        char[] seed = "my_seed".toCharArray();
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(seed));
        assertArrayEquals(seed, keyPair.getSecretSeed());
    }

    @Test
    public void getPublicKey_GivenKeyPair_ReturnsPublicKey() {
        byte[] publicKey = new byte[32];
        Arrays.fill(publicKey, 0x00);
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(publicKey));
        assertArrayEquals(publicKey, keyPair.getPublicKey());
    }

    @Test
    public void getSignatureHint_GivenKeyPair_ReturnsSignatureHint() {
        SignatureHint signatureHint = new SignatureHint();
        KeyPair keyPair = new KeyPair(signatureHint);
        assertEquals(signatureHint, keyPair.getSignatureHint());
    }

    @Test
    public void getXdrPublicKey_GivenKeyPair_ReturnsXdrPublicKey() {
        PublicKey xdrPublicKey = new PublicKey();
        EdDSAPublicKey publicKey = new EdDSAPublicKey(xdrPublicKey);
        KeyPair keyPair = new KeyPair(publicKey);
        assertEquals(xdrPublicKey, keyPair.getXdrPublicKey());
    }

    @Test
    public void getXdrSignerKey_GivenKeyPair_ReturnsXdrSignerKey() {
        SignerKey xdrSignerKey = new SignerKey();
        EdDSAPrivateKey privateKey = new EdDSAPrivateKey(xdrSignerKey);
        KeyPair keyPair = new KeyPair(privateKey);
        assertEquals(xdrSignerKey, keyPair.getXdrSignerKey());
    }

    @Test
    public void sign_GivenData_ReturnsSignature() {
        byte[] data = "my_data".getBytes();
        byte[] signature = new byte[32];
        Arrays.fill(signature, 0x00);
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(signature));
        assertArrayEquals(data, keyPair.sign(data));
    }

    @Test
    public void signDecorated_GivenData_ReturnsDecoratedSignature() {
        byte[] data = "my_data".getBytes();
        DecoratedSignature decoratedSignature = new DecoratedSignature();
        KeyPair keyPair = new KeyPair(decoratedSignature);
        assertArrayEquals(data, keyPair.signDecorated(data));
    }

    @Test
    public void signPayloadDecorated_GivenSignerPayload_ReturnsDecoratedSignature() {
        byte[] signerPayload = "my_signer_payload".getBytes();
        DecoratedSignature decoratedSignature = new DecoratedSignature();
        KeyPair keyPair = new KeyPair(decoratedSignature);
        assertArrayEquals(signerPayload, keyPair.signPayloadDecorated(signerPayload));
    }

    @Test
    public void verify_GivenDataAndSignature_ReturnsTrue() {
        byte[] data = "my_data".getBytes();
        byte[] signature = new byte[32];
        Arrays.fill(signature, 0x00);
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(signature));
        assertTrue(keyPair.verify(data, signature));
    }

    @Test
    public void hashCode_ReturnsUniqueHashCode() {
        KeyPair keyPair1 = new KeyPair(new EdDSAPublicKey());
        KeyPair keyPair2 = new KeyPair(new EdDSAPublicKey());
        assertNotEquals(keyPair1.hashCode(), keyPair2.hashCode());
    }

    @Test
    public void equals_GivenSameKeyPair_ReturnsTrue() {
        KeyPair keyPair1 = new KeyPair(new EdDSAPublicKey());
        KeyPair keyPair2 = new KeyPair(new EdDSAPublicKey());
        assertTrue(keyPair1.equals(keyPair2));
    }

}