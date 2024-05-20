/*
    DITO SA CLASS FILE NA TO MAREREGISTER YUNG INFO NG USER UPON LOGIN,
    PRIMARILY THE STUDENT ID (stud_id)

    gamitin mo to as a BASIS/REFERENCE/MODEL para MALAMAN kung KANINONG INFO
    dapat IACCESS sa DATABASE, 
    + and also para MALAMAN MO rin kung KANINONG ROW YUNG DAPAT PAGLAGYAN
    
    USE THE METHODS para MAOBTAIN ung SPECIFIC INFORMATION ng model na to, 
    ADD INFO/METHODS IF NECESSARY

    FOR EXAMPLE: Kapag nag login ako as 202212345, masasave yung id nayon dito
                 and itong file na to will serve as our BASIS/REFERENCE/MODEL 
                 sa info ng GUMAGAMIT na user.

*/


package com.plm.sis.model;

public class User {
    
    private final int stud_id;
    
    public User(int stud_id){
        this.stud_id = stud_id;
    }
    
    
    // ===== METHODS PARA MAKUHA VALUES =====
    public int getID(){
        return stud_id;
    }
    
    
}
