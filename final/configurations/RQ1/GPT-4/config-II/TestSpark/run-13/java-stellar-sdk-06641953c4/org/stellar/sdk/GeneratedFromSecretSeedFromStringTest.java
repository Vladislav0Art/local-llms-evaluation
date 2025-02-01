package org.stellar.sdk;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;

import org.junit.Test;
import org.stellar.sdk.*;

public class GeneratedFromSecretSeedFromStringTest {

    @Test
    public void fromSecretSeedFromStringTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("SBILUHQVXKTLPYXHHBL4IQEZAKJUD4B6EFM3ZLJZEKYPHZ23OQQD2UHB");
        assertNull(keyPair.getSecretSeed());
    }

}