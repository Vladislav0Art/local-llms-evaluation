package org.jsoup.helper;

public class GeneratedTest {

    private static class Test {
        public void testUrlBuildingWithKeyAndValue() throws URISyntaxException, Exception {
            String uri = "http://localhost:8080/resource";
            Connection.KeyVal kv = new Connection.KeyVal("key", "value");

            URI result = Connection.Connection.buildUri(uri, kv);

            System.out.println(result.getScheme());
            System.out.println(result.toString().replace("key=value", ""));
        }
    }

    public static class UriBuilderTest {
        @BeforeAll
        public static void setup() throws URISyntaxException, Exception {
            // no-op
        }

    }