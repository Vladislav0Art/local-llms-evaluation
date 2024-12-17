package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTest {

    public static String getAnchorUrl(String url, int anchorIndex) {
        return url.replace("#anchor", "") + "#" + anchorIndex;
    }

}