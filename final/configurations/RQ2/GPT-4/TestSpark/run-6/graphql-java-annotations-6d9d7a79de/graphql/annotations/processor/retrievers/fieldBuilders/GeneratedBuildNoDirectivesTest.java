package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import org.junit.Assert;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class GeneratedBuildNoDirectivesTest {

    @Test
    public void buildNoDirectivesTest() throws NoSuchMethodException {
        Method method = MyClass.class.getMethod("myMethod");
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(method, container);

        GraphQLDirective[] directives = builder.build();

        Assert.assertArrayEquals(directives, new GraphQLDirective[0]);
    }

    private static class MyClass {
        public void myMethod() {
        }
    }

}