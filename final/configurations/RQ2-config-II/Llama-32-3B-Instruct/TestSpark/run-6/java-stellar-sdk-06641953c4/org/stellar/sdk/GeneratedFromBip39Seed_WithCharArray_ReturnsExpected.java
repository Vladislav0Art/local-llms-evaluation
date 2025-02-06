package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromBip39Seed_WithCharArray_ReturnsExpected {

    @Test
    public void fromBip39Seed_WithCharArray_ReturnsExpected() {
        char[] bip39Seed = "hello".toCharArray();
        int accountNumber = 12345;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair);
    }

}