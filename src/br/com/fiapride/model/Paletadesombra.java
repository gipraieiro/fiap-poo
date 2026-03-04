package br.com.fiapride.model;
public class PaletaDeSombra {
   // Atributos
   private String acabamento;
   private int nivelPigmentacao;
   private int horasDuracao;
   private int quantidadeCores;
   private boolean estaQuebrada;
   // Construtor
   public PaletaDeSombra(String acabamento, int nivelPigmentacao,
                         int horasDuracao, int quantidadeCores) {
       this.acabamento = acabamento;
       this.nivelPigmentacao = nivelPigmentacao;
       this.horasDuracao = horasDuracao;
       this.quantidadeCores = quantidadeCores;
       this.estaQuebrada = false;
   }
   // Aplicar sombra
   public void aplicarSombra(int intensidade) {
       if (intensidade <= 0) {
           System.out.println("Erro: intensidade inválida.");
           return;
       }
       if (estaQuebrada) {
           System.out.println("Erro: a paleta está quebrada.");
           return;
       }
       if (horasDuracao <= 0) {
           System.out.println("Erro: a paleta não possui mais durabilidade.");
           return;
       }
       nivelPigmentacao += intensidade;
       horasDuracao -= 1;
       System.out.println("Sombra aplicada com intensidade " + intensidade);
   }
   // Esfumar sombra
   public void esfumarSombra(int nivelSuavizacao) {
       if (nivelSuavizacao <= 0) {
           System.out.println("Erro: nível inválido para esfumar.");
           return;
       }
       if (nivelPigmentacao <= 0) {
           System.out.println("Erro: não há pigmentação para esfumar.");
           return;
       }
       nivelPigmentacao -= nivelSuavizacao;
       if (nivelPigmentacao < 0) {
           nivelPigmentacao = 0;
       }
       System.out.println("Sombra esfumada com sucesso.");
   }
   // Quebrar paleta
   public void quebrarPaleta() {
       estaQuebrada = true;
       System.out.println("A paleta foi quebrada!");
   }
   // Reparar paleta
   public void repararPaleta() {
       if (!estaQuebrada) {
           System.out.println("A paleta já está em perfeito estado.");
           return;
       }
       estaQuebrada = false;
       System.out.println("A paleta foi reparada com sucesso!");
   }
}