package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedExpectFormNoMatchTest {

    @Test
    public void expectFormNoMatchTest() {
        Document document = Jsoup.parse("<form id='form1'><input name='city' /></form><form id='form2'></form>");
        document.expectForm("#form3");
    }

}