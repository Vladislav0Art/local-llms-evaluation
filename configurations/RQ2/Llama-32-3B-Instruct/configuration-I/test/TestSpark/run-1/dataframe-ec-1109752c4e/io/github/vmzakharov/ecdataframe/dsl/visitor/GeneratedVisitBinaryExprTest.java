package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr expr = new BinaryExpr() {
            @Override
            public String toString() {
                return "testBinaryExpr";
            }
        };
        when(expr.toString()).thenReturn("testBinaryExpr");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitBinaryExpr(expr);
        assertEquals("testBinaryExpr", expr.toString());
    }

}

class Printer {
    public void println(String msg) {
    }
}

public class Expression {
    public String toString() {
    }
}

public class AssigningExpr {
    public String toString() {
    }
}

public class BinaryExpr {
    public String toString() {
    }

}