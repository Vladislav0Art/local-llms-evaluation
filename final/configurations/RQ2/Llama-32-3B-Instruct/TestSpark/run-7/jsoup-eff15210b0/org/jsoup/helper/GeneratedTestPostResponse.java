package org.jsoup.helper;

public class GeneratedTestPostResponse {

    public static Document connect(String url) throws IOException {
        return Jsoup.connect(url).get();
    }

    public static Document connectPostData(String url, String data) throws IOException {
        return Jsoup.connect(url)
                .data(data)
                .post();
    }
}

public class JsoupTests {

    @Test
    public void testPostResponse() throws IOException {
        String url = "https://www.example.com";
        String data = "key=value";
        Document document = JsoupHelper.connectPostData(url, data);
        System.out.println(document.data());
    }

}