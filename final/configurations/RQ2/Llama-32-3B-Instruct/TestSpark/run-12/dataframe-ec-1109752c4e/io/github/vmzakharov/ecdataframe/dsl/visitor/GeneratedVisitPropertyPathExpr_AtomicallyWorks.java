package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedVisitPropertyPathExpr_AtomicallyWorks {

    private final Printer printer = new CollectingPrinter();

    @Test
    public void visitPropertyPathExpr_AtomicallyWorks() {
        PropertyPathExpr expr = new PropertyPathExpr(new VarExpr("x"), "y", null, null);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitPropertyPathExpr(expr);
    }
}

class AssigningExpr {
    private final Expression propertyPath;
    private final Expression expression;

    public AssigningExpr(Expression propertyPath, Expression expression) {
        this.propertyPath = propertyPath;
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "AssigningExpr{" +
                "propertyPath=" + propertyPath +
                ", expression=" + expression +
                '}';
    }
}

class CollectingPrinter implements Printer {
    private StringBuilder builder;

    public CollectingPrinter() {
        this.builder = new StringBuilder();
    }

    @Override
    public void print(String value) {
        builder.append(value);
    }

    @Override
    public String toString() {
        return builder.toString();
    }

}