package org.stellar.sdk;

import org.junit.jupiter.api.Test;
import org.stellar.sdk.client.JvmClient;
import org.stellar.sdk.client.Network;
import org.stellar.sdk.core.asset.Asset;
import org.stellar.sdk.core.transaction.Transaction;
import org.stellar.sdk.keypair.KeyPair;
import org.stellar.sdk.keypair.PublicKey;

public class GeneratedTest {

    @Test
    public void testGenerated() throws Exception {
        JvmClient jvm = new JvmClient(Network.TESTNet);
        PublicKey publicKey = jvm.getPublicKeyFromAddress("GB6JF4D5BXC3VZTQVJW6N2X6A7P3M6NXC");

        KeyPair keyPair = new KeyPair(publicKey);

        assert keyPair.getPublicKey() != null;

        Transaction transaction = keyPair.signTransaction(
                new Asset("GRO", "My New Asset"),
                1000L
        );

        System.out.println(transaction);
    }

}