package org.stellar.sdk;

import org.stellar.sdk.AccountKey;
import org.stellar.sdk.Bip39Seed;

public class GeneratedGenerateEdDSAPublicKey {

    @Test
    public void generateEdDSAPublicKey() {
        String accountID = "your_account_id_here";
        byte[] seed = Bip39Seed.generateSeed(accountID);
        EdDSAPublicKey publicKey1 = generateEdDSAPublicKey(seed);
        Assert.assertEquals(publicKey1, KeyGeneratorTest.generateEdDSAPublicKey(seed));
    }

}