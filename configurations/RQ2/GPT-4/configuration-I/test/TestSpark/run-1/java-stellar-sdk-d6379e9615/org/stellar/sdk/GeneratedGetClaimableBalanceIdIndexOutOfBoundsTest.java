package org.stellar.sdk;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.stellar.sdk.*;
import org.mockito.Mockito;

public class GeneratedGetClaimableBalanceIdIndexOutOfBoundsTest {

    @Test
    public void getClaimableBalanceIdIndexOutOfBoundsTest() throws IOException {
        AccountConverter accountConverter = Mockito.mock(AccountConverter.class);
        Operation[] operations = {};
        Memo memo = Memo.none();
        Transaction transaction = new Transaction(accountConverter, "abc123", 100L, 1L, operations, memo, null, null, Network.PUBLIC);

        transaction.getClaimableBalanceId(0);
    }

}