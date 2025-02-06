package org.jsoup.nodes;

public class GeneratedConnection_[MethodUnderTest](Scenario)

_Test {

    @Test
    public void connection_[ MethodUnderTest](Scenario) _Test() {
        Connection connection = new Connection();
        Document document = Document.createShell("https://www.example.com").connection(connection);
        assertEquals(connection, document.connection());
    }

}