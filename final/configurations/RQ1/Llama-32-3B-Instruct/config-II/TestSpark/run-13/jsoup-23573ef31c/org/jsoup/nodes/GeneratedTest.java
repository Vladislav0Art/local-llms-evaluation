package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testDocument() {
        // Arrange
        Parser parser = new Parser();
        Connection connection = new Connection();

        // Act
        Document document = new Document().parser(parser).connection(connection);

        // Assert
        assertNotNull(document);
    }
}

@Test
public void testQuirksMode() {
    QuirksMode quirksMode = QuirksMode.noQuirks;
    assertEquals(QuirksMode.noQuirks, quirksMode);
}

@Test
public void testLimitedQuirksMode() {
    QuirksMode quirksMode = QuirksMode.limitedQuirks;
    assertEquals(QuirksMode.limitedQuirks, quirksMode);
}
	}

@Test
public void testPrettyPrint() {
    OutputSettings outputSettings = new OutputSettings().prettyPrint(true).indentAmount(4).maxPaddingWidth(30);
    assertTrue(outputSettings.prettyPrint());
}

@Test
public void testOutlineMode() {
    OutputSettings outputSettings = new OutputSettings().outline(true);
    assertTrue(outputSettings.outline());
}
	}

@Test
public void testQuirksMode() {
    Document document = new Document();
    document.quirksMode(QuirksMode.noQuirks);
    assertEquals(QuirksMode.noQuirks, document.quirksMode());
}

@Test
public void testLimitedQuirksMode() {
    Document document = new Document();
    document.quirksMode(QuirksMode.limitedQuirks);
    assertEquals(QuirksMode.limitedQuirks, document.quirksMode());
}
	}

@Test
public void testParser() {
    Parser parser = new Parser();
    Document document = new Document().parser(parser);
    assertNotNull(document);
}

}