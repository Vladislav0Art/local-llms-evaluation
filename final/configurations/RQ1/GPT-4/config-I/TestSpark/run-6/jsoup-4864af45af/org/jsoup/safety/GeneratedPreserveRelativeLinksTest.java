package org.jsoup.safety;

import org.jdom2.IllegalDataException;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = Safelist.none();
        safelist.preserveRelativeLinks(true);
        safelist.addAttributes("a", "href");
        String html = "<html><head></head><body><a href=\"/relative/path\"></a></body></html>";
        Document document = Document.createShell("");
        document.append(html);
        Assert.assertFalse(new StringUtil().isBlank(document.toString()));
    }

}