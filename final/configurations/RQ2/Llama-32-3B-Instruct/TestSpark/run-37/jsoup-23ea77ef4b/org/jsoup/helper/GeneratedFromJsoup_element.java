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
public class GeneratedFromJsoup_element {

    @Mock
    private DocumentBuilderFactory factory;

    @Test
    public void fromJsoup_element() {
        Element element = select("div", parse("<html><body><div>Hello World!</div></body></html>"));
        Document expected = parse("<html><body><div>Hello World!</div></body></html>");
        Document result = W3CDom.fromJsoup(element);
        assertThat(result.toString(), equals(expected.toString()));
    }

}