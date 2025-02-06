package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedFromBip39SeedShouldReturnKeyPair {

    @Test
    public void fromBip39SeedShouldReturnKeyPair() {
        byte[] bip39Seed = Mockito.mock(byte[].class);
        int accountNumber = 2;
        byte[] expectedPublicKey = new byte[]{1, 2, 3};
        when(bip39Seed).length().thenReturn(expectedPublicKey.length);
        assertEquals(KeyPair.fromBip39Seed(bip39Seed, accountNumber), new KeyPair(expectedPublicKey));
    }

}