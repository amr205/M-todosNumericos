/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosnumericos;

import java.util.Scanner;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

/**
 *
 * @author Alejandro Medina
 */
public class MetodosNumericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int varX = 4;
        int varY = 5;
        
        
        GrahpicPane gp = new GraphicPane();
        
        Scanner scan = new Scanner(System.in);
        String exp = scan.nextLine();
        
        double result = new ExpressionBuilder(exp)
        .variables("x","y")
        .build()
        .setVariable("x", varX)
        .setVariable("y", varY)
        .evaluate();
        
        
        System.out.println("resultado: "+result);

    }
    
}
