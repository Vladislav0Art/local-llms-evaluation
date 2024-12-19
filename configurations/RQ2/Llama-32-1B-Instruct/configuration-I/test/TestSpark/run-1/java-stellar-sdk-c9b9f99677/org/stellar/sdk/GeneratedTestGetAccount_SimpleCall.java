package org.stellar.sdk;

import org.junit.Test;
import okhttp3.HttpUrl;

public class GeneratedTestGetAccount_SimpleCall {

    @Test
    public void testGetAccount_SimpleCall() throws Exception {
        // Arrange
        String serverURI = "http://localhost:5000";
        OkHttpClient httpClient = new OkHttpClient();

        // Act
        SorobanServer sorobanServer = new SorobanServer(serverURI, httpClient);
        TransactionBuilderAccount accountBuilder = new TransactionBuilderAccount();
        accountBuilder.withAccountId("12345");
        Account account = sorobanServer.getAccount(accountBuilder.build());

        // Assert
        assert account != null;
    }

}