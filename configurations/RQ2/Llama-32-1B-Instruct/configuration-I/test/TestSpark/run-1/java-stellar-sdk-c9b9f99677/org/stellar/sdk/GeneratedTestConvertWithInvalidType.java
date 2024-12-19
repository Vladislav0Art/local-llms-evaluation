package org.stellar.sdk;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import okhttp3.HttpUrl;

public class GeneratedTestConvertWithInvalidType {

    private static final AccountConverter<String, Long> accountConverter = new AccountConverter<>();

    @Test
    public void testConvertWithInvalidType() throws Exception {
        Transaction transaction = new Transaction();
        Map<String, Long> data = new HashMap<>();
        data.put("key", 123L);

        try {
            accountConverter.convert(data); // this will cause a compiler error
        } catch (PrepareTransactionException e) {
            throw new RuntimeException(e);
        }
    }

}