package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doThrow;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsXmlDeclaration_isFalse_forInvalidData {

    private Appendable accum = new StringBuilder();

    @Test
    public void isXmlDeclaration_isFalse_forInvalidData() {
        String data = "";
        Comment(comment, accum);
        assertFalse(isXmlDeclaration(data));
    }

    private XmlDeclaration asXmlDeclaration() throws IOException {
        String fragment = "#Hello World!";
        Document doc = Parser.htmlParser().settings(ParseSettings.preserveCase).parseInput(fragment, null);
        return new XmlDeclaration(doc.body().child(0).tagName());
    }

}