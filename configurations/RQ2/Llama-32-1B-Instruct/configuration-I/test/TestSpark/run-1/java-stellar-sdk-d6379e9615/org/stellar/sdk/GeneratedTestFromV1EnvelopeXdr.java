package org.stellar.sdk;

public class GeneratedTestFromV1EnvelopeXdr {

    @Test
    public void TestFromV1EnvelopeXdr() {
        MockTransactionV1Envelope envelope = new MockTransactionV1Envelope();
        Network network = new MockNetwork();

        TransactionV1EnvelopeXdr transactionV1EnvelopeXdr = fromV1EnvelopeXdr(envelope, network);

        verify(accountConverter).convertAccount(1L);
    }

}