package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.nio.charset.StandardCharsets;

public class GeneratedFromXdrSignerKeyTest {

    @Test
    public void fromXdrSignerKeyTest() {
        SignerKey signerKey = new SignerKey();
        signerKey.setSignerKeyType(SignerKeyType.SIGNER_KEY_TYPE_ED25519);
        signerKey.setEd25519(new Uint256());
        KeyPair keyPair = KeyPair.fromXdrSignerKey(signerKey);
        Assert.assertNotNull(keyPair);
    }

}