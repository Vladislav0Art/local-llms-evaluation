package org.jsoup.nodes;

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
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;

public class GeneratedConnection_NullConnection {

    public static void main(String[] args) {
        System.out.println("Running " + new java.util.Scanner(System.in).nextLine());
    }

    @Test
    public void connection_NullConnection() {
        Connection connection = null;
        Document document = Document.createShell("https://example.com");
        document.connection(connection);
    }

}