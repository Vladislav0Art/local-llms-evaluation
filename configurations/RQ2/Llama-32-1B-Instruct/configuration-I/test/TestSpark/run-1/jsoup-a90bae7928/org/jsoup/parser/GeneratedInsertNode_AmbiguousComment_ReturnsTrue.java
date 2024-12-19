package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.XmlTreeBuilder;
import org.mockito.Mockito;

public class GeneratedInsertNode_AmbiguousComment_ReturnsTrue {

    @Test
    public void insertNode_AmbiguousComment_ReturnsTrue() {
        // Arrange
        String input = "token";
        Parser parser = Mockito.mock(Parser.class);

        // Act
        xmlTreeBuilder.insertNode(new Token(input, false));
        List<Node> list = xmlTreeBuilder.parseFragment("", "", parser);
        for (Node node : list) {
            if (!(node instanceof Comment)) {
                return;
            }
        }

        // Assert
    }

}