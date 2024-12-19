package org.stellar.sdk;

import org.junit.Test;
import okhttp3.HttpUrl;

public class GeneratedTestGetContractData_CreatedKey {

    @Test
    public void testGetContractData_CreatedKey() throws Exception {
        // Arrange
        String serverURI = "http://localhost:5000";
        OkHttpClient httpClient = new OkHttpClient();
        HttpUrl url = HttpUrl.parse(serverURI).newBuilder().addPathSegment("account").build();

        // Act
        SorobanServer sorobanServer = new SorobanServer(serverURI, httpClient);
        GetContractDataResponse response = sorobanServer.getContractData("12345", "key", Durability.MAX);

        // Assert
        assert response != null;
    }

}