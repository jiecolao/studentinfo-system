
package com.plm.sis;

import com.plm.sis.database.*;
import com.plm.sis.frames.*;

public class Main {

    static DBaccess db = new DBaccess();
    static LoginForm lf;
    
    public static void main(String[] args) {
        db.createDB();
        lf = new LoginForm();
        lf.setVisible(true);
    }
}
