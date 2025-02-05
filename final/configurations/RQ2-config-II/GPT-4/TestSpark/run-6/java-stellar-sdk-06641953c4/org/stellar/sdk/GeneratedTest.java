package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.nio.charset.StandardCharsets;

public class GeneratedTest {

    @Test
    public void canSignTest() {
        EdDSAPublicKey mockedPublicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(mockedPublicKey);
        Assert.assertFalse(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedCharTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new char[]{});
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedStringTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("");
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromPublicBytesStringTest() {
        KeyPair keyPair = KeyPair.fromPublicKey(new byte[]{});
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromBip39SeedTest() {
        KeyPair keyPair = KeyPair.fromBip39Seed(new byte[]{}, 0);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromAccountIdTest() {
        KeyPair keyPair = KeyPair.fromAccountId("accountId");
    }

    @Test
    public void getAccountIdTest() {
        EdDSAPublicKey mockedPublicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(mockedPublicKey);
        Assert.assertNotNull(keyPair.getAccountId());
    }

    @Test
    public void getSecretSeedTest() {
        EdDSAPublicKey mockedPublicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(mockedPublicKey);
        keyPair.getSecretSeed();
    }

    @Test
    public void verifyTest() {
        EdDSAPublicKey mockedPublicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(mockedPublicKey);
        Assert.assertFalse(keyPair.verify("data".getBytes(StandardCharsets.UTF_8), "signature".getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    public void getPublicKeyTest() {
        EdDSAPublicKey mockedPublicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(mockedPublicKey);
        Assert.assertNotNull(keyPair.getPublicKey());
    }

    @Test
    public void equalsTest() {
        EdDSAPublicKey mockedPublicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(mockedPublicKey);
        Assert.assertTrue(keyPair.equals(keyPair));
        Assert.assertFalse(keyPair.equals(new KeyPair(mockedPublicKey)));
    }

    @Test
    public void hashCodeTest() {
        EdDSAPublicKey mockedPublicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(mockedPublicKey);
        Assert.assertNotNull(keyPair.hashCode());
    }

    @Test
    public void getXdrPublicKeyTest() {
        EdDSAPublicKey mockedPublicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(mockedPublicKey);
        Assert.assertNotNull(keyPair.getXdrPublicKey());
    }

    @Test
    public void getXdrSignerKeyTest() {
        EdDSAPublicKey mockedPublicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(mockedPublicKey);
        Assert.assertNotNull(keyPair.getXdrSignerKey());
    }

    @Test
    public void fromXdrPublicKeyTest() {
        PublicKey publicKey = new PublicKey();
        publicKey.setPublicKeyType(PublicKeyType.PUBLIC_KEY_TYPE_ED25519);
        publicKey.setEd25519(new Uint256());
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKey);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromXdrSignerKeyTest() {
        SignerKey signerKey = new SignerKey();
        signerKey.setSignerKeyType(SignerKeyType.SIGNER_KEY_TYPE_ED25519);
        signerKey.setEd25519(new Uint256());
        KeyPair keyPair = KeyPair.fromXdrSignerKey(signerKey);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void randomTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair);
    }

}