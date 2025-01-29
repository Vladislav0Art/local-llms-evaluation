package org.stellar.sdk;

import org.stellar.sdk.AccountKey;
import org.stellar.sdk.Bip39Seed;

public class GeneratedGetPublicKeyBytes {

    @Test
    public void getPublicKeyBytes() {
        String accountID = "your_account_id_here";
        byte[] seed = Bip39Seed.generateSeed(accountID);
        EdDSAPublicKey publicKey1 = generateEdDSAPublicKey(seed);
        Assert.assertEquals(publicKey1.getPublicKeyBytes(), KeyGeneratorTest.getPrivateKey(accountID).getPublicKeyBytes());
    }

}