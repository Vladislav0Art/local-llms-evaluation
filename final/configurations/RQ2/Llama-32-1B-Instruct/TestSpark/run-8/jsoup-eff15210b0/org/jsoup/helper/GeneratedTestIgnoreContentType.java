package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.ConnectionBuilder;
import org.jsoup.ConnectionOptions;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestIgnoreContentType {

    public static Connection connect(String url) {
        return new Connection.Builder()
                .build().connect(url);
    }

    @Test
    public void testIgnoreContentType() {
        CookieStore cookieStore = new CookieManager();
        String cookies = "session_id=1234567890; _csrf_token=abcdefg";
        for (String cookie : cookies.split("; ")) {
            cookieStore.set(cookie, true);
        }
        try {
            connection = new HttpConnection("https://www.example.com");
            connection.execute();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}