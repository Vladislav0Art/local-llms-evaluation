package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.jsoup.nodes.Node.NodeType;
import org.jsoup.nodes.NodeType.COMMENT;
import org.jsoup.nodes.NodeType.DATA;
import org.jsoup.nodes.NodeType.DOCUMENT_TYPE;
import org.jsoup.nodes.NodeType.ENTITY;
import org.jsoup.nodes.NodeType.TEXT;
import org.jsoup.nodes.NodeType.ELEMENT;

@RunWith(JUnit4.class)
public class GeneratedTest {

}