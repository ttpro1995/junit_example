/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple_program;

/**
 *
 * @author Thien
 */
public class Plus {
    private final int c;
    public Plus(int c) {
        this.c = c;
    }
    
    
    public int result(int a, int b){ // 3 and 4
        int r = 0;
        if (a > b) {
           r = a + b;
        } else{
           r = a - b ;
        }
        if (r < this.c){
            r = r + this.c;
        }
        return r;    
    }
}
