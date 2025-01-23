package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.DocumentType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.Node.NodeType.COMMENT;
import static org.jsoup.nodes.Node.NodeType.DATA;
import static org.jsoup.nodes.Node.NodeType.DOCUMENT_TYPE;
import static org.jsoup.nodes.Node.NodeType.ENTITY;
import static org.jsoup.nodes.Node.NodeType.TEXT;
import static org.jsoup.nodes.Node.NodeType.ELEMENT;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

}