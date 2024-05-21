
package com.plm.sis;

import com.plm.sis.database.*;

public class Main {

    static DBaccess db = new DBaccess();
    
    public static void main(String[] args) {
        db.createDB();
        System.out.print("DONE");
    }
}
