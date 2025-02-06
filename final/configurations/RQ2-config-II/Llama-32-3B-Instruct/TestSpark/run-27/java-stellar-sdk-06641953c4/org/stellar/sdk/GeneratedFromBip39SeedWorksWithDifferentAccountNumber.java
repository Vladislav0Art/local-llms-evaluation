package org.stellar.sdk;

import net.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

import static com.google.common.base.Preconditions.checkNotNull;
import static java.lang.System.arraycopy;

public class GeneratedFromBip39SeedWorksWithDifferentAccountNumber {

    @Test
    public void fromBip39SeedWorksWithDifferentAccountNumber() {
        byte[] bip39Seed = {0x00, 0x01, 0x02, 0x03};
        int accountNumber1 = 1;
        int accountNumber2 = 2;
        KeyPair keyPair1 = KeyPair.fromBip39Seed(bip39Seed, accountNumber1);
        KeyPair keyPair2 = KeyPair.fromBip39Seed(bip39Seed, accountNumber2);
        assertTrue(Arrays.equals(keyPair1.getPublicKey(), keyPair2.getPublicKey()));
    }

}