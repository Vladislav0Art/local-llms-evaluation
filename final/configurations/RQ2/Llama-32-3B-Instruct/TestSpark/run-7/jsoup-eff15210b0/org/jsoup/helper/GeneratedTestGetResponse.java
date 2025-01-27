package org.jsoup.helper;

public class GeneratedTestGetResponse {

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
    public void testGetResponse() throws IOException {
        String url = "https://www.example.com";
        Document document = JsoupHelper.connect(url);
        System.out.println(document.data());
    }

}