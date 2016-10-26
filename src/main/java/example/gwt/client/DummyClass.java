/*
 * Created: 2016/10/19 dewa
 * Copyright (c) 2016, NS Solutions Corporation, All rights reserved.
 */

package example.gwt.client;

import java.util.Objects;

/**
 * @author dewa
 */
public class DummyClass {

    private String name;

    /**
     * @return the name
     */
    public String getName() {
        return add();
        // return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(final String name) {
        this.name = name;
    }

    public String add() {
        return Objects.requireNonNull(name);
    }

}
