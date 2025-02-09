package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import javax.annotation.ParametersAreNonnullByDefault;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedProcessTest {

    @Test
    public void processTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        boolean result = xmlTreeBuilder.process(new Token.StartTag());

        assertTrue(result);
    }

}