package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;

import static org.junit.Assert.assertTrue;

public class GeneratedFromXdrPublicKeyTest {

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

}