package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Tag;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;

public class GeneratedCharset_CharsetUpdatedCorrectly {

    @Test
    public void charset_CharsetUpdatedCorrectly() {
        // Given
        Charset charset = Charset.forName("UTF-8");

        // When
        Document document = new Document("https://www.example.com");
        document.charset(charset);

        // Then
        assertEquals(charset, document.charset());
    }

}