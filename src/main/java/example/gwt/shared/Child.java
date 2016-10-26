package example.gwt.shared;

import java.io.Serializable;

public class Child implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    public Child() {
    }

    public Child(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

}
