package org.jsoup.safety;

import org.jdom2.IllegalDataException;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addProtocols("a", "href", "http", "https");
        safelist.removeProtocols("a", "href", "http");
        Document document = Document.createShell("");
        document.append("<html><head></head><body><a href=\"http://google.com\"></a></body></html>");
        Assert.assertFalse(new StringUtil().isBlank(document.toString()));
    }

}