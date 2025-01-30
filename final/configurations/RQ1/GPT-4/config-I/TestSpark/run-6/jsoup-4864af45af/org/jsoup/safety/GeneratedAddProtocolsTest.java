package org.jsoup.safety;

import org.jdom2.IllegalDataException;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addProtocols("a", "href", "http", "https");
        String html = "<html><head></head><body><a href=\"http://google.com\"></a></body></html>";
        Document document = Document.createShell("");
        document.append(html);
        Assert.assertFalse(new StringUtil().isBlank(document.toString()));
    }

}