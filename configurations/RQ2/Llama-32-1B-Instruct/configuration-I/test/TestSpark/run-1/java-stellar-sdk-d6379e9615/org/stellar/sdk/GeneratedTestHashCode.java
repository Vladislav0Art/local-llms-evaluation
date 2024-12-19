package org.stellar.sdk;

public class GeneratedTestHashCode {

    @Test
    public void TestHashCode() {
        MockTransactionV0Envelope envelope1 = new MockTransactionV0Envelope();
        MockTransactionV0Envelope envelope2 = new MockTransactionV0Envelope();

        TransactionV0EnvelopeXdr transactionV0EnvelopeXdr1 = fromV0EnvelopeXdr(envelope1, NetworkMock.getNetwork());
        TransactionV0EnvelopeXdr transactionV0EnvelopeXdr2 = fromV0EnvelopeXdr(envelope2, NetworkMock.getNetwork());

        assertEquals(1L, transactionV0EnvelopeXdr1.getAccountConversionMethod().getId());
        assertEquals(1L, transactionV0EnvelopeXdr2.getAccountConversionMethod().getId());

        verify(accountConverter).convertAccount(1L);
    }

}