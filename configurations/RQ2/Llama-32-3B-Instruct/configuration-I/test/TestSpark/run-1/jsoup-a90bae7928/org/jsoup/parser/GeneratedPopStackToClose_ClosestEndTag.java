package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedPopStackToClose_ClosestEndTag {

    @Test
    public void popStackToClose_ClosestEndTag() {
        Token endTag = new Token(0, 10, "</tag", "");
        new XmlTreeBuilder().popStackToClose(endTag);
    }

}