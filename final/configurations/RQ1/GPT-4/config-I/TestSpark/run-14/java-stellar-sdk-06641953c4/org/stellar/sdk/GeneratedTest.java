package org.stellar.sdk;

import net.i2p.crypto.eddsa.*;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.spec.*;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedTest {

    private static final EdDSANamedCurveSpec ed25519 = EdDSANamedCurveTable.getByName(EdDSANamedCurveTable.ED_25519);

    @Test
    public void canSignPrivateKeyNotNullTest() {
        KeyPair keyPair = KeyPair.random();
        assertTrue(keyPair.canSign());
    }

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getAccountId());
    }

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getPublicKey());
    }

    @Test
    public void getSignatureHintTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getSignatureHint());
    }

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        PublicKey xdrPublicKey = keyPair.getXdrPublicKey();
        assertNotNull(xdrPublicKey);
        assertNotNull(xdrPublicKey.getDiscriminant());
        assertNotNull(xdrPublicKey.getEd25519());
    }

    @Test
    public void getXdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.random();
        SignerKey xdrSignerKey = keyPair.getXdrSignerKey();
        assertNotNull(xdrSignerKey);
        assertNotNull(xdrSignerKey.getDiscriminant());
        assertNotNull(xdrSignerKey.getEd25519());
    }

    @Test
    public void signPrivateKeyIsNullTest() {
        KeyPair keyPair = KeyPair.fromPublicKey(KeyPair.random().getPublicKey());
        keyPair.sign(new byte[32]);
    }

    @Test
    public void signPrivateKeyIsNotNullTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = new byte[32];
        assertNotNull(keyPair.sign(data));
    }

    @Test
    public void signDecoratedPrivateKeyNotNullTest() {
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
        assertEquals(keyPair1, keyPair1);
        assertNotEquals(keyPair1, keyPair2);
        assertNotEquals(keyPair1, null);
    }

}