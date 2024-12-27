package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.stellar.sdk.AccountConverter;
import org.stellar.sdk.EnvelopeType;
import org.stellar.sdk.Memo;
import org.stellar.sdk.Network;
import org.stellar.sdk.Operation;
import org.stellar.sdk.SorobanTransactionData;
import org.stellar.sdk.TransactionPreconditions;
import org.stellar.sdk.TransactionV0Envelope;
import org.stellar.sdk.TransactionV1Envelope;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSignatureBaseTest {

    @Test
    public void signatureBaseTest() {
        AccountConverter accountConverter = mock(AccountConverter.class);
        Transaction transaction = new Transaction(accountConverter, "sourceAccount", 100, 1, new Operation[]{}, new Memo(), new TransactionPreconditions(), new SorobanTransactionData(), Network.TESTNET);
        byte[] result = transaction.signatureBase();
        assertNotNull(result);
    }

}