package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKeyType;

public class GeneratedFromBip39SeedTest {

    @Test
    public void fromBip39SeedTest() {
        byte[] byteArr = new byte[32];
        int accountNumber = 0;
        KeyPair fakeKeyPair = KeyPair.fromBip39Seed(byteArr, accountNumber);
        Assert.assertNotNull(fakeKeyPair);
    }

}