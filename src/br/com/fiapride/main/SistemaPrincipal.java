package br.com.fiapride.main;
import br.com.fiapride.model.PaletaDeSombra;
public class SistemaPrincipal {
   public static void main(String[] args) {
       // Paleta funcionando
       PaletaDeSombra minhaPaleta =
               new PaletaDeSombra("Matte", 8, 12, 16);
       // Paleta da amiga
       PaletaDeSombra paletaDaAmiga =
               new PaletaDeSombra("Cintilante", 6, 8, 9);
       System.out.println("=== TESTE DO SISTEMA ===");
       // Testando paleta funcionando
       System.out.println("\nMinha paleta:");
       minhaPaleta.aplicarSombra(3);
       minhaPaleta.esfumarSombra(2);
       // Quebrando a segunda paleta
       System.out.println("\nPaleta da amiga:");
       paletaDaAmiga.quebrarPaleta();
       // Tentando usar quebrada
       paletaDaAmiga.aplicarSombra(2);
       // Reparando e usando novamente
       paletaDaAmiga.repararPaleta();
       paletaDaAmiga.aplicarSombra(2);
       // Teste inválido
       System.out.println("\nTeste inválido:");
       minhaPaleta.aplicarSombra(-1);
   }
}