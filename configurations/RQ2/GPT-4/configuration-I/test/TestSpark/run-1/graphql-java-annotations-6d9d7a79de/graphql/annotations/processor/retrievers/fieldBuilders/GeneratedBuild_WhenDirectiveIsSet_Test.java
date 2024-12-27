package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.AnnotatedElement;

import graphql.annotations.processor.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import graphql.annotations.annotationTypes.GraphQLDirective;
import org.mockito.Mockito;

import java.lang.reflect.Field;

public class GeneratedBuild_WhenDirectiveIsSet_Test {

    class DirectivesBuilderExtended extends DirectivesBuilder {

        private boolean isDirectiveSet = false;

        public DirectivesBuilderExtended(AnnotatedElement object, ProcessingElementsContainer container) {
            super(object, container);
        }

        @Override
        public GraphQLDirective[] build() {
            return isDirectiveSet ? new GraphQLDirective[1] : new GraphQLDirective[0];
        }

        public void setDirective() {
            isDirectiveSet = true;
        }
    }

    @Test
    public void build_WhenDirectiveIsSet_Test() {
        AnnotatedElement object = AnnotatedElement.class;
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilderExtended directivesBuilder = new DirectivesBuilderExtended(object, container);

        // Set the directive and test whether it was set correctly
        directivesBuilder.setDirective();

        Assert.assertNotNull(directivesBuilder.build());
        Assert.assertEquals(1, directivesBuilder.build().length);
    }

}