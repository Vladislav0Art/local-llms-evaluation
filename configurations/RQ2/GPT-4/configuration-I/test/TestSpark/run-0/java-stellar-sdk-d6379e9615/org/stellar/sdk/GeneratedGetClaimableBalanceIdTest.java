package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.*;

public class GeneratedGetClaimableBalanceIdTest {

    @Test
    public void getClaimableBalanceIdTest() {
        Transaction transaction = new Transaction();
        String balanceId = transaction.getClaimableBalanceId(0);
        assertNotNull(balanceId);
    }

}