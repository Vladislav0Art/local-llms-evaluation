package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class GeneratedAppendTest {

    private static final String TEST_TAG = "p";
    private static final String TEST_ID = "testID";
    private static final String TEST_ATTRIBUTE_KEY = "testAttribute";
    private static final String TEST_ATTRIBUTE_VALUE = "testValue";
    private static final String TEST_BASE_URI = "http://test.com";
    private static final String TEST_HTML = "<div></div>";
    private static final String TEST_TEXT = "testText";

    @Test
    public void appendTest() {
        Element element = new Element(Tag.valueOf(TEST_TAG), TEST_BASE_URI, new Attributes());
        element.append(TEST_HTML);
        Assert.assertEquals(TEST_HTML, element.html());
    }

}