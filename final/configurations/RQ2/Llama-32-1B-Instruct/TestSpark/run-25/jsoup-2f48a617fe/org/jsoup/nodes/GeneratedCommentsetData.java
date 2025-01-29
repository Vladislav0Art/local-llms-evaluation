package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedCommentsetData {

    public static void main(String[] args) {
        TestSpark spark = new TestSpark();
        runTest(spark);
    }

    @Before
    public static void setup() throws Exception {
        ParseSettings settings = new ParseSettings();
        Parser parser = new Parser(settings);
        Document document = parser.parse("<comment>This is a test</comment>");
        comment = new Comment("This is a test");
        comment.setData(document.body().data());
    }

    @Test
    public void commentsetData() {
        comment.setData("This is a test");
        assertEquals("This is a test", comment.getData());
    }

}