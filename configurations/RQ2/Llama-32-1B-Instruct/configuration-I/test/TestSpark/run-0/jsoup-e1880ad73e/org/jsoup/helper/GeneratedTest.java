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

public class GeneratedTest {

    public static final String TEST_INPUT_URL = "https://example.com/path?query=value#fragment";
    public static final String NULL_KEY_VALUE_PAIR = "\"key\":\"value\"";

    @Before
    public void setUp() {
        System.setOut(new PrintStream(new ByteArrayOutputStream()));
    }

    @Test
    public void testBuild() {
        Document document = Jsoup.parse(TEST_INPUT_URL, null);
        assertThat(document.text(), is("https://example.com/path?query=value#fragment"));
    }

    @Test
    public void testAppendKeyValNull() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";

        Function<Connection.KeyVal, List<String>> matcher = kv -> List.of(key, value);
        Connection.KeyVal kv = new Connection.KeyVal().add(null, null).add(key, value);

        assertThat(kv.getKey(), is("null"));
    }

    @Test
    public void testAppendKeyValEmptyList() {
        String key = "key";
        String value = "value";

        Function<Connection.KeyVal, List<String>> matcher = kv -> List.of(key, value);
        Connection.KeyVal kv = new Connection.KeyVal().add(null, null).add(key, value);

        assertThat(kv.getKey(), is("null"));
    }

    @Test
    public void testAppendKeyValEmptyPair() {
        String key = "key";
        Function<Connection.KeyVal, List<String>> matcher = kv -> List.of(key, value);
        Connection.KeyVal kv = new Connection.KeyVal().add(null, null).add(value, key);

        assertThat(kv.getKey(), is("null"));
    }

    @Test
    public void testAppendKeyValNoMatch() {
        String key = "key";
        Function<Connection.KeyVal, List<String>> matcher = kv -> List.of(key, value);
        Connection.KeyVal kv = new Connection.KeyVal().add(null, null).add(key, null);

        assertThat(kv.getKey(), is("null"));
    }

    @Test
    public void testAppendKeyValNullPair() {
        String key = "key";
        Function<Connection.KeyVal, List<String>> matcher = kv -> List.of(key, value);
        Connection.KeyVal kv = new Connection.KeyVal().add(null, null).add(value, key);

        assertThat(kv.getKey(), is("null"));
    }

    @Test
    public void testAppendKeyValNullMap() {
        String key = "key";
        Function<Connection.KeyVal, List<String>> matcher = kv -> List.of(key, value);
        Connection.KeyVal kv = new Connection.KeyVal().add(null, null).add(value, key);

        assertThat(kv.getKey(), is("null"));
    }

    public static class Connection {
        interface KeyVal {
            String getKey();

            String getValue();

            @FunctionalInterface
            default void add(String key, String value) {
            }
        }
    }

    public static class Function<T> implements java.util.function.Function<T, List<String>> {

        @Override
        public List<String> apply(T t) {
            return Collections.emptyList();
        }
    }

    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private static final PrintStream actualOut = System.out;

    @After
    public void tearDown() {
        actualOut.reset();
    }

}