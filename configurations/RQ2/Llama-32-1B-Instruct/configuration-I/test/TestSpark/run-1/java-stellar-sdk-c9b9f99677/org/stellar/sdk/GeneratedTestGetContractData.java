package org.stellar.sdk;

import org.junit.Test;
import okhttp3.HttpUrl;

public class GeneratedTestGetContractData {

    @Test
    public void testGetContractData() throws Exception {
        // Arrange
        String serverURI = "http://localhost:5000";
        OkHttpClient httpClient = new OkHttpClient();
        HttpUrl url = HttpUrl.parse(serverURI).newBuilder().addPathSegment("account").build();

        // Act
        SorobanServer sorobanServer = new SorobanServer(serverURI, httpClient);
        GetLedgerEntriesResponse response = sorobanServer.getContractData("12345", "key", Durability.MAX);

        // Assert
        assert response != null;
    }

}