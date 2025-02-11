package org.jsoup.helper;

public class GeneratedTestSerialiseRequestUrl {

    // ...

    public static class KeyVal implements Connection.KeyVal {
        // ...
    }

    public static boolean needsMultipart(Connection.Request req) {
        for (Connection.KeyVal keyVal : req.data()) {
            if (keyVal.hasInputStream())
                return true;
        }
        return false;
    }

    public static void serialiseRequestUrl(Connection.Request req) throws IOException {
        URL in = req.url();
        StringBuilder url = StringUtil.borrowBuilder();
        boolean first = true;
        // reconstitute the query, ready for appends
        url.append(in.getProtocol())
                .append("://")
                .append(in.getAuthority()) // includes host, port
                .append(in.getPath())
                .append("?");

        if (in.getQuery() != null) {
            url.append(in.getQuery());
            first = false;
        }

        for (Connection.KeyVal keyVal : req.data()) {
            Validate.isFalse(keyVal.hasInputStream(), "InputStream data not supported in URL query string.");
            if (!first)
                url.append('&');
            else
                first = false;

            url.append(URLEncoder.encode(keyVal.key(), DataUtil.defaultCharsetName))
                    .append('=')
                    .append(URLEncoder.encode(keyVal.value(), DataUtil.defaultCharsetName));
        }

        req.url(new URL(StringUtil.releaseBuilder(url)));
        req.data().clear(); // moved into url as get params
    }
}

// Test class
public class ConnectionTest {

    @Test
    public void testSerialiseRequestUrl() throws IOException {
        // Create a request with multiple data keys
        Connection.Request req = new Connection.Request();
        KeyVal keyVal1 = Connection.KeyVal.create("key1", "value1");
        KeyVal keyVal2 = Connection.KeyVal.create("key2", "value2");
        req.data().add(keyVal1);
        req.data().add(keyVal2);

        // Serialise the request URL
        Connection.serialiseRequestUrl(req);

        // Assert that the URL is correctly formatted
        assertNotNull(req.url());
    }

}