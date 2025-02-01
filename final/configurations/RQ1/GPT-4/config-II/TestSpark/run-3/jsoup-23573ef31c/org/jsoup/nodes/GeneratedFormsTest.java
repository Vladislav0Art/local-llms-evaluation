package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.DataUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        Document document = Jsoup.parse("<form id='form1'><input name='name1' value='value1'/></form> <form id='form2'><input name='name2' value='value2'/></form>");
        List forms = document.forms();
        assertTrue(forms.size() == 2);
    }

}