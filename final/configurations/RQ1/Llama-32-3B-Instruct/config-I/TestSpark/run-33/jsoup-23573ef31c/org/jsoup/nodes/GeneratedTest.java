package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testDocument() {
        //Arrange
        Connection connection = new Connection();
        Parser parser = new Parser();
        OutputSettings outputSettings = new OutputSettings();

        //Act
        Document document = new Document(connection, parser, outputSettings);

        //Assert
        assertNotNull(document);
        assertEquals(parser, document.parser());
    }

    @Test
    public void testOutputSettings() {
        //Arrange
        Connection connection = new Connection();
        Parser parser = new Parser();
        OutputSettings outputSettings = new OutputSettings();

        //Act
        Document document = new Document(connection, parser, outputSettings);

        //Assert
        assertNotNull(outputSettings);
        assertSame(outputSettings, document.outputSettings());
    }
}

@Test
public void testNewRequest() {
    //Arrange
    Connection connection = new Connection();

    //Act
    Connection request = connection.newRequest();

    //Assert
    assertNotNull(request);
}

@Test
public void testConnectionIsNotNull() {
    //Arrange
    Connection connection = new Connection();

    //Act
    assertNot null (connection);
}
	}

@Test
public void testNewParser() {
    //Arrange

    //Act
    Parser parser = new Parser();

    //Assert
    assertNotNull(parser);
}

@Test
public void testParserIsNotNull() {
    //Arrange
    Parser parser = new Parser();

    //Act
    assertNot null (parser);
}
	}

@Test
public void testNewOutputSettings() {
    //Arrange

    //Act
    OutputSettings outputSettings = new OutputSettings();

    //Assert
    assertNotNull(outputSettings);
}

@Test
public void testEscapeModeIsNotNull() {
    //Arrange
    OutputSettings outputSettings = new OutputSettings();

    //Act
    assertNot null (outputSettings.escapeMode());
}

}