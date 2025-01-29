package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedParse_ReturnsFragmentContext {

    @Mock
    private Element contextElement;

    @Mock
    private Token commentToken;

    @Mock
    private Token characterToken;

    @Mock
    private Token endTagToken;

    @Test
    public void parse_ReturnsFragmentContext() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "test";
        Parser parser = Mockito.mock(Parser.class);
        Mockito.when(parser.parse(inputFragment)).thenReturn(new Token[]{new Token("token1"), new Token("token2")});
        Element contextElementMock = new Element("test", contextElement);
        Mockito.when(contextElementMock.getName()).thenReturn("test");
        // Act
        List<Node> fragmentList = xmlTreeBuilder.parseFragment(inputFragment, "test", "test").insert(contextElementMock).parse("test");
        // Assert
        assertEquals(2, fragmentList.size());
    }

}