package org.stellar.sdk;

public class GeneratedTestIsSorobanTransaction {

    @Test
    public void TestIsSorobanTransaction() {
        MockTransactionV0Envelope envelope = new MockTransactionV0Envelope();
        Network network = new MockNetwork();

        Transaction transaction = fromV0EnvelopeXdr(envelope, network);

        assertTrue(transaction.isSorobanTransaction());

        verify(accountConverter).convertAccount(1L);
    }
}

class AccountConverter {
    public int convertAccount(int id) {
        return id;
    }
}

class Network {
    static class getNetwork() {
		return new

        MockNetwork();
    }

    public static Network getNetwork() {
        return Network.getNetwork();
    }
}

interface Operation {
    void execute();
}

class Memo {
    // Implementation
}

class SorobanTransactionData {
    // Implementation
}

}