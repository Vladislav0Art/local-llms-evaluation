package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;

import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void fromPublicKeyWithInvalidKeyTest() {
        org.stellar.sdk.KeyPair.fromPublicKey(new byte[31]);
    }

    @Test
    public void fromPublicKeyTest() {
        org.stellar.sdk.KeyPair keyPair = org.stellar.sdk.KeyPair.fromPublicKey(new byte[32]);
        assertTrue(keyPair instanceof org.stellar.sdk.KeyPair);
    }

    @Test
    public void fromSecretSeedStringTest() {
        String seedString = "SB6MJOG3ERDBV34AZI6WFS6Y2JI4W3LDMX3GCLVZ526536JZ3SC54ZPA";
        org.stellar.sdk.KeyPair keyPair = org.stellar.sdk.KeyPair.fromSecretSeed(seedString);
        assertTrue(keyPair instanceof org.stellar.sdk.KeyPair);
    }

    @Test
    public void fromSecretSeedTest() {
        char[] seed = "SB6MJOG3ERDBV34AZI6WFS6Y2JI4W3LDMX3GCLVZ526536JZ3SC54ZPA".toCharArray();
        org.stellar.sdk.KeyPair keyPair = org.stellar.sdk.KeyPair.fromSecretSeed(seed);
        assertTrue(keyPair instanceof org.stellar.sdk.KeyPair);
    }

    @Test
    public void fromXdrPublicKeyTest() {
        PublicKey publicKey = new PublicKey();
        publicKey.setDiscriminant(org.stellar.sdk.xdr.PublicKeyType.PUBLIC_KEY_TYPE_ED25519);
        org.stellar.sdk.xdr.Uint256 uint256 = new org.stellar.sdk.xdr.Uint256();
        uint256.setUint256(new byte[32]);
        publicKey.setEd25519(uint256);

        org.stellar.sdk.KeyPair keyPair = org.stellar.sdk.KeyPair.fromXdrPublicKey(publicKey);
        assertTrue(keyPair instanceof org.stellar.sdk.KeyPair);
    }

    @Test
    public void randomTest() {
        org.stellar.sdk.KeyPair keyPair = org.stellar.sdk.KeyPair.random();
        assertTrue(keyPair instanceof org.stellar.sdk.KeyPair);
    }

}