package org.jsoup.helper;

public class GeneratedTestAppendKeyValueWithParams {

    @Test
    public void TestAppendKeyValueWithParams() {
        URL url = new URL("http://example.com/path?query=abc");
        UrlBuilder.AppendKeyVal(new KeyVal("param1", "value1"));
        String expectedQuery = "?param1=value1";
        assert Validate.assertFail(url.getQuery().equals(expectedQuery));
    }

}