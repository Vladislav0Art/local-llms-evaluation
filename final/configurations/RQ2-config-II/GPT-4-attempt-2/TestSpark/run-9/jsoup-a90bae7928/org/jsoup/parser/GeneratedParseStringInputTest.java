package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import javax.annotation.ParametersAreNonnullByDefault;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseStringInputTest {

    @Test
    public void parseStringInputTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse("<div></div>", "http://www.test.com");

        assertNotNull(document);
    }

}