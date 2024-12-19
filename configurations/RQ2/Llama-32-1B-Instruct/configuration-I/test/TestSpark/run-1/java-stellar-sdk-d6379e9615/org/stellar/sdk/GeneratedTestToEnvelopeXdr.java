package org.stellar.sdk;

public class GeneratedTestToEnvelopeXdr {

    @Test
    public void TestToEnvelopeXdr() {
        MockTransaction transaction = new MockTransaction();
        Network network = new MockNetwork();

        TransactionEnvelopeXdr transactionEnvelopeXdr = toEnvelopeXdr(transaction, network);

        assertEquals(3L, transactionEnvelopeXdr.getAccountConversionMethod().getId());
    }

}