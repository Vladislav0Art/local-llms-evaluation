package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.*;
import org.stellar.sdk.xdr.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void canSignTest() {
        KeyPair pair = KeyPair.random();
        assertTrue(pair.canSign());
    }

    @Test
    public void randomTest() {
        KeyPair kp = KeyPair.random();
        assertNotNull(kp);
    }

    @Test
    public void getAccountIdTest() {
        KeyPair pair = KeyPair.random();
        assertNotNull(pair.getAccountId());
    }

    @Test
    public void getSecretSeedTest() {
        KeyPair pair = KeyPair.random();
        assertNotNull(pair.getSecretSeed());
    }

    @Test
    public void getPublicKeyTest() {
        KeyPair pair = KeyPair.random();
        assertNotNull(pair.getPublicKey());
    }

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair pair = KeyPair.random();
        PublicKey key = pair.getXdrPublicKey();
        assertNotNull(key);
    }

    @Test
    public void getXdrSignerKeyTest() {
        KeyPair pair = KeyPair.random();
        SignerKey key = pair.getXdrSignerKey();
        assertNotNull(key);
    }

    @Test
    public void signTest() {
        KeyPair pair = KeyPair.random();
        String data = "hello world";
        byte[] bytes = pair.sign(data.getBytes());
        assertNotNull(bytes);
        assertTrue(bytes.length > 0);
    }

    @Test
    public void verifyTest() {
        KeyPair pair = KeyPair.random();
        String data = "hello world";
        byte[] bytes = pair.sign(data.getBytes());
        assertTrue(pair.verify(data.getBytes(), bytes));
    }

    @Test
    public void equalsTest() {
        KeyPair pair1 = KeyPair.random();
        KeyPair pair2 = KeyPair.fromSecretSeed(pair1.getSecretSeed());

        assertTrue(pair1.equals(pair2));
    }

    @Test
    public void hashCodeTest() {
        KeyPair pair = KeyPair.random();
        KeyPair exactlySamePair = KeyPair.fromSecretSeed(pair.getSecretSeed());
        assertEquals(pair.hashCode(), exactlySamePair.hashCode());
    }

    @Test
    public void signPayloadDecoratedTest() {
        KeyPair pair = KeyPair.random();
        byte[] payload = "stellar sdk".getBytes();
        DecoratedSignature decoratedSignature = pair.signPayloadDecorated(payload);
        assertNotNull(decoratedSignature);
        assertTrue(pair.verify(decoratedSignature.getSignature().getSignature()));
    }

}