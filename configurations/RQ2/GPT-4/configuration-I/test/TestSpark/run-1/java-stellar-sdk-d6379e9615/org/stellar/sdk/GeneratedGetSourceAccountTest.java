package org.stellar.sdk;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.stellar.sdk.*;
import org.mockito.Mockito;

public class GeneratedGetSourceAccountTest {

    @Test
    public void getSourceAccountTest() {
        AccountConverter accountConverter = Mockito.mock(AccountConverter.class);
        Operation[] operations = {};
        Memo memo = Memo.text("memo text");
        Transaction transaction = new Transaction(accountConverter, "abc123", 100L, 1L, operations, memo, null, null, Network.PUBLIC);

        assertEquals("abc123", transaction.getSourceAccount());
    }

}