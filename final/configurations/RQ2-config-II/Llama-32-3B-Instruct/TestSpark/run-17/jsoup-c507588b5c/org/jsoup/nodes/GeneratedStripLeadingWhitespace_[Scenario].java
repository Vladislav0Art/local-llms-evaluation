package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedStripLeadingWhitespace_[Scenario]{

@Test
public void stripLeadingWhitespace_[
Scenario](){
String text = " \t\r\n";
String expectedOutput = "";

assertEquals(expectedOutput, StringUtil.stripLeadingWhitespace(text));
        }

        }