package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedCharset_setsCharsetCorrectly {

    @Test
    public void charset_setsCharsetCorrectly() {
        Charset charset = Charset.forName("UTF-8");
        Document document = new Document("http://example.com");
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

}