package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class GeneratedBuildNoAnnotationsTest {

    public class MyClass {
        public String myField;
    }

    @Test
    public void buildNoAnnotationsTest() throws NoSuchFieldException {
        Field myField = MyClass.class.getField("myField");
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(myField, container);
        GraphQLDirective[] directives = directivesBuilder.build();

        Assert.assertEquals(0, directives.length);
    }

}