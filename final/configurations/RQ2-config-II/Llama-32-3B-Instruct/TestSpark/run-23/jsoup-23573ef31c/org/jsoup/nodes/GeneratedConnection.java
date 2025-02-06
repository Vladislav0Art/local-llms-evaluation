package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class GeneratedConnection {

    @Test
    public void connection() {
        Connection connection = Jsoup.connect("https://www.example.com");
        Document document = Document.createShell(connection.getUri());
        Connection expectedConnection = mock(Connection.class);
        document.connection(expectedConnection);
        assertThat(document.connection(), is(expectedConnection));
    }

}