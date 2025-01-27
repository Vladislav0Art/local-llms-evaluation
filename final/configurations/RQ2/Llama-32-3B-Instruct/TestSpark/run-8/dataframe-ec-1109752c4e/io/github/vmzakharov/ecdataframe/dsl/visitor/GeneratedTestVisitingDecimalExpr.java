package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitingDecimalExpr {

    @Override
    public void accept(PrettyPrintVisitor visitor) {
        visitor.visit(this);
    }
}

public class PropertyPathExprNoValue extends Expr {
    @Override
    public void accept(PrettyPrintVisitor visitor) {
        visitor.visit(this);
    }
}

public class AliasExprNoValue extends Expr {
    @Override
    public void accept(PrettyPrintVisitor visitor) {
        visitor.visit(this);
    }
}

public class DecimalExprNoValue extends Expr {
    @Override
    public void accept(PrettyPrintVisitor visitor) {
        visitor.visit(this);
    }
}

public class VisitingUnaryExprTest {

    @Test
    public void testVisitingDecimalExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        DecimalExprNoValue expr = new DecimalExprNoValue();
        expr.accept(visitor);
        assertEquals(4, visitor.getCollectedPrinter().getCount());
    }

}