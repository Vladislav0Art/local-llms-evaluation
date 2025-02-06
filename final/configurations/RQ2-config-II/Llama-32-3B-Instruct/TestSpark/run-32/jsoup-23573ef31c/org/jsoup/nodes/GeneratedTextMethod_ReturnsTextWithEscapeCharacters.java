package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;

public class GeneratedTextMethod_ReturnsTextWithEscapeCharacters {

    @Test
    public void textMethod_ReturnsTextWithEscapeCharacters() {
        Document document = Document.createShell("http://example.com");
        String text = document.text("<script>alert('test')</script>");
        assertEquals("&lt;script&gt;alert(&#39;test&#39;)&lt;/script&gt;", text);
    }

}