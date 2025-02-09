package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.SignerKeyType;
import org.stellar.sdk.xdr.XdrDataOutputStream;

public class GeneratedFromXdrPublicKeyTest {

    @Test
    public void fromXdrPublicKeyTest() {
        PublicKey key = new PublicKey();
        key.setKeyType(PublicKeyType.PUBLIC_KEY_TYPE_ED25519);
        KeyPair keyPair = KeyPair.fromXdrPublicKey(key);
        Assert.assertNotNull(keyPair);
    }

}