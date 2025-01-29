package org.jsoup.helper;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestAppendKeyVal_KV_URLDecoder {

    @Mock
    private Connection.KeyVal mockKv;

    @Mock
    private URLDecoder mockDecoder;

    @Test
    public void testAppendKeyVal_KV_URLDecoder() throws UnsupportedEncodingException {
        String inputString = "https://example.com/path/to/resource?param1=value1&param2=value2";
        UrlBuilder urlBuilder = new UrlBuilder(inputString);
        URL result = urlBuilder.build();
        assertNotEquals(null, result);
    }

    private URL build(String inputUrl) throws MalformedURLException {
        String[] parts = inputUrl.split("://");
        URI uri = new URI(parts[0], null, parts[1], null, null);

        Pattern pattern = Pattern.compile("^([a-zA-Z]+)(\\?[a-zA-Z_=]+)?$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(uri.getScheme());
        if (matcher.find()) {
            return new URL(uri.getScheme(), uri.getAuthority(), matcher.group(1), matcher.group(2));
        } else {
            return urlBuilder.build(inputUrl);
        }
    }

}