package org.stellar.sdk;

public class GeneratedTest {

    @Test
    public void testCanSign() {
        KeyPair keyPair = KeyPair.random();

        assertTrue(keyPair.canSign());
        assertFalse(KeyPair.fromPublicKey(keyPair.getPublicKey()).canSign());
    }

    @Test
    public void testRandomKeyPair() {
        KeyPair keyPair = KeyPair.random();

        assertNotNull(keyPair);
        assertNotNull(keyPair.getAccountId());
        assertNotNull(keyPair.getPublicKey());
        assertNotNull(keyPair.getSecretSeed());
        assertNotNull(keyPair.getSignatureHint());
        assertNotNull(keyPair.getXdrPublicKey());
        assertNotNull(keyPair.getXdrSignerKey());
    }

    @Test
    public void testSignature() throws SignatureException, IOException {
        KeyPair keyPair = KeyPair.random();

        byte[] data = new byte[]{1, 2, 3};
        byte[] signature = keyPair.sign(data);

        assertArrayEquals(signature, keyPair.sign(data));
        assertTrue(keyPair.verify(data, signature));
    }

    @Test
    public void testFromXdrPublicKey() {
        KeyPair keyPair = KeyPair.random();

        PublicKey xdrPublicKey = keyPair.getXdrPublicKey();

        assertNotNull(xdrPublicKey);
        assertNotNull(KeyPair.fromXdrPublicKey(xdrPublicKey));
    }

    @Test
    public void testFromXdrSignerKey() {
        KeyPair keyPair = KeyPair.random();

        SignerKey xdrSignerKey = keyPair.getXdrSignerKey();

        assertNotNull(xdrSignerKey);
        assertNotNull(KeyPair.fromXdrSignerKey(xdrSignerKey));
    }

}