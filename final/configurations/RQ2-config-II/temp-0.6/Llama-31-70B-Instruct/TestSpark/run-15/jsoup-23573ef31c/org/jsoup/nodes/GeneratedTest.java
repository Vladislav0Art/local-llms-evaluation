package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class GeneratedTest {

    private Document document;

    @BeforeClass
    public static void setUpClass() {
        // Setup code before running all tests
    }

    @AfterClass
    public static void tearDownClass() {
        // Teardown code after running all tests
    }

    @Before
    public void setUp() {
        // Setup code before running each test
        document = new Document("http://example.com");
    }

    @After
    public void tearDown() {
        // Teardown code after running each test
    }

    @Test
    public void createShellTest() {
        Document shell = Document.createShell("http://example.com");
        Assert.assertNotNull(shell);
    }

    @Test
    public void locationTest() {
        String location = document.location();
        Assert.assertEquals("http://example.com", location);
    }

}