package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.stellar.sdk.SorobanServer;
import org.stellar.sdk.SorobanRpcErrorResponse;
import org.stellar.sdk.GetHealthResponse;
import org.stellar.sdk.GetLedgerEntriesResponse;
import org.stellar.sdk.GetTransactionResponse;
import org.stellar.sdk.GetEventsResponse;
import org.stellar.sdk.GetNetworkResponse;
import org.stellar.sdk.GetLatestLedgerResponse;
import org.stellar.sdk.SimulateTransactionResponse;
import org.stellar.sdk.PrepareTransactionException;
import org.stellar.sdk.SendTransactionResponse;
import org.stellar.sdk.Transaction;
import org.stellar.sdk.TransactionBuilderAccount;
import org.stellar.sdk.LedgerKey;
import org.stellar.sdk.Durability;
import org.stellar.sdk.SCVal;
import okhttp3.OkHttpClient;

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
public class GeneratedGetAccount_GivenValidAccountId_ReturnsAccount {

    @InjectMocks
    private SorobanServer sorobanServer;

    @Mock
    private OkHttpClient httpClient;

    @Test
    public void getAccount_GivenValidAccountId_ReturnsAccount() throws IOException, SorobanRpcErrorResponse {
        // Arrange
        String accountId = "account-id";
        TransactionBuilderAccount account = mock(TransactionBuilderAccount.class);
        when(sorobanServer.getAccount(accountId)).thenReturn(account);

        // Act
        TransactionBuilderAccount result = sorobanServer.getAccount(accountId);

        // Assert
        assertNotNull(result);
        verify(sorobanServer).getAccount(accountId);
    }

}