package CI346.test;

import CI346.annotations.DefaultValue;

/**
 * Created by jb259 on 08/12/16.
 */
public class User {

    @DefaultValue("42")
    public int userID;

    @DefaultValue(value="John")
    public String firstName;

    @DefaultValue(value="Doe")
    public String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return String.format("%s %s [%d]", firstName, lastName, userID);
    }

}
