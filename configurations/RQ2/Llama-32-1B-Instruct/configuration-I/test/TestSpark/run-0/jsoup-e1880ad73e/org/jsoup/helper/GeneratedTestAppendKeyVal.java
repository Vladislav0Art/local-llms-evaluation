package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestAppendKeyVal {

    public static final String TEST_INPUT_URL = "https://example.com/path?query=value#fragment";
    public static final String NULL_KEY_VALUE_PAIR = "\"key\":\"value\"";

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        Function<Connection.KeyVal, List<String>> matcher = kv -> List.of(key, value);
        Connection.KeyVal kv = new Connection.KeyVal().add(key, value).add("anotherValue");
        assertThat(kv.getKey(), is(key));
        assertThat(kv.getValue(), is(value));
        assertThat(new StringBuilder(kv.getKey()).append("=").append(kv.getValue()).toString(), is(key + "=" + value));
    }

}