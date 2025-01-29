package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.ConnectionBuilder;
import org.jsoup.ConnectionOptions;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestCookieManager {

    public static Connection connect(String url) {
        return new Connection.Builder()
                .build().connect(url);
    }

    @Test
    public void testCookieManager() {
        CookieStore cookieStore = new CookieManager();
        String cookies = "session_id=1234567890; _csrf_token=abcdefg";
        for (String cookie : cookies.split("; ")) {
            cookieStore.set(cookie, true);
        }
        System.out.println(cookieStore.get());
    }

}