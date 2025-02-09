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
public class GeneratedOutputHtml {

    @Mock
    private DocumentBuilderFactory factory;

    @Test
    public void OutputHtml() {
        List<String> expected = new ArrayList<>();
        expected.add("input[type=submit][value=Submit]");
        expected.add("div");
        expected.add("p");
        expected.add("table tr td");
        W3CDom.OutputHtml().forEach(System.out::println);
        List<String> result = W3CDom.OutputHtml();
        assertThat(result, equals(expected));
    }

}