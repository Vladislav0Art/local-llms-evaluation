package org.stellar.sdk;

import org.junit.Test;
import okhttp3.HttpUrl;

public class GeneratedTestGetLatestLedgerEntry {

    @Test
    public void testGetLatestLedgerEntry() throws Exception {
        // Arrange
        String serverURI = "http://localhost:5000";
        OkHttpClient httpClient = new OkHttpClient();
        HttpUrl url = HttpUrl.parse(serverURI).newBuilder().addPathSegment("account").build();

        // Act
        SorobanServer sorobanServer = new SorobanServer(serverURI, httpClient);
        GetLatestLedgerEntryResponse response = sorobanServer.getLatestLedgerEntry("12345");

        // Assert
        assert response != null;
    }

}