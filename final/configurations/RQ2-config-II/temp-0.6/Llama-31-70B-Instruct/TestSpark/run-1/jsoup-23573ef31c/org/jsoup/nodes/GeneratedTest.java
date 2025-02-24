package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Assert;

public class GeneratedTest {

    @Test
    public void createShellTest1() {
        String baseUri = "http://www.example.com";
        Document document = Document.createShell(baseUri);
        Assert.assertEquals(baseUri, document.baseUri());
    }

    @Test
    public void createShellTest2() {
        String baseUri = "";
        Document document = Document.createShell(baseUri);
        Assert.assertEquals(baseUri, document.baseUri());
    }

    @Test
    public void locationTest1() {
        String baseUri = "http://www.example.com";
        Document document = Document.createShell(baseUri);
        Assert.assertEquals(baseUri, document.location());
    }

    @Test
    public void locationTest2() {
        String baseUri = "";
        Document document = Document.createShell(baseUri);
        Assert.assertEquals(baseUri, document.location());
    }

    @Test
    public void connectionTest1() {
        Connection connection = Mockito.mock(Connection.class);
        Document document = Document.createShell("http://www.example.com");
        document.connection(connection);
        Assert.assertEquals(connection, document.connection());
    }

}