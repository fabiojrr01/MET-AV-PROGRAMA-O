package Model;

public class ArquivosUniesp {

	private String arquivos ;
	
	public void SetArquivos (String arquivosASalvar) {
		this.arquivos= arquivosASalvar;
	}
	public String getArquivo() {
		return this.arquivos;
				
	}
	
	public Memento salvarArquivoMemento() {
		return new Memento (arquivos);
	}
	
	public void getArquivoSalvoMemento ( Memento ultimoArquivo) {
		arquivos= ultimoArquivo.getArquivo();
	}
}
