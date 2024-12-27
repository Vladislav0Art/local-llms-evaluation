package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.AccountConverter;
import org.stellar.sdk.EnvelopeType;
import org.stellar.sdk.Memo;
import org.stellar.sdk.Network;
import org.stellar.sdk.Operation;
import org.stellar.sdk.SorobanTransactionData;
import org.stellar.sdk.TimeBounds;
import org.stellar.sdk.Transaction;
import org.stellar.sdk.TransactionEnvelope;
import org.stellar.sdk.TransactionPreconditions;
import org.stellar.sdk.xdr.TransactionV0Envelope;
import org.stellar.sdk.xdr.TransactionV1Envelope;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetMemoTest {

    @Test
    public void getMemoTest() {
        Transaction transaction = mock(Transaction.class);
        Memo memo = mock(Memo.class);
        when(transaction.getMemo()).thenReturn(memo);
        assertEquals(memo, transaction.getMemo());
    }

}