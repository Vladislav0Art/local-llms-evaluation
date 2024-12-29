package org.stellar.sdk;

public class GeneratedTestKeypairCreationWithSECRETKEYTypeAndValidKey {

    @Test
    public void testKeypairCreationWithSECRETKEYTypeAndValidKey() {
        byte[] key = new byte[32];
        // initialize key
        Keypair keypair = new Keypair(Keypair.KeypairType.SECRETKEY, key);
        Assert.assertNotNull(keypair);
    }
}

public class GeneratedTest {

    public void testKeypairCreationWithRSASEEDTypeAndValidKey() {
        byte[] key = new byte[32];
        // initialize key
        Keypair keypair = new Keypair(Keypair.KeypairType.RSASEED, key);
        Assert.assertNotNull(keypair.getPublicKey());
    }

    public void testKeypairCreationWithSECRETKEYTypeAndValidKey() {
        byte[] key = new byte[32];
        // initialize key
        Keypair keypair = new Keypair(Keypair.KeypairType.SECRETKEY, key);
        Assert.assertNotNull(keypair.getPublicKey());
    }
}

public class KeyPairTest {

    public void testKeypairCreationWithRSASEEDTypeAndValidKey() {
        byte[] key = new byte[32];
        // initialize key
        Keypair keypair = new Keypair(Keypair.KeypairType.RSASEED, key);
        System.out.println(keypair.getPublicKey());
    }

    public void testKeypairCreationWithSECRETKEYTypeAndValidKey() {
        byte[] key = new byte[32];
        // initialize key
        Keypair keypair = new Keypair(Keypair.KeypairType.SECRETKEY, key);
        System.out.println(keypair.getPublicKey());
    }

}