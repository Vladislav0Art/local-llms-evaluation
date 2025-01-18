package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKeyType;

public class GeneratedFromXdrSignerKeyTest {

    @Test
    public void fromXdrSignerKeyTest() {
        SignerKey signerKey = new SignerKey();
        signerKey.setKeyType(SignerKeyType.SIGNER_KEY_TYPE_ED25519);
        byte[] uint256 = new byte[32];
        signerKey.setEd25519(uint256);
        KeyPair fakeKeyPair = KeyPair.fromXdrSignerKey(signerKey);
        Assert.assertNotNull(fakeKeyPair);
    }

}