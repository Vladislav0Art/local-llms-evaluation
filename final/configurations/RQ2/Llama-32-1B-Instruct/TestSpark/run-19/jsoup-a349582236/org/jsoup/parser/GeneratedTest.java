package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;

public class GeneratedTest {

    public static String getPublicTag(String tag) {
        return Jsoup.parse(tag).tag();
    }

    public static boolean setSelfClosing(boolean selfClosing) {
        return selfClosing;
    }
}

}