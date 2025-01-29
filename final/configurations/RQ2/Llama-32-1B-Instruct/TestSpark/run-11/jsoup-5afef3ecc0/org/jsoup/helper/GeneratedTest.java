package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;

public class GeneratedTest {

    private static UrlBuilder urlBuilder = new UrlBuilder();

    @Test
    public void testBuild() {
        URLBuilder.UrlBuilderTest(urlBuilder, "key1=value1", "key2=value2");
        assertEquals("https://www.example.com", urlBuilder.build().toString());
    }

    @Test
    public void testAppendKeyVal() throws Exception {
        String[] kvArray = {"key1", "value1"};
        assertEquals("key1=value1", urlBuilder.appendKeyVal(kvArray));
    }

    @Test
    public void testAppendKeyVal_MalformedURL() throws Exception {
        URLBuilder.UrlBuilderTest(urlBuilder, null, "key2=value2");
        assertEquals(null, urlBuilder.appendKeyVal(null));
    }

    public String appendKeyVal(String[] kvArray) {
        return urlBuilder.appendKeyVal(kvArray);
    }
}

@Test
public void testUrl() {
    URLBuilder.UrlBuilderTest(urlBuilder, "key1=value1", "key2=value2");
    assertEquals("https://www.example.com", urlBuilder.build().toString());
}

@Test
public void testMalformedURL() {
    URLBuilder.UrlBuilderTest(urlBuilder, null, "key2=value2");
    assertNull(urlBuilder.appendKeyVal(null));
}
		}

class UrlBuilder {

    public String appendKeyVal(String[] kvArray) {
        // build the url and return it
        // implement the logic here
        return "";
    }

    public void testBuild() {
        URLBuilder.UrlBuilderTest(this, "key1=value1", "key2=value2");
    }

}