package org.stellar.sdk;

import com.google.common.base.Preconditions;
import org.junit.jupiter.api.Test;

public class GeneratedTestFromSecretSeedAndAccountNumber {

    @Test
    public void testFromSecretSeedAndAccountNumber() {
        char[] secretSeed = SECRET_SEED.toCharArray();
        byte[] accountNumber = ACCOUNT_NUMBER;
        KeyPair keyPair = KeyPair.fromSecretSeedAndAccountNumber(secretSeed, accountNumber);
        Preconditions.checkArgument(keyPair.getPublicKey() != null, "Expected non-null public key");
    }

}