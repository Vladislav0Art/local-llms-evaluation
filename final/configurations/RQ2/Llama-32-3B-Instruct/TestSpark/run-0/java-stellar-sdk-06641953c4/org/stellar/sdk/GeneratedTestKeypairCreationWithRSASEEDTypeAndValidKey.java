package org.stellar.sdk;

public class GeneratedTestKeypairCreationWithRSASEEDTypeAndValidKey {

    @Test
    public void testKeypairCreationWithRSASEEDTypeAndValidKey() {
        byte[] key = new byte[32];
        // initialize key
        Keypair keypair = new Keypair(Keypair.KeypairType.RSASEED, key);
        Assert.assertNotNull(keypair);
    }

}