package org.jsoup.helper;

public class GeneratedTest {

    public static Document connect(String url) throws Exception {
        return Jsoup.connect(url).get();
    }

    public static Document connectPostData(String url, String data) throws Exception {
        return Jsoup.connect(url)
                .header("Content-Type", "application/json")
                .post(data);
    }
}

public class JsoupTests {

    @Test
    public void testGetRequest() {
        String url = "https://www.example.com";
        try {
            Document document = Jsoup.connect(url).get();
            System.out.println(document.title());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testGetResponse() throws IOException {
        String url = "https://www.example.com";
        Document document = Jsoup.connect(url).get();
        System.out.println(document.data());
    }

}