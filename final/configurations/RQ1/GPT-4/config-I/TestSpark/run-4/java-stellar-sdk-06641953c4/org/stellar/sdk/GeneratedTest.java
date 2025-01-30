package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.EdDSAPublicKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;

public class GeneratedTest {

    private static final EdDSANamedCurveSpec ed25519 = EdDSANamedCurveTable.getByName("SHA-512");

    @Test
    public void KeyPairPublicKeyOnlyTest() {
        EdDSAPublicKeySpec pubKeySpec = new EdDSAPublicKeySpec(new byte[32], ed25519);
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(pubKeySpec), null);
        assertNotNull(keyPair);
        assertFalse(keyPair.canSign());
    }

    @Test
    public void KeyPairPublicKeyPrivateKeyTest() {
        EdDSAPublicKeySpec pubKeySpec = new EdDSAPublicKeySpec(new byte[32], ed25519);
        EdDSAPrivateKeySpec privKeySpec = new EdDSAPrivateKeySpec(new byte[32], ed25519);
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(pubKeySpec), new EdDSAPrivateKey(privKeySpec));
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void signWithNullPrivateKeyTest() {
        EdDSAPublicKeySpec pubKeySpec = new EdDSAPublicKeySpec(new byte[32], ed25519);
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(pubKeySpec), null);
        keyPair.sign(new byte[32]);
    }

    @Test
    public void signWithPrivateKeyTest() {
        EdDSAPublicKeySpec pubKeySpec = new EdDSAPublicKeySpec(new byte[32], ed25519);
        EdDSAPrivateKeySpec privKeySpec = new EdDSAPrivateKeySpec(new byte[32], ed25519);
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(pubKeySpec), new EdDSAPrivateKey(privKeySpec));
        byte[] signature = keyPair.sign(new byte[32]);
        assertNotNull(signature);
    }

    @Test
    public void signDecoratedTest() {
        EdDSAPublicKeySpec pubKeySpec = new EdDSAPublicKeySpec(new byte[32], ed25519);
        EdDSAPrivateKeySpec privKeySpec = new EdDSAPrivateKeySpec(new byte[32], ed25519);
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(pubKeySpec), new EdDSAPrivateKey(privKeySpec));
        DecoratedSignature decoratedSignature = keyPair.signDecorated(new byte[32]);
        assertNotNull(decoratedSignature);
    }

    @Test
    public void signPayloadDecoratedTest() {
        EdDSAPublicKeySpec pubKeySpec = new EdDSAPublicKeySpec(new byte[32], ed25519);
        EdDSAPrivateKeySpec privKeySpec = new EdDSAPrivateKeySpec(new byte[32], ed25519);
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(pubKeySpec), new EdDSAPrivateKey(privKeySpec));
        DecoratedSignature decoratedSignature = keyPair.signPayloadDecorated(new byte[32]);
        assertNotNull(decoratedSignature);
    }

    @Test
    public void verifyTest() {
        EdDSAPublicKeySpec pubKeySpec = new EdDSAPublicKeySpec(new byte[32], ed25519);
        EdDSAPrivateKeySpec privKeySpec = new EdDSAPrivateKeySpec(new byte[32], ed25519);
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(pubKeySpec), new EdDSAPrivateKey(privKeySpec));
        byte[] data = new byte[32];
        byte[] signature = keyPair.sign(data);
        assertTrue(keyPair.verify(data, signature));
    }

    @Test
    public void equalsTest() {
        EdDSAPublicKeySpec pubKeySpec = new EdDSAPublicKeySpec(new byte[32], ed25519);
        EdDSAPrivateKeySpec privKeySpec = new EdDSAPrivateKeySpec(new byte[32], ed25519);
        KeyPair keyPair1 = new KeyPair(new EdDSAPublicKey(pubKeySpec), new EdDSAPrivateKey(privKeySpec));
        KeyPair keyPair2 = new KeyPair(new EdDSAPublicKey(pubKeySpec), new EdDSAPrivateKey(privKeySpec));
        assertTrue(keyPair1.equals(keyPair2));
    }

    @Test
    public void fromXdrPublicKeyTest() {
        PublicKey xdrPublicKey = new PublicKey();
        KeyPair keyPair = KeyPair.fromXdrPublicKey(xdrPublicKey);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedStringInsecureTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("SACJC372QBSSKJZZHBL54BR4G4WLC2VJJ5YPBSOND4POT7CFP2E5UOGO");
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new String("SACJC372QBSSKJZZHBL54BR4G4WLC2VJJ5YPBSOND4POT7CFP2E5UOGO").toCharArray());
        assertNotNull(keyPair);
    }

    @Test
    public void fromAccountIdTest() {
        KeyPair keyPair = KeyPair.fromAccountId("GAHWJSNVQYF4HZPEIOGAUBYVQ2YPBXBPTHMO3P7TOWRBFJLZKHJVPCJH");
        assertNotNull(keyPair);
    }

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = KeyPair.fromAccountId("GAHWJSNVQYF4HZPEIOGAUBYVQ2YPBXBPTHMO3P7TOWRBFJLZKHJVPCJH");
        assertEquals(keyPair.getAccountId(), "GAHWJSNVQYF4HZPEIOGAUBYVQ2YPBXBPTHMO3P7TOWRBFJLZKHJVPCJH");
    }

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new String("SACJC372QBSSKJZZHBL54BR4G4WLC2VJJ5YPBSOND4POT7CFP2E5UOGO").toCharArray());
        assertNotNull(keyPair.getSecretSeed());
    }

}