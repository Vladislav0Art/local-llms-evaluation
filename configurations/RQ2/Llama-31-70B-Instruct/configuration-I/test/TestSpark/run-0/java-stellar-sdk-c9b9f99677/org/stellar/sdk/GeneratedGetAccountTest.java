package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.SorobanServer;
import org.stellar.sdk.exceptions.AccountNotFoundException;
import org.stellar.sdk.exceptions.SorobanRpcErrorResponse;
import org.stellar.sdk.responses.GetEventsResponse;
import org.stellar.sdk.responses.GetHealthResponse;
import org.stellar.sdk.responses.GetLedgerEntriesResponse;
import org.stellar.sdk.responses.GetNetworkResponse;
import org.stellar.sdk.responses.GetTransactionResponse;
import org.stellar.sdk.responses.SimulateTransactionResponse;
import org.stellar.sdk.responses.TransactionBuilderAccount;
import org.stellar.sdk.responses.TransactionResponse;
import org.stellar.sdk.responses.requests.GetEventsRequest;
import org.stellar.sdk.responses.requests.GetLedgerEntriesRequest;
import org.stellar.sdk.responses.requests.GetTransactionRequest;
import org.stellar.sdk.responses.requests.SimulateTransactionRequest;
import org.stellar.sdk.responses.requests.TransactionRequest;

import java.io.IOException;
import java.util.Collection;
import java.util.Optional;

import static org.junit.Assert.*;

public class GeneratedGetAccountTest {

    @Test
    public void getAccountTest() throws IOException, AccountNotFoundException, SorobanRpcErrorResponse {
        // Arrange
        String accountId = "accountId";
        SorobanServer sorobanServer = new SorobanServer("serverURI");

        // Act
        TransactionBuilderAccount account = sorobanServer.getAccount(accountId);

        // Assert
        assertNotNull(account);
    }

}