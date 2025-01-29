package org.stellar.sdk;

import org.stellar.sdk.AccountKey;
import org.stellar.sdk.Bip39Seed;

public class GeneratedGetAccountID {

    @Test
    public void getAccountID() {
        String accountID = "your_account_id_here";
        AccountKey account1 = generateAccountID();
        Assert.assertEquals(account1, KeyGeneratorTest.getAccountKey(accountID));
    }

}