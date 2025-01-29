package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.util.function.Supplier;

public class GeneratedGetData_test {

    @Test
    public void getData_test() {
        Document document = new Document();
        document.appendChild(new Comment("This is a test"));
        Supplier<String> getter = () -> (String) getComment().getData();
        assertEquals("test", getter.get());
    }

}