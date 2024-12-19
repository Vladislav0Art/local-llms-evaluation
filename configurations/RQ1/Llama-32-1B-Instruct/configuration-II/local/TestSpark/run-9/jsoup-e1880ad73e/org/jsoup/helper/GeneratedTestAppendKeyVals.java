package org.jsoup.helper;

public class GeneratedTestAppendKeyVals {

    @Test
    public void TestAppendKeyVals() {
        URL url = new URL("http://example.com/path?query=abc");
        UrlBuilder.AppendKeyVal(new KeyVal("key1", "value1"));
        UrlBuilder.AppendKeyVal(new KeyVal("param2", "value2"));
        String expectedQuery = "?key1=value1&param2=value2";
        assert Validate.assertFail(url.getQuery().equals(expectedQuery));
    }

}