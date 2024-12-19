package org.stellar.sdk;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import okhttp3.HttpUrl;

public class GeneratedTestPrepareTransaction {

    private static final AccountConverter<String, Long> accountConverter = new AccountConverter<>();

    @Test
    public void testPrepareTransaction() throws Exception {
        Transaction transaction = new Transaction();
        Map<String, Long> data = new HashMap<>();
        data.put("key", 123L);
        PrepareTransactionException exception;
        try {
            exception = (PrepareTransactionException) accountConverter.convert(data);
            throw exception;
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

}