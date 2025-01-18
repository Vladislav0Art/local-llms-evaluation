package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedFromBip39SeedTest {

    @Test
    public void fromBip39SeedTest() {
        byte[] seed = "seed".getBytes();
        int accountNumber = 1;
        Assert.assertNotNull(KeyPair.fromBip39Seed(seed, accountNumber));
    }

}