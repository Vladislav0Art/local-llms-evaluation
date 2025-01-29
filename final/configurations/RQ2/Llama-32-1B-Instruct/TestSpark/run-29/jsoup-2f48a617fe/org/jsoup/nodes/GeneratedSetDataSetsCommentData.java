package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;

public class GeneratedSetDataSetsCommentData {

    private Document document;

    @Before
    public void setup() throws Exception {
        Parser parser = new Parser();
        ParseSettings parseSettings = parser.getSettings();
        parseSettings.setFormMode(Parser.FORM_MODE_COMMENT);
        document = new Document("comment.html", parseSettings, parser);
    }

    @Test
    public void setDataSetsCommentData() {
        String data = "Some updated comment data";
        Comment comment = new Comment(data);
        comment.setData(data);
        Assert.assertEquals(data, comment.getData());
    }

}