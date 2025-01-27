package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNewInstance_ReturnsNewInstance {

    @Mock
    private Reader inputReader;

    @Mock
    private String baseUri;

    @Mock
    private Parser parser;

    @Test
    public void newInstance_ReturnsNewInstance() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        XmlTreeBuilder newXmlTreeBuilder = xmlTreeBuilder.newInstance();
        boolean result = objectEquals(newXmlTreeBuilder, null);
        assertThat(result, is(true));
    }
}

class ObjectEqualsHelper {

    public static boolean objectEquals(Object obj1, Object obj2) {
        return obj1 == obj2;
    }

}