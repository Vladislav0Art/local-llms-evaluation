package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.stellar.sdk.SorobanServer;
import org.stellar.sdk.SorobanRpcErrorResponse;
import org.stellar.sdk.Transaction;
import org.stellar.sdk.TransactionBuilderAccount;
import org.stellar.sdk.GetHealthResponse;
import org.stellar.sdk.GetLedgerEntriesResponse;
import org.stellar.sdk.GetTransactionResponse;
import org.stellar.sdk.GetEventsResponse;
import org.stellar.sdk.GetNetworkResponse;
import org.stellar.sdk.GetLatestLedgerResponse;
import org.stellar.sdk.SimulateTransactionResponse;
import org.stellar.sdk.PrepareTransactionException;
import org.stellar.sdk.SendTransactionResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAccount_ThrowsAccountNotFoundException_WhenAccountIdNotFound {

    @InjectMocks
    private SorobanServer sorobanServer;

    @Mock
    private OkHttpClient httpClient;

    @Test
    public void getAccount_ThrowsAccountNotFoundException_WhenAccountIdNotFound() throws IOException, SorobanRpcErrorResponse {
        // Arrange
        String accountId = "account-id";
        when(sorobanServer.getAccount(accountId)).thenThrow(AccountNotFoundException.class);

        // Act and Assert
        assertThrows(AccountNotFoundException.class, () -> sorobanServer.getAccount(accountId));
        verify(sorobanServer).getAccount(accountId);
    }

}