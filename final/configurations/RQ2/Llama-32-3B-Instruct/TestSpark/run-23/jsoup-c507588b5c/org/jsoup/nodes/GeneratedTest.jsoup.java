package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class GeneratedTest.

jsoup {

    private String url;

    public Tests(String url) {
        this.url = url;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data () {
        return Arrays.asList(new Object[]{"https://www.example.com", "https://www.google.com"});
    }

    @Before
    public void setUp () {
        super.setUp();
    }

    @Test
    public void test.jsoup() throws Exception {
        Document document = Jsoup.connect(url).get();
        Element[] nodes = {document.select("body").first(), document.select("html").first()};
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document.OutputSettings settings = Document.OutputSettings.builder().build();
        document.output(settings, out);
        assertTrue(out.toString().contains("text1"));
        assertTrue(out.toString().contains("text2"));
    }
}

public class AbstractTest {
    public void setUp() throws Exception {

    }

    protected void tearDown() throws Exception {

    }
}

class MockTextNode extends TextNode {
    private String text;

    @Override
    public MockTextNode(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}