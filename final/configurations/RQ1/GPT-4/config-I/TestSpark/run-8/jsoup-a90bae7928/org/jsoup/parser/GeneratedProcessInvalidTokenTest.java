package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.*;
import org.junit.Assert;

import static org.junit.Assert.*;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.List;

public class GeneratedProcessInvalidTokenTest {

    @Test
    public void processInvalidTokenTest() throws NoSuchFieldException, IllegalAccessException {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token token = new Token() {
            @Override
            TokenType type() {
                return null;
            }
        };
        treeBuilder.process(token);
    }

}