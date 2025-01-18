package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.Uint256;
import org.stellar.sdk.xdr.SignatureHint;

import java.nio.ByteBuffer;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void keyPairConstructorTest() {
        byte[] pubByteArray = new byte[32];
        EdDSAPublicKeySpec spec = new EdDSAPublicKeySpec(pubByteArray, null);
        EdDSAPublicKey publicKey = new EdDSAPublicKey(spec);
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
        char[] seed = "SCTUOEY3DPE3IOSNJUQCRI2L66UB2CEXGZ7PGALA53B34JDPOISEMB6V".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "SCTUOEY3DPE3IOSNJUQCRI2L66UB2CEXGZ7PGALA53B34JDPOISEMB6V";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedByteTest() {
        byte[] seed = new byte[32];
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromAccountIdTest() {
        String accountId = "GBR5H2YJELAH2MZDPKRLPOIJJMM7UE5RD7HZWKE7XFCZDOUIZJX5HR2C";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

    @Test
    public void fromPublicKeyTest() {
        byte[] publicKey = new byte[32];
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
    }

    @Test
    public void randomTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = KeyPair.random();
        String accountId = keyPair.getAccountId();
        assertNotNull(accountId);
    }

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = KeyPair.random();
        char[] seed = keyPair.getSecretSeed();
        assertNotNull(seed);
    }

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] publicKey = keyPair.getPublicKey();
        assertNotNull(publicKey);
    }

    @Test
    public void getSignatureHintTest() {
        KeyPair keyPair = KeyPair.random();
        SignatureHint signatureHint = keyPair.getSignatureHint();
        assertNotNull(signatureHint);
    }

    @Test
    public void fromXdrPublicKeyTest() {
        PublicKey key = new PublicKey();
        key.setDiscriminant(PublicKeyType.PUBLIC_KEY_TYPE_ED25519);
        Uint256 uint256 = new Uint256();
        uint256.setUint256(ByteBuffer.allocate(32).array());
        key.setEd25519(uint256);
        KeyPair keyPair = KeyPair.fromXdrPublicKey(key);
        assertNotNull(keyPair);
    }

    @Test
    public void signTest() {
        byte[] data = "Test data".getBytes();
        KeyPair keyPair = KeyPair.random();
        byte[] signature = keyPair.sign(data);
        assertNotNull(signature);
    }

    @Test
    public void verifyTest() {
        byte[] data = "Test data".getBytes();
        KeyPair keyPair = KeyPair.random();
        byte[] signature = keyPair.sign(data);
        boolean verification = keyPair.verify(data, signature);
        assertTrue(verification);
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.fromSecretSeed(keyPair1.getSecretSeed());
        assertEquals(keyPair1, keyPair2);
    }

    @Test
    public void hashCodeTest() {
        KeyPair keyPair = KeyPair.random();
        int hashCode = keyPair.hashCode();
        assertNotNull(hashCode);
    }

}