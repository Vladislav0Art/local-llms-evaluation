package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedVisitAssignExprReturnStatementWithAssignmentTest {

    @Test
    public void visitAssignExprReturnStatementWithAssignmentTest() {
        AssingExpr assignExpr = new AssingExpr(new Expression(), new Expression());
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Printer printer = new CollectingPrinter(outContent);
        visitor.visit(assignExpr, printer);
        String result = outContent.toString();
        assertThat(result, is("result = Expression"));
    }

}