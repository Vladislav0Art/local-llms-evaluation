package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.stellar.sdk.PublicKey;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void constructor_givenEdDsapublicKey_returnSameInstance() {
        EdDSAPublicKey publicKey = EdDSAPublicKey.fromBytes(new byte[]{1, 2, 3});
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
        assertTrue(keyPair.equals(keyPair));
    }

    @Test
    public void canSign_givenEdDsapublicKey_returnTrue() {
        EdDSAPublicKey publicKey = EdDSAPublicKey.fromBytes(new byte[]{1, 2, 3});
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeed_givenCharArray_returnSameInstance() {
        char[] seed = "1234".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
        assertTrue(keyPair.equals(keyPair));
    }

    @Test
    public void fromSecretSeed_givenString_returnSameInstance() {
        String seed = "1234";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
        assertTrue(keyPair.equals(keyPair));
    }

    @Test
    public void fromSecretSeed_givenByteArray_returnSameInstance() {
        byte[] seed = "1234".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
        assertTrue(keyPair.equals(keyPair));
    }

    @Test
    public void fromAccountId_givenString_returnKeyPair() throws GeneralSecurityException {
        String accountId = "abc123";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
        assertFalse(keyPair.equals(null));
    }

    @Test
    public void fromPublicKey_givenByteArray_returnKeyPair() {
        byte[] publicKey = new byte[]{1, 2, 3};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
        assertFalse(keyPair.equals(null));
    }

    @Test
    public void getAccountId_givenKeyPair_returnAccountId() {
        String accountId = "abc123";
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromBytes(new byte[]{1, 2, 3}));
        assertEquals(accountId, keyPair.getAccountId());
    }

    @Test
    public void getSecretSeed_givenKeyPair_returnSecretSeed() {
        char[] seed = "1234".toCharArray();
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromBytes(new byte[]{1, 2, 3}));
        assertEquals(seed, keyPair.getSecretSeed());
    }

    @Test
    public void getPublicKey_givenKeyPair_returnPublicKey() {
        byte[] publicKey = new byte[]{1, 2, 3};
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromBytes(publicKey));
        assertEquals(publicKey, keyPair.getPublicKey());
    }

    @Test
    public void hashCode_givenKeyPair_returnValidHashCode() {
        int expectedHashCode = 12345;
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromBytes(new byte[]{1, 2, 3}));
        assertEquals(expectedHashCode, keyPair.hashCode());
    }

    @Test
    public void equals_givenKeyPair_returnTrueWhenSameInstance() {
        KeyPair keyPair1 = new KeyPair(EdDSAPublicKey.fromBytes(new byte[]{1, 2, 3}));
        KeyPair keyPair2 = new KeyPair(EdDSAPublicKey.fromBytes(new byte[]{1, 2, 3}));
        assertTrue(keyPair1.equals(keyPair2));
    }

    @Test
    public void equals_givenDifferentInstances_returnFalse() {
        KeyPair keyPair1 = new KeyPair(EdDSAPublicKey.fromBytes(new byte[]{1, 2, 3}));
        KeyPair keyPair2 = new KeyPair(EdDSAPublicKey.fromBytes(new byte[]{4, 5, 6}));
        assertFalse(keyPair1.equals(keyPair2));
    }

}