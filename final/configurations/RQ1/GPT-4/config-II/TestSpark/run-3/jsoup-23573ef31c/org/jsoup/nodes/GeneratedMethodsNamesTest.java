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

public class GeneratedMethodsNamesTest {

    @Test
    public void methodsNamesTest() {
        Document document = new Document("http://google.com");
        document.methods.shouldNotStartWith("$");
        document.methods.shouldNotStartWith("clone");
        document.methods.shouldNotStartWith("finalize");
        document.methods.shouldNotStartWith("notify");
        document.methods.shouldNotStartWith("notifyAll");
        document.methods.shouldNotStartWith("wait");
        document.methods.shouldNotStartWith("equals");
        document.methods.shouldNotStartWith("toString");
        document.methods.shouldNotStartWith("hashCode");
        document.methods.shouldNotStartWith("getClass");
    }

}