package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isEmptyString;
import static org.jsoup.nodes.Document.parse;
import static org.jsoup.nodes.DocumentBuilderFactory.newInstance;
import static org.jsoup.select.Selector.empty;
import static org.jsoup.select.Selector.select;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOutputXml {

    @Mock
    private DocumentBuilderFactory factory;

    @Test
    public void OutputXml() {
        List<String> expected = new ArrayList<>();
        expected.add("<input type=\"submit\" value=\"Submit\">");
        expected.add("<div></div>");
        expected.add("<p>Hello World!</p>");
        expected.add("<table><tr><td>Cell 1</td><td>Cell 2</td></tr></table>");
        W3CDom.OutputXml().forEach(System.out::println);
        List<String> result = W3CDom.OutputXml();
        assertThat(result, equals(expected));
    }

}