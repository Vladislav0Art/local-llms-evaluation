package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("Hello World!");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings();

        try {
            comment.outerHtmlHead(sb, 0, outputSettings);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }