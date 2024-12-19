package org.stellar.sdk;

import org.junit.Test;
import okhttp3.HttpUrl;

public class GeneratedTestGetLatestLedger {

    @Test
    public void testGetLatestLedger() throws Exception {
        // Arrange
        String serverURI = "http://localhost:5000";
        OkHttpClient httpClient = new OkHttpClient();
        HttpUrl url = HttpUrl.parse(serverURI).newBuilder().addPathSegment("account").build();

        // Act
        SorobanServer sorobanServer = new SorobanServer(serverURI, httpClient);
        GetLatestLedgerResponse response = sorobanServer.getLatestLedger();

        // Assert
        assert response != null;
    }

}