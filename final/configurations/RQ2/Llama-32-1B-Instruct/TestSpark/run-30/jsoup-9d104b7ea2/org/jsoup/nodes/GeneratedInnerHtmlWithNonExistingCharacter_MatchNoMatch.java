package org.jsoup.nodes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GeneratedInnerHtmlWithNonExistingCharacter_MatchNoMatch {

    @Before
    public void setup() {
        document = new Document();
        parent = document.newAppendable();
    }

    @After
    public void tearDown() {
        parent.clear();
    }

    public static void main(String[] args) throws Exception {
        TestSparkRunner runner = new TestSparkRunner(new org.jsoup.nodes.Document());
        runner.start();
    }

    @Test
    public void innerHtmlWithNonExistingCharacter_MatchNoMatch() {
        String text = "Hello, World!";
        TestSparkRunner runner = new TestSparkRunner(new Document(), new org.jsoup.nodes.Document());
        runner.start();
        node = (TextNode) runner.evaluate("Hello, World!", 0);
        assertEquals("", node.innerHtml());
    }

}