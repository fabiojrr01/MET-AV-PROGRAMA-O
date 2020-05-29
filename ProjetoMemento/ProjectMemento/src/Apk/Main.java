package Apk;
import Model.ArquivosSalvos;
import Model.ArquivosUniesp;


public class Main {
	
	public static void main (String [] args) {
		ArquivosUniesp Arq = new ArquivosUniesp();
		ArquivosSalvos Arq1 = new ArquivosSalvos ();
		
		
		
		Arq.SetArquivos("Arquivo Aluno 1");
		Arq1.add(Arq.salvarArquivoMemento());
		
		Arq.SetArquivos("Arquivo Aluno 2");
		Arq1.add(Arq.salvarArquivoMemento());
		
		
		Arq.SetArquivos("Arquivo Atual");
		System.out.println("Arquivo Atual" + Arq.getArquivo());
		
		Arq.getArquivoSalvoMemento(Arq1.get(0));
		System.out.println("Primeiro Arquivo Salvo:"+ Arq.getArquivo());
		Arq.getArquivoSalvoMemento(Arq1.get(1));
		System.out.println("Segundo Arquivo Salvo: "+ Arq.getArquivo());
		
		
		
		
		
	}

}
