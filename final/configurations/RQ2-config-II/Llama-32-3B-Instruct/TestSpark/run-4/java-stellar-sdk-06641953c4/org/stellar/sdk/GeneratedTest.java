package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void constructor_CanCreateKeyPairWithPublic() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeed_Chars() {
        char[] seed = "chars".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
        assertEquals(16, keyPair.getSecretSeed().length);
    }

    @Test
    public void fromSecretSeed_String() {
        String seed = "string";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
        assertEquals(16, ((char[]) keyPair.getSecretSeed()).length);
    }

    @Test
    public void fromSecretSeed_Bytes() {
        byte[] seed = "bytes".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
        assertEquals(16, ((byte[]) keyPair.getSecretSeed()).length);
    }

    @Test
    public void fromAccountId_CanCreateKeyPairWithAccountId() {
        String accountId = "accountId";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromPublicKey_CanCreateKeyPairWithPublic() {
        byte[] publicKey = new byte[32];
        Arrays.fill(publicKey, (byte) 0x00);
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromBip39Seed_CanCreateKeyPairWithBip39() {
        byte[] bip39Seed = "bip39".getBytes();
        int accountNumber = 0;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void random_CanCreateRandomKeyPair() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void getAccountId_StringReturnSame() {
        String accountId = "accountId";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertEquals(accountId, keyPair.getAccountId());
    }

    @Test
    public void getSecretSeed_CharsReturnSameLength() {
        char[] seed = "chars".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertEquals(16, keyPair.getSecretSeed().length);
    }

    @Test
    public void getPublicKey

    BytesReturnSameLength() {
        byte[] publicKey = new byte[32];
        Arrays.fill(publicKey, (byte) 0x00);
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertEquals(32, keyPair.getPublicKey().length);
    }

    @Test
    public void getSignatureHint_CanGetHint() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertNotNull(keyPair.getSignatureHint());
        assertTrue(keyPair.getSignatureHint().isValid());
    }

    @Test
    public void sign_CanSignData() throws GeneralSecurityException, IOException {
        byte[] data = "data".getBytes();
        byte[] signature = new byte[64];
        Signature.sign(data, signature);
        KeyPair keyPair = KeyPair.fromSecretSeed(signature);
        assertTrue(keyPair.verify(data, signature));
    }

    @Test
    public void signDecorated_CanSignData() throws GeneralSecurityException, IOException {
        byte[] data = "data".getBytes();
        byte[] signature = new byte[64];
        Signature.sign(data, signature);
        KeyPair keyPair = KeyPair.fromSecretSeed(signature);
        DecoratedSignature decoratedSignature = new DecoratedSignature(keyPair.getSignatureHint(), Arrays.copyOf(signature, 64));
        assertTrue(decoratedSignature.verify(data, signature));
    }

    @Test
    public void verify_CanVerifyData() throws GeneralSecurityException, IOException {
        byte[] data = "data".getBytes();
        byte[] signature = new byte[64];
        Signature.sign(data, signature);
        KeyPair keyPair = KeyPair.fromSecretSeed(signature);
        assertTrue(keyPair.verify(data, signature));
    }

    @Test
    public void equals_EqualsSameObject() {
        KeyPair keyPair1 = new KeyPair(new EdDSAPublicKey());
        KeyPair keyPair2 = new KeyPair(new EdDSAPublicKey());
        assertEquals(keyPair1, keyPair2);
    }

    @Test
    public void hashCode_HashCodeSameObject() {
        KeyPair keyPair1 = new KeyPair(new EdDSAPublicKey());
        KeyPair keyPair2 = new KeyPair(new EdDSAPublicKey());
        assertTrue(keyPair1.hashCode() == keyPair2.hashCode());
    }

}