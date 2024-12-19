package org.stellar.sdk;

import org.junit.Test;
import okhttp3.HttpUrl;

public class GeneratedTestGetHealth {

    @Test
    public void testGetHealth() throws Exception {
        // Arrange
        String serverURI = "http://localhost:5000";
        OkHttpClient httpClient = new OkHttpClient();

        // Act
        SorobanServer sorobanServer = new SorobanServer(serverURI, httpClient);
        GetHealthResponse response = sorobanServer.getHealth();

        // Assert
        assert response != null;
    }

}