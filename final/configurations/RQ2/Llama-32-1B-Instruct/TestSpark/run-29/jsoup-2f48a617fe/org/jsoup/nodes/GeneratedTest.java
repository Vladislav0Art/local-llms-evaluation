package org.jsoup.nodes;

public class GeneratedTest {

    private Document document, comment1;
    private Comment comment2;

    @Before
    public void setup() throws Exception {
        Parser parser = new Parser();
        ParseSettings parseSettings = parser.getSettings();
        parseSettings.setFormMode(Parser.FORM_MODE_COMMENT);
        document = new Document(), comment1 = new Comment(), comment2 = new Comment();
    }

}