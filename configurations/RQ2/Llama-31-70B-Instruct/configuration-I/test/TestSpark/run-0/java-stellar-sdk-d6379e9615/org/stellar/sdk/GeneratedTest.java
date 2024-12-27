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

public class GeneratedTest {

    @Test
    public void signatureBaseTest() {
        Transaction transaction = mock(Transaction.class);
        when(transaction.signatureBase()).thenReturn(new byte[0]);
        assertArrayEquals(new byte[0], transaction.signatureBase());
    }

    @Test
    public void getSourceAccountTest() {
        Transaction transaction = mock(Transaction.class);
        when(transaction.getSourceAccount()).thenReturn("sourceAccount");
        assertEquals("sourceAccount", transaction.getSourceAccount());
    }

    @Test
    public void getSequenceNumberTest() {
        Transaction transaction = mock(Transaction.class);
        when(transaction.getSequenceNumber()).thenReturn(1L);
        assertEquals(1L, transaction.getSequenceNumber());
    }

    @Test
    public void getMemoTest() {
        Transaction transaction = mock(Transaction.class);
        Memo memo = mock(Memo.class);
        when(transaction.getMemo()).thenReturn(memo);
        assertEquals(memo, transaction.getMemo());
    }

}