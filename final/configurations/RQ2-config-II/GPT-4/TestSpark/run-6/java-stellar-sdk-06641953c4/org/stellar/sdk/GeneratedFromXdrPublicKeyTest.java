package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.nio.charset.StandardCharsets;

public class GeneratedFromXdrPublicKeyTest {

    @Test
    public void fromXdrPublicKeyTest() {
        PublicKey publicKey = new PublicKey();
        publicKey.setPublicKeyType(PublicKeyType.PUBLIC_KEY_TYPE_ED25519);
        publicKey.setEd25519(new Uint256());
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKey);
        Assert.assertNotNull(keyPair);
    }

}