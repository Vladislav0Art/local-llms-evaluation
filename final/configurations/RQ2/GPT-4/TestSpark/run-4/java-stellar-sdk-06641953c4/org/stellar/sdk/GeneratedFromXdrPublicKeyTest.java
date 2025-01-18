package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKeyType;

public class GeneratedFromXdrPublicKeyTest {

    @Test
    public void fromXdrPublicKeyTest() {
        PublicKey publicKey = new PublicKey();
        publicKey.setKeyType(PublicKeyType.PUBLIC_KEY_TYPE_ED25519);
        byte[] uint256 = new byte[32];
        publicKey.setEd25519(uint256);
        KeyPair fakeKeyPair = KeyPair.fromXdrPublicKey(publicKey);
        Assert.assertNotNull(fakeKeyPair);
    }

}