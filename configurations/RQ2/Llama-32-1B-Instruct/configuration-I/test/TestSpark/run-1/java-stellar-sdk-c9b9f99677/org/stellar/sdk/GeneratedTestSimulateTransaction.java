package org.stellar.sdk;

import org.junit.Test;
import okhttp3.HttpUrl;

public class GeneratedTestSimulateTransaction {

    @Test
    public void testSimulateTransaction() throws Exception {
        // Arrange
        String serverURI = "http://localhost:5000";
        OkHttpClient httpClient = new OkHttpClient();
        HttpUrl url = HttpUrl.parse(serverURI).newBuilder().addPathSegment("account").build();

        // Act
        SorobanServer sorobanServer = new SorobanServer(serverURI, httpClient);
        Transaction transaction = new Transaction();
        SimulateTransactionResponse response = sorobanServer.simulateTransaction(transaction);

        // Assert
        assert response != null;
    }

}