package br.com.fiapride.main;

import br.com.fiapride.model.Paletadesombra;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // Primeira paleta
        Paletadesombra minhaPaleta = new Paletadesombra();
        minhaPaleta.acabamento = "Matte";
        minhaPaleta.nivelPigmentacao = 8;
        minhaPaleta.horasDuracao = 12;
        minhaPaleta.quantidadeCores = 16;
        minhaPaleta.estaQuebrada = false;

        // Segunda paleta
        Paletadesombra paletaDaAmiga = new Paletadesombra();
        paletaDaAmiga.acabamento = "Cintilante";
        paletaDaAmiga.nivelPigmentacao = 6;
        paletaDaAmiga.horasDuracao = 8;
        paletaDaAmiga.quantidadeCores = 9;
        paletaDaAmiga.estaQuebrada = true;

        System.out.println("--- Sistema de Paletas ---");

        System.out.println("Minha paleta: " 
                + "\nAcabamento: " + minhaPaleta.acabamento
                + "\nPigmentação: " + minhaPaleta.nivelPigmentacao
                + "\nDuração (horas): " + minhaPaleta.horasDuracao
                + "\nQuantidade de cores: " + minhaPaleta.quantidadeCores
                + "\nEstá quebrada? " + minhaPaleta.estaQuebrada
                + "\n");

        System.out.println("Paleta da amiga: " 
                + "\nAcabamento: " + paletaDaAmiga.acabamento
                + "\nPigmentação: " + paletaDaAmiga.nivelPigmentacao
                + "\nDuração (horas): " + paletaDaAmiga.horasDuracao
                + "\nQuantidade de cores: " + paletaDaAmiga.quantidadeCores
                + "\nEstá quebrada? " + paletaDaAmiga.estaQuebrada);
    }
}