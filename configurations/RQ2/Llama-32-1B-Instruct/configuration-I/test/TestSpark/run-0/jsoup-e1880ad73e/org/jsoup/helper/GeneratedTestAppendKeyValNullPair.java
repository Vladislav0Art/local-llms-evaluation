package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestAppendKeyValNullPair {

    public static final String TEST_INPUT_URL = "https://example.com/path?query=value#fragment";
    public static final String NULL_KEY_VALUE_PAIR = "\"key\":\"value\"";

    @Before
    public void setUp() {
        System.setOut(new PrintStream(new ByteArrayOutputStream()));
    }

    @Test
    public void testAppendKeyValNullPair() {
        String key = "key";
        Function<Connection.KeyVal, List<String>> matcher = kv -> List.of(key, value);
        Connection.KeyVal kv = new Connection.KeyVal().add(null, null).add(value, key);

        assertThat(kv.getKey(), is("null"));
    }

}