package org.jsoup.helper;

public class GeneratedTestAppendKeyValue {

    @Test
    public void TestAppendKeyValue() {
        URL url = new URL("http://example.com/path?query=abc");
        UrlBuilder.AppendKeyVal(new KeyVal("key1", "value1"));
        String expectedQuery = "?key1=value1";
        assert Validate.assertFail(url.getQuery().equals(expectedQuery));
    }

}