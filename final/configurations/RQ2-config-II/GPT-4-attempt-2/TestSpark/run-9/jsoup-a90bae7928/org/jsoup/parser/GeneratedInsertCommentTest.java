package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import javax.annotation.ParametersAreNonnullByDefault;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertCommentTest {

    @Test
    public void insertCommentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(new Token.Comment("Comment"));

        assertNotNull(xmlTreeBuilder);
    }

}