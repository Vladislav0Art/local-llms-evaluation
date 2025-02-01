package org.stellar.sdk;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;

import org.junit.Test;
import org.stellar.sdk.*;

public class GeneratedFromSecretSeedFromCharArrayTest {

    @Test
    public void fromSecretSeedFromCharArrayTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("SBILUHQVXKTLPYXHHBL4IQEZAKJUD4B6EFM3ZLJZEKYPHZ23OQQD2UHB".toCharArray());
        assertNull(keyPair.getSecretSeed());
    }

}