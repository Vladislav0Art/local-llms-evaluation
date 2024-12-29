package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;

import javax.annotation.Nullable;

public class GeneratedConnection_[EmptyConnection]

Test {

    @Test
    public void connection_[ EmptyConnection]Test() {
        Connection connection = Jsoup.connect();
        Document document = Document.connection(connection);
        assertNotNull(document);
        assertEquals(connection, document.connection());
    }

}