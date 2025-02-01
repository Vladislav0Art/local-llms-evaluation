package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.select.Selector;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedExpectFormTest {

    @Test
    public void expectFormTest() {
        Document doc = Jsoup.parse("<form id='login'></form>");
        doc.expectForm("not_exist_form");
    }

}