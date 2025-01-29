package org.stellar.sdk;

import org.stellar.sdk.AccountKey;
import org.stellar.sdk.Bip39Seed;

public class GeneratedGeneratePrivateKey {

    @Test
    public void generatePrivateKey() {
        String accountID = "your_account_id_here";
        Keypair privateKey1 = generatePrivateKey(accountID);
        Assert.assertEquals(privateKey1, KeyGeneratorTest.getPrivateKey(accountID));
    }

}