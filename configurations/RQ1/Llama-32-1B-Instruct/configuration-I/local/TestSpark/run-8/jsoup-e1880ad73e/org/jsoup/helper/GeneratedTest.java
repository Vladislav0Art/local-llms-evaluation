package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void TestAppendKeyVal() {
        String[] inputs = {"key1=value1", "key2=value2"};
        for (String input : inputs) {
            UrlBuilder urlBuilder = new UrlBuilder(new URL(input));
            urlBuilder.appendKeyVal(Connection.KeyVal.of("key1", "value1"));
            urlBuilder.appendKeyVal(Connection.KeyVal.of("key2", "value2"));
        }

        // assertions
    }

    @Test
    public void TestAppendKeyValNoQuery() {
        String[] inputs = {"key1=value1", "key2=value2"};
        for (String input : inputs) {
            UrlBuilder urlBuilder = new UrlBuilder(new URL(input));
            urlBuilder.appendKeyVal(Connection.KeyVal.of("key1", "value1"));
            urlBuilder.appendKeyVal(Connection.KeyVal.of("key2", "value2"));
        }

        // assertions
    }

    @Test
    public void TestAppendKeyValWithNonAscii() {
        String[] inputs = {"key%20is a test", "key2=value2"};
        for (String input : inputs) {
            UrlBuilder urlBuilder = new UrlBuilder(new URL(input));
            urlBuilder.appendKeyVal(Connection.KeyVal.of("key1", "value1"));
            urlBuilder.appendKeyVal(Connection.KeyVal.of("key2", "value2"));
        }

        // assertions
    }

    @Test
    public void TestAppendQuery() {
        String[] inputs = {"http://example.com/path%20with%20spaces", "http://example.com/path%2Bwith%20special%20characters"};
        for (String input : inputs) {
            UrlBuilder urlBuilder = new UrlBuilder(new URL(input));
            urlBuilder.appendKeyVal(Connection.KeyVal.of("key1", "value1"));
            // assertions
        }
    }

    @Test
    public void TestAppendRef() {
        String[] inputs = {"http://example.com/path#with#spaces", "http://example.com/path%23with%20special%20characters"};
        for (String input : inputs) {
            UrlBuilder urlBuilder = new UrlBuilder(new URL(input));
            urlBuilder.appendKeyVal(Connection.KeyVal.of("key1", "value1"));
            // assertions
        }
    }

    @Test
    public void TestAppendUri() throws MalformedURLException, URISyntaxException {
        String[] inputs = {"http://example.com/path?query=abc&fragment=def", "http://example.com/path#with#spaces"};
        for (String input : inputs) {
            UrlBuilder urlBuilder = new UrlBuilder(new URL(input));
            // assertions
        }
    }

    @Test
    public void TestBuild() {
        String[] inputs = {"http://example.com/path?query=abc", "http://example.com/path#with#spaces"};
        for (String input : inputs) {
            UrlBuilder urlBuilder = new UrlBuilder(new URL(input));
            // assertions
        }
    }

    @Test
    public void TestBuildNoQuery() throws MalformedURLException, URISyntaxException {
        String[] inputs = {"http://example.com/path", "http://example.com/path#with#spaces"};
        for (String input : inputs) {
            UrlBuilder urlBuilder = new UrlBuilder(new URL(input));
            // assertions
        }
    }

    @Test
    public void TestBuildWithQuery() throws MalformedURLException, URISyntaxException {
        String[] inputs = {"http://example.com/path?query=abc", "http://example.com/path#with#spaces"};
        for (String input : inputs) {
            UrlBuilder urlBuilder = new UrlBuilder(new URL(input));
            // assertions
        }
    }

    @Test
    public void TestBuildWithFragment() throws MalformedURLException, URISyntaxException {
        String[] inputs = {"http://example.com/path?query=abc&fragment=def", "http://example.com/path#with#spaces"};
        for (String input : inputs) {
            UrlBuilder urlBuilder = new UrlBuilder(new URL(input));
            // assertions
        }
    }

    @Test
    public void TestBuildWithRef() throws MalformedURLException, URISyntaxException {
        String[] inputs = {"http://example.com/path?query=abc&ref=def", "http://example.com/path#with#spaces"};
        for (String input : inputs) {
            UrlBuilder urlBuilder = new UrlBuilder(new URL(input));
            // assertions
        }
    }

}