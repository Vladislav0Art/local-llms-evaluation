package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTitleSetAndGet {

    @Test
    public void titleSetAndGet() {
        Document document = new Document("");
        String title = "Example Title";
        document.title(title);
        assert document.title().equals(title);
    }

}