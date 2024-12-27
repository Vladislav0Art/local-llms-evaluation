package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedFramesetOk FramesetIsCheckedCorrectly {

    @Test
    public void framesetOk

    FramesetIsCheckedCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        boolean framesetOk = true;
        builder.framesetOk(framesetOk);
        assertTrue(framesetOk);
    }

}