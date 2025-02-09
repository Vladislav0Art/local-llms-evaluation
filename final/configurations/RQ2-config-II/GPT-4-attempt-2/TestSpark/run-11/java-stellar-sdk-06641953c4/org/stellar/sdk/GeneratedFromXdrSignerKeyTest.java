package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.SignerKeyType;
import org.stellar.sdk.xdr.XdrDataOutputStream;

public class GeneratedFromXdrSignerKeyTest {

    @Test
    public void fromXdrSignerKeyTest() {
        SignerKey key = new SignerKey();
        key.setKeyType(SignerKeyType.SIGNER_KEY_TYPE_ED25519);
        KeyPair keyPair = KeyPair.fromXdrSignerKey(key);
        Assert.assertNotNull(keyPair);
    }

}