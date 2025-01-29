package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void [Document][Scenario]

    Test() {
        // Create a Document instance
        Document document = new Document("http://example.com");

        // Add an element to the Document
        Element element = document.createElement("html");
        document.appendChild(element);

        // Check if the method exists and returns expected results
    }

    @Test
    public void [Document][Scenario]

    Test1() {
        // Create a new Document instance with default charset
        Document document = createShell("http://example.com");

        // Assert the document has the correct charset
        assert document.charset().equals(Charset.forName("utf-8"));

        // Create an empty connection and verify its behavior
        Connection connection = document.connection();
        assert connection.equals(mock(Connection.class));
    }

    @Test
    public void [Document][Scenario]

    Test2() {
        // Create a Document instance with default charset
        Document document = createShell("http://example.com");

        // Update the meta charset element of the Document
        document.updateMetaCharsetElement(true);
        assert document.charset().equals(Charset.forName("utf-8"));

        // Verify that the update method returns true for both methods
    }

    @Test
    public void [Document][Scenario]

    Test3() {
        // Create a new Document instance with default charset
        Document document = createShell("http://example.com");

        // Create an empty connection and verify its behavior
        Connection connection = document.connection();
        assert connection.equals(mock(Connection.class));

        // Add an element to the Document
        Element element = document.createElement("html");
        document.appendChild(element);

        // Check if the method exists and returns expected results
    }

    @Test
    public void [Document][Scenario]

    Test4() {
        // Create a new Document instance with default charset
        Document document = createShell("http://example.com");

        // Get the output settings of the Document
        OutputSettings outputSettings = document.outputSettings();
        assert outputSettings.equals(mock(OutputSettings.class));

        // Update the meta charset element of the Document
        document.updateMetaCharsetElement(true);
        assert document.outputSettings().equals(mock(OutputSettings.class));
    }

    @Test
    public void [Document][Scenario]

    Test5() {
        // Create a new Document instance with default charset
        Document document = createShell("http://example.com");

        // Get the quirks mode of the Document
        QuirksMode quirksMode = document.quirksMode();
        assert quirkMode.equals(mock(QuirksMode.class));
    }

    @Test
    public void [Document][Scenario]

    Test6() {
        // Create a new Document instance with default charset
        Document document = createShell("http://example.com");

        // Create an empty connection and verify its behavior
        Connection connection = document.connection();
        assert connection.equals(mock(Connection.class));
    }

}