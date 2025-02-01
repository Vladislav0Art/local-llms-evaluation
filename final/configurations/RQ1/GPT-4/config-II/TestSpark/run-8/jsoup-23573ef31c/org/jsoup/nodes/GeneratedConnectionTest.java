package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.FormElement;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.util.List;
import javax.annotation.Nullable;

public class GeneratedConnectionTest {

    @Test
    public void connectionTest() {
        Document doc = new Document("http://example.com");
        Connection connection = Jsoup.newSession();
        doc.connection(connection);
        Assert.assertEquals(connection, doc.connection());
    }

}