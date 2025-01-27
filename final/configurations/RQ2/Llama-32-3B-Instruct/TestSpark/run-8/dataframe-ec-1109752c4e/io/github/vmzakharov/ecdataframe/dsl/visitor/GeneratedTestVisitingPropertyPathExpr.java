package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitingPropertyPathExpr {

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
    public void testVisitingPropertyPathExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        PropertyPathExprNoValue expr = new PropertyPathExprNoValue();
        expr.accept(visitor);
        assertEquals(2, visitor.getCollectedPrinter().getCount());
    }
}

}