package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testQuirksMode() {
        Document document = new Document();
        Assert.assertEquals(QuirksMode.noQuirks, document.quirksMode());
        document.quirksMode(QuirksMode.noQuirks);
        Assert.assertEquals(QuirksMode.noQuirks, document.quirksMode());
        document.quirksMode(QuirksMode.quirks);
        Assert.assertEquals(QuirksMode.quirks, document.quirksMode());
    }

    @Test
    public void testParser() {
        Parser parser = new Parser();
        Document document = new Document();
        document.parser(parser);
        Assert.assertEquals(parser, document.parser());
    }
}

@Test
public void testPrettyPrint() {
    Document document = new Document();
    Assert.assertFalse(document.outputSettings().prettyPrint());
    document.outputSettings().prettyPrint(true);
    Assert.assertTrue(document.outputSettings().prettyPrint());
}

@Test
public void testOutlineMode() {
    Document document = new Document();
    Assert.assertFalse(document.outputSettings().outline());
    document.outputSettings().outline(true);
    Assert.assertTrue(document.outputSettings().outline());
}
	}

@Test
public void testQuirksMode() {
    Document document = new Document();
    Assert.assertEquals(QuirksMode.noQuirks, document.quirksMode());
    document.quirksMode(QuirksMode.noQuirks);
    Assert.assertEquals(QuirksMode.noQuirks, document.quirksMode());
    document.quirksMode(QuirksMode.quirks);
    Assert.assertEquals(QuirksMode.quirks, document.quirksMode());
}

@Test
public void testParser() {
    Parser parser = new Parser();
    Document document = new Document();
    document.parser(parser);
    Assert.assertEquals(parser, document.parser());
}
	}

@Test
public void testConnection() {
    Connection connection = new Connection();
    Document document = new Document();
    Assert.assertNull(document.connection());
    document.connection(connection);
    Assert.assertEquals(connection, document.connection());
}

}