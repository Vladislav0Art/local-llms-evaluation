package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        Document doc = Jsoup.parse("<form id='form1'><input name='a' value='1'/></form><form id='form2'><input name='b' value='2'/></form>");
        List<FormElement> forms = doc.forms();
        assertEquals(2, forms.size());
    }

}