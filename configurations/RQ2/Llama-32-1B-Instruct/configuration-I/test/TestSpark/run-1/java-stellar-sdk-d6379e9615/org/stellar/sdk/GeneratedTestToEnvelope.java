package org.stellar.sdk;

public class GeneratedTestToEnvelope {

    public static class MockNetwork {
        public Network getNetwork() {
            return new MockNetwork();
        }
    }

    public static class MockAccountConverter {
        public int convertAccount(int id) {
            return id;
        }
    }

    public static interface TransactionConversionMethod {
        void execute();
    }

    public static class TransactionV0Envelope {
        private int id;

        public TransactionV0Envelope(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }
    }

    public static class MockTransactionV1Envelope extends TransactionV0Envelope {
        @Override
        public int getAccountConversionMethod() {
            return 3;
        }
    }

    public static class TransactionV0EnvelopeXdr {
        private TransactionV0Envelope transactionV0Envelope;

        public TransactionV0EnvelopeXdr(TransactionV0Envelope transactionV0Envelope) {
            this.transactionV0Envelope = transactionV0Envelope;
        }

        @Test
        public void TestToEnvelope() {
            MockTransaction transaction = new MockTransaction();
            MockNetwork network = new MockNetwork();

            TransactionEnvelopeXdr transactionEnvelopeXdr = toEnvelopeXdr(transaction, network);

            assertEquals(3L, transactionEnvelopeXdr.getAccountConversionMethod().getId());
        }
    }

    public static class MockTransaction {
        public int getId() {
            return 1;
        }
    }

}