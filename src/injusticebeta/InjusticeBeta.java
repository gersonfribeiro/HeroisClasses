/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package injusticebeta;

import injusticebeta.ligaJustica.Batman;

/**
 *
 * @author Aluno
 */
public class InjusticeBeta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Batman batman = new Batman();
        batman.surgimento();
        
        Batman batmanQueSorri = new Batman();
        batmanQueSorri.surgimento();
        
        CamposBatalha combate = new CamposBatalha();
        combate.batalha(batman, batmanQueSorri);
    }
    
}
