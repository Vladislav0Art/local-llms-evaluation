package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateShell_EqualReturnsSameDocument {

    @Mock
    private Connection connection;

    @Test
    public void createShell_EqualReturnsSameDocument() {
        Document document1 = Document.createShell("https://www.example.com");
        Document document2 = Document.createShell("https://www.example.com");
        org.junit.Assert.assertEquals(document1, document2);
    }

}