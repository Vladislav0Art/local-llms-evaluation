package org.stellar.sdk;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;

import org.junit.Test;
import org.stellar.sdk.*;

public class GeneratedTest {

    @Test
    public void KeyPairInitializedWithPublicKeyTest() {
        EdDSAPublicKey pk = StellarSDKTestUtils.mockPublicKey();
        KeyPair keyPair = new KeyPair(pk);
        assertTrue(keyPair.canSign() == false);
    }

    @Test
    public void KeyPairInitializedWithBothKeysTest() {
        EdDSAPublicKey pk = StellarSDKTestUtils.mockPublicKey();
        EdDSAPrivateKey privk = StellarSDKTestUtils.mockPrivateKey();
        KeyPair keyPair = new KeyPair(pk, privk);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedFromCharArrayTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("SBILUHQVXKTLPYXHHBL4IQEZAKJUD4B6EFM3ZLJZEKYPHZ23OQQD2UHB".toCharArray());
        assertNull(keyPair.getSecretSeed());
    }

    @Test
    public void fromSecretSeedFromStringTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("SBILUHQVXKTLPYXHHBL4IQEZAKJUD4B6EFM3ZLJZEKYPHZ23OQQD2UHB");
        assertNull(keyPair.getSecretSeed());
    }

}