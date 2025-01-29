package org.stellar.sdk;

import com.google.common.base.Preconditions;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void testFromSecretSeed() {
        char[] secretSeed = "secret seed".toCharArray();
        Preconditions.checkArgument(KeyPair.fromSecretSeed(secretSeed) != null, "Expected non-null key pair");
    }

    @Test
    public void testRandom() {
        KeyPair keyPair = KeyPair.random();
        Preconditions.checkArgument(keyPair.getAccountId() != null, "Expected non-null account id");
    }

    @Test
    public void testFromAccountId() {
        String accountId = "account id";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        Preconditions.checkArgument(keyPair.getAccountId() != null, "Expected non-null account id");
    }

    @Test
    public void testFromBip39Seed() {
        byte[] bip39Seed = "bip39 seed".getBytes();
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed);
        Preconditions.checkArgument(keyPair.getPublicKey() != null, "Expected non-null public key");
    }

    @Test
    public void testRandomAccountId() {
        String accountId = KEYPAIRS[random()].getAccountId();
        Preconditions.checkArgument(accountId != null, "Expected non-null account id");
    }

    @Test
    public void testFromSecretSeedAndAccountNumber() {
        char[] secretSeed = SECRET_SEED.toCharArray();
        byte[] accountNumber = ACCOUNT_NUMBER;
        KeyPair keyPair = KeyPair.fromSecretSeedAndAccountNumber(secretSeed, accountNumber);
        Preconditions.checkArgument(keyPair.getPublicKey() != null, "Expected non-null public key");
    }

    @Test
    public void testFromXdrPublicKey() {
        PublicKey publicKey = KeyPair.fromXdrPublicKey(PublicKey.fromXdrBytes("public key bytes"));
        Preconditions.checkArgument(publicKey instanceof EdDSAPublicKey, "Expected instance of EdDSAPublicKey");
    }

    @Test
    public void testFromXdrSignerKey() {
        SignerKey signerKey = KeyPair.fromXdrSignerKey(SignerKey.fromXdrBytes("signer key bytes"));
        Preconditions.checkArgument(signerKey instanceof EdDSASignerKey, "Expected instance of EdDSASignerKey");
    }

    @Test
    public void testSign() {
        String data = "some data";
        byte[] signature = KeyPair.sign(data);
        Preconditions.checkArgument(signature != null, "Expected non-null signature");
    }

    @Test
    public void testSignDecorated() {
        String signerPayload = "signer payload";
        byte[] signerPayloadBytes = signerPayload.getBytes();
        DecoratedSignature signature = KeyPair.signDecorated(signerPayloadBytes);
        Preconditions.checkArgument(signature != null, "Expected non-null signature");
    }

    @Test
    public void testVerify() {
        String data = "some data";
        byte[] signature = "signature bytes";
        boolean verify = KeyPair.verify(data, signature);
        Preconditions.checkArgument(verify, "Expected true or false for verification");
    }

}