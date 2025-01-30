package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tokeniser;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class GeneratedProcessTokenTest {

    @Test
    public void processTokenTest() {
        Parser parser = Parser.xmlParser();
        String data = "<root></root>";
        Tokeniser tokeniser = new Tokeniser(new StringReader(data), ParseErrorList.tracking(1));
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse(new StringReader(data), "", parser);

        while (tokeniser.current() != null) {
            treeBuilder.process(tokeniser.read());
        }

        assertTrue(true);
    }

}