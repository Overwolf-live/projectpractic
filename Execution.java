/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *
 */
public class Execution {
    
    private Execution(){
        
    }
    
    public static void Execute(){
        CheckingAccount John = new CheckingAccount(1000, 500);      
        
        try{
            John.withdraw(400);
        }catch(OverdraftException ex){
            System.out.println(ex.getDeficit());
        }
      
    }
    
}
