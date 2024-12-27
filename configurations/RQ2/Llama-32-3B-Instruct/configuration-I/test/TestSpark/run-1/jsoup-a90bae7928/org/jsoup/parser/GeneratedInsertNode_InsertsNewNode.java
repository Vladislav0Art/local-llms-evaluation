package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedInsertNode_InsertsNewNode {

    @Test
    public void insertNode_InsertsNewNode() {
        Node node = new Node(0, 10, null, "");
        new XmlTreeBuilder().insertNode(node);
    }

}