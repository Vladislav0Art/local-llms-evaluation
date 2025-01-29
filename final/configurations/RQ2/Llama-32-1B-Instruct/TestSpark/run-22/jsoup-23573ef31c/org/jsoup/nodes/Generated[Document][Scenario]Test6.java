package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class Generated[Document][Scenario]

Test6 {

    @Test
    public void [Document][Scenario]Test6() {
        // Create a new Document instance with default charset
        Document document = createShell("http://example.com");

        // Create an empty connection and verify its behavior
        Connection connection = document.connection();
        assert connection.equals(mock(Connection.class));
    }

}