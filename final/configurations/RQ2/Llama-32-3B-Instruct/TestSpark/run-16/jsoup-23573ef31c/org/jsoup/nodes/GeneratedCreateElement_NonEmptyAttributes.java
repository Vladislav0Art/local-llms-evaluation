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

public class GeneratedCreateElement_NonEmptyAttributes {

    public static void main(String[] args) {
        System.out.println("Running " + new java.util.Scanner(System.in).nextLine());
    }

    @Test
    public void createElement_NonEmptyAttributes() {
        Element element = document.createElement("a");
        assertEquals(0, element.attributes().size());
    }
}

public class FormElement extends org.jsoup.nodes.Element {

    public FormElement() {
    }

    public String expectForm(String cssQuery) {
        return null;
    }
}

}