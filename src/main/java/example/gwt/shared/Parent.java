package example.gwt.shared;

import java.io.Serializable;
import java.util.List;

public class Parent implements Serializable {

    private static final long serialVersionUID = 1L;

    private Child child;

    private List <Child> children;

    public Parent() {
    }

    public Parent(final Child child, final List <Child> children) {
        this.child = child;
        this.children = children;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(final Child child) {
        this.child = child;
    }

    public List <Child> getChildren() {
        return children;
    }

    public void setChildren(final List <Child> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "[" + child + "], " + children;
    }

}
