package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class GeneratedCharset {

    @Test
    public void charset() {
        Charset expectedCharset = Charset.forName("UTF-8");
        Document document = new Document("");
        Charset actualCharset = document.charset();
        assertThat(actualCharset, is(expectedCharset));
    }

}