package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedGetAccountIdEmptySeedShouldReturnNull {

    @Test
    public void getAccountIdEmptySeedShouldReturnNull() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new char[0]);
        assertNull(keyPair.getAccountId());
    }

}