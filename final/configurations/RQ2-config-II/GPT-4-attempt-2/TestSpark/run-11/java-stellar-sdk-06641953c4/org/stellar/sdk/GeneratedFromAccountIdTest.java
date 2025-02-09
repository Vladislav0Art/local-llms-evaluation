package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.SignerKeyType;
import org.stellar.sdk.xdr.XdrDataOutputStream;

public class GeneratedFromAccountIdTest {

    @Test
    public void fromAccountIdTest() {
        String accountId = "GCM3XJ4WDLA63WSXFYUNXFETQ5JFYYNXUZGYZEOS5VGODFEGY2Y2E3Y6";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        Assert.assertNotNull(keyPair);
    }

}