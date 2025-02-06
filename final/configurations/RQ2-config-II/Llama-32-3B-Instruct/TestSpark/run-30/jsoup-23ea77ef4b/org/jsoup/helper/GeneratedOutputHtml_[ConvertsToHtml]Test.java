package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOutputHtml_[ConvertsToHtml]

Test {

    @Mock
    private DocumentBuilderFactory documentBuilderFactory;

    @Mock
    private DocumentBuilder documentBuilder;

    private W3CDom w3cdom = new W3CDom();

    @Before
    public void setup () {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown () {
    }

    @Test
    public void OutputHtml_[ ConvertsToHtml]Test() {
        List<String> outputHtml = w3cdom.OutputHtml();
        assertNotNull(outputHtml);
        assertTrue(outputHtml.contains("<html>"));
    }

}