package com.besse.klapprim;

/**
 * Created for klapprim
 * User: jonasbirgersson
 * Date: 2014-12-17
 * Time: 5:40 PM
 */
public class Gift {

    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
