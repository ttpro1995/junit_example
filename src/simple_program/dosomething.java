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
public class dosomething {
        public static int dosomething(int a, int b, int x) {
            if (a > 1 && b == 0)
                x = x / a ;

            if (a == 2 && x > 1)
                x = x + 1;
            else
                x = x - 1;
                return x;
            }
}
