package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedParse_ReturnsFragmentList {

    @Mock
    private Element contextElement;

    @Mock
    private Token commentToken;

    @Mock
    private Token characterToken;

    @Mock
    private Token endTagToken;

    @Test
    public void parse_ReturnsFragmentList() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "test";
        Parser parser = Mockito.mock(Parser.class);
        Mockito.when(parser.parse(inputFragment)).thenReturn(new List<Node>() {{
            add(new Node("element1"));
            add(new Node("element2"));
        }});
        // Act
        List<Node> fragmentList = xmlTreeBuilder.parseFragment(inputFragment, "test", "test").insert(contextElement).parse("test");
        // Assert
        assertEquals(2, fragmentList.size());
    }

}