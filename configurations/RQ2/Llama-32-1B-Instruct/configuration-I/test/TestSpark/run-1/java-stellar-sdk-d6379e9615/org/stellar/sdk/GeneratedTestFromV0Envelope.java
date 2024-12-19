package org.stellar.sdk;

public class GeneratedTestFromV0Envelope {

    public static class MockNetwork {
        public Network getNetwork() {
            return new MockNetwork();
        }
    }

    public static class MockAccountConverter {
        @Override
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

        @Override
        public String toString() {
            return "TransactionV0Envelope{" +
                    "id=" + id +
                    '}';
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
        public void TestFromV0Envelope() {
            MockAccountConverter accountConverter = new MockAccountConverter();
            MockTransactionV1Envelope envelope = new MockTransactionV1Envelope();

            verify(accountConverter).convertAccount(1);
        }

    }