package com.movieticket;
import com.movieticket.controller.*;
import com.movieticket.model.*;
import com.movieticket.view.*;

/**
 * Hello world!
 *
 */
public class  Main
{
    public static void main( String[] args )
    {
        Database database = new Database();
        Dashboard dashboard = new Dashboard(database);

        dashboard.banner();
        dashboard.display(0);

        // reg.userForm();
        // reg.addUser();
        // reg.userForm();
        // reg.addUser();

    }
}
